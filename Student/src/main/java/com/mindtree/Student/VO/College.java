package com.mindtree.Student.VO;

public class College {

	private String name;
	private int noOfStu;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfStu() {
		return noOfStu;
	}
	public void setNoOfStu(int noOfStu) {
		this.noOfStu = noOfStu;
	}
	public College(String name, int noOfStu) {
		super();
		this.name = name;
		this.noOfStu = noOfStu;
	}
	public College() {
		super();
    }
}
