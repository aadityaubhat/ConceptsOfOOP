package edu.neu.csye6200.university;

import java.util.EmptyStackException;
import java.util.Vector;

public class Course {
	private String name;
	private Vector<Teacher> teachers = new Vector<Teacher>(); 
	private Vector<Student> students = new Vector<Student>();
	
	/**
	 * Constructor for course
	 * @param name Course name
	 * @param teachers Teachers teaching the course
	 * @param students Students in the course
	 */
	public Course(String name, Vector<Teacher> teachers, Vector<Student> students) {
		this.name = name;
		this.teachers = teachers;
		this.students = students;
		if (this.teachers.size() > 3 || this.students.size() > 5){
			throw new EmptyStackException();
		}
		if(this.teachers.size() < 1 || this.students.size() < 1){
			throw new EmptyStackException();
		}
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Course name getter
	 * @return Course name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Course name setter
	 * @param name Course name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Print Teacher list
	 */
	public void getTeachers(){
		for(Teacher teacher:this.teachers){
			System.out.println(teacher.getFirst_name()+" "+teacher.getLast_name());
		}
	}
	
	/**
	 * Print Student list
	 */
	public void getStudents(){
		for(Student student:this.students){
			System.out.println(student.getFirst_name()+" "+student.getLast_name());
		}
	}

}
