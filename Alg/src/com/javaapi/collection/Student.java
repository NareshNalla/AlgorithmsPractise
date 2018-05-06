package com.javaapi.collection;
class Student implements Comparable<Student>{
	int age;
	String name;
	Student(int age, String name){
		this.name = name;
		this.age = age;
	}
	/*@Override
	public int compareTo(Student o) {
				return this.age -o.age;
	}*/
	@Override
	public int compareTo(Student o) {
		if(this.name == o.name)	{
			return 0;
		}
		return this.age-o.age;
	}
}