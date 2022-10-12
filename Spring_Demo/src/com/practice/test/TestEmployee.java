package com.practice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		   ApplicationContext  context =new ClassPathXmlApplicationContext("beans.xml");
		   Employee employee = (Employee) context.getBean("emlpoyeeBean");
           System.out.println(employee.getEmployeeName());
		}

}
