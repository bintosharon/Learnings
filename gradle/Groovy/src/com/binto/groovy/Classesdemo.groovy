package com.binto.groovy

class Patient {
	def firstName, lastName, age  //default by getters and setters
	static hospitalCode="Best hospital in town"
//	void setLastName(lastName) {
//		if(lastName==null) {
//			throw new IllegalArgumentException("Last Name can not be null")
//		}
//		this.lastName=lastName
//	}
	static void display() {
		println hospitalCode
	}
}
p=new Patient(firstName:'John', lastName:'Bailey',age:40)
//p.setLastName("Buffer")
println p.firstName+" "+p.lastName+" "+p.age

Patient.display()