package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exception.PersonException;

public class Staff_Test {

	@Test
	public void salaryAverageTest() {
		
		SimpleDateFormat DOB_original = new SimpleDateFormat("yyyy-MM-dd");
		Date DOB = null;
		try {
			DOB = DOB_original.parse("1985-07-08");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleDateFormat HireDate_original = new SimpleDateFormat("yyyy-MM-dd");
		Date HireDate = null;
		try {
			HireDate = HireDate_original.parse("2015-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Staff staff1 = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 60000.00, HireDate, eTitle.DOCTOR);
		Staff staff2 = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 55000.00, HireDate, eTitle.DOCTOR);
		Staff staff3 = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 68000.00, HireDate, eTitle.DOCTOR);
		Staff staff4 = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 70000.00, HireDate, eTitle.DOCTOR);
		Staff staff5 = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 90000.00, HireDate, eTitle.DOCTOR);
		
		ArrayList <Staff> staffT = new ArrayList <Staff> ();
		
		staffT.add(staff1);
		staffT.add(staff2);
		staffT.add(staff3);
		staffT.add(staff4);
		staffT.add(staff5);
		
		double salaryTotal = 0;
		
		for (Staff salaryTest : staffT){
			salaryTotal += salaryTest.getSalary();
		}
		
		double salaryAverage = salaryTotal/staffT.size();
		
		assertEquals(68600, salaryAverage, 0);
		
	}
	@Test(expected=PersonException.class)
	public void PersonExceptionTest_Date() throws PersonException {
		
		
		
		SimpleDateFormat DOB_original = new SimpleDateFormat("yyyy-MM-dd");
		Date DOB = null;
		try {
			DOB = DOB_original.parse("1785-07-08");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat HireDate_original = new SimpleDateFormat("yyyy-MM-dd");
		Date HireDate = null;
		try {
			HireDate = HireDate_original.parse("2015-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Staff staffBadDOB = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "(123)-456-7890", "123@456.com", "12pm-2pm", 0, 60000.00, HireDate, eTitle.DOCTOR);
	
		staffBadDOB.PrintAge();
		
	}

	@Test(expected=PersonException.class)
	public void PersonExceptionTest_Phone() throws PersonException{
		
		SimpleDateFormat DOB_original = new SimpleDateFormat("yyyy-MM-dd");
		Date DOB = null;
		try {
			DOB = DOB_original.parse("1985-07-08");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		SimpleDateFormat HireDate_original = new SimpleDateFormat("yyyy-MM-dd");
		Date HireDate = null;
		try {
			HireDate = HireDate_original.parse("2015-01-01");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Staff staffBadPhone = new Staff("Joe", "Jones", "Shmoe", DOB, "123 coding avenue", "12345678", "123@456.com", "12pm-2pm", 0, 55000.00, HireDate, eTitle.DOCTOR);
		
		staffBadPhone.PhoneNumberChecker();
		
	}
}
