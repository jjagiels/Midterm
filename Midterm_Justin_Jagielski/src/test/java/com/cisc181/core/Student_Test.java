package com.cisc181.core;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		Course course1 = new Course(UUID.randomUUID(), "CourseOne", 100, eMajor.COMPSI);
		Course course2 = new Course(UUID.randomUUID(), "CourseTwo", 100, eMajor.CHEM);
		Course course3 = new Course(UUID.randomUUID(), "CourseThree", 100, eMajor.BUSINESS);
		
		ArrayList<Course> Courses = new ArrayList<Course>();
		
		Courses.add(course1);
		Courses.add(course2);
		Courses.add(course3);
		
		
		SimpleDateFormat StartS_original = new SimpleDateFormat("yyyy-MM-dd");
		Date StartS = null;
		try {
			StartS = StartS_original.parse("2016-02-01");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleDateFormat EndS_original = new SimpleDateFormat("yyyy-MM-dd");
		Date EndS = null;
		try {
			EndS = EndS_original.parse("2016-05-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SimpleDateFormat StartF_original = new SimpleDateFormat("yyyy-MM-dd");
		Date StartF = null;
		try {
			StartF = StartF_original.parse("2015-09-01");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleDateFormat EndF_original = new SimpleDateFormat("yyyy-MM-dd");
		Date EndF = null;
		try {
			EndF = EndF_original.parse("2015-12-18");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Semester spring = new Semester(UUID.randomUUID(), StartS, EndS);
		Semester fall = new Semester(UUID.randomUUID(), StartF, EndF);
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		
		Semesters.add(spring);
		Semesters.add(fall);
		
		Section Course1S = new Section(course1.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 101);
		Section Course1F = new Section(course1.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 107);
		
		Section Course2S = new Section(course2.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 201);
		Section Course2F = new Section(course2.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 207);
		
		Section Course3S = new Section(course3.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 301);
		Section Course3F = new Section(course3.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 307);
		
		ArrayList<Section> Sections = new ArrayList<Section>();
		
		Sections.add(Course1S);
		Sections.add(Course1F);
		Sections.add(Course2S);
		Sections.add(Course2F);
		Sections.add(Course3S);
		Sections.add(Course3F);
		
		SimpleDateFormat DOB_original = new SimpleDateFormat("yyyy-MM-dd");
		Date DOB = null;
		try {
			DOB = DOB_original.parse("1994-03-11");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Student student1 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student2 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student3 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student4 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student5 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student6 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student7 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student8 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student9 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		Student student10 = new Student("Joe", "Jones", "Shmoe", DOB, eMajor.PHYSICS, "123 coding avenue", "(123)-456-7890", "123@456.com");
		
		ArrayList<Student> Students = new ArrayList<Student>();
		
		Students.add(student1);
		Students.add(student2);
		Students.add(student3);
		Students.add(student4);
		Students.add(student5);
		Students.add(student6);
		Students.add(student7);
		Students.add(student8);
		Students.add(student9);
		Students.add(student10);
		
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
