package com.mindtree.College.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.College.VO.*;
import com.mindtree.College.entity.*;
import com.mindtree.College.repository.*;

@Component
public class CollegeImpl {
	@Autowired
	CollegeRepository collRepo;
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public College add(College coll) {
		return collRepo.save(coll);
	}

	@Override
	public List<College> list() {
		return collRepo.findAll();
	}

	@Override
	public College update(long id, String name) {
		College coll = collRepo.findById(id);
		coll.setName(name);
		return collRepo.save(coll);
	}

	@Override
	public College searchById(long id) {
		if(collRepo.findById(id)==null)
		{
			return null;
		}
		return collRepo.findById(id);
	}

	@Override
	public List<RequestTemplate> listWithStu() {
		List<RequestTemplate> fullList = new ArrayList<RequestTemplate>();
		List<College> allDept = this.list();
		Iterator<College> ir = allColl.iterator();
		while(ir.hasNext())
		{
			College col = ir.next();
			ResponseEntity<Student[]> response =
					  restTemplate.getForEntity(
							  "http://STUDENT-SERVICE/student/student-with-ascname/"+col.getId(),
					  Student[].class);
			Student[] students = response.getBody();
			List<Student> stus = Arrays.asList(students);
 			RequestTemplate RTm = new RequestTemplate();
			RTm.setCollege(col);
			RTm.setStudentList(stus);
			fullList.add(RTm);
		}
		return fullList;
	}

	@Override
	public RequestTemplate specificCollStudent(long coll_id) {
		College college  = this.searchById(coll_id);
		
		ResponseEntity<Student[]> response =
				  restTemplate.getForEntity(
						  "http://STUDENT-SERVICE/student/student-with-desc-age/"+student.getId(),
				  Student[].class);
		Student[] student = response.getBody();
		List<Student> students = Arrays.asList(student);
		RequestTemplate requestTemplate = new RequestTemplate();
		
		requestTemplate.setCollege(college);
		requestTemplate.setStudentList(students);
		
		return requestTemplate;
	}
}
