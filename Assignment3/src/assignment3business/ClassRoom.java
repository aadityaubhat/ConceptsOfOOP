package assignment3business;

import java.util.EmptyStackException;
import java.util.Vector;

public class ClassRoom {
	private int capacity;
	private Vector<Teacher> teachers = new Vector<Teacher>();
	private Vector<Student> students = new Vector<Student>();
	
	/**
	 * ClassRoom constructor
	 * @param cap Capacity of the classroom
	 * @param teachers Teachers for the classroom
	 * @param students Students for the classroom
	 */
	public ClassRoom(int cap, Vector<Teacher> teachers, Vector<Student> students) {
		this.capacity = cap;
		this.teachers = teachers;
		this.students = students;
		if (this.teachers.size() > 2 || this.students.size() > 5){
			throw new EmptyStackException();
		}
		if(this.teachers.size() < 1 || this.students.size() < 1){
			throw new EmptyStackException();
		}
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Classroom capacity getter
	 * @return Classroom capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	
	/**
	 * Classroom capacity setter
	 * @param capacity Classroom capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * Prints Teacher list for the classroom
	 */
	public void getTeachers(){
		for(Teacher teacher:this.teachers){
			System.out.println(teacher.getFirst_name()+" "+teacher.getLast_name());
		}
	}
	
	/**
	 * Prints Student list for the classroom
	 */
	public void getStudents(){
		for(Student student:this.students){
			System.out.println(student.getFirst_name()+" "+student.getLast_name());
		}
	}
	
	/**
	 * Checks if the classroom is overcrowded
	 */
	public void isOverCrowded(){
		//If capacity of the classroom is less than number of students plus 1 (a teacher)
		//Then the classroom is overcrowded
		if(this.capacity < this.students.size()+1){
			System.out.println("The classroom is overcrowded");
		}
		else{
			System.out.println("The classroom is NOT overcrowded");
		}
	}
}
