package com.mindtree.College.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.College.VO.*;
import com.mindtree.College.entity.*;

@Service
public interface CollegeService {
	College add(College coll);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);
	List<RequestTemplate> listWithStu();
	RequestTemplate specificCollStudent(long coll_id);
}
