/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao.student;

import com.bulletinspace.bulletindao.domain.Person;
import com.bulletinspace.bulletindao.domain.PersonDao;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


@Controller
public class StudentController {

    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-servlet.xml");
     
        StudentDao s = context.getBean(StudentDao.class);
        List<Student> studentAs = s.getAllStudents();
        for (Student stu: studentAs) {
            System.out.println("Person: " + stu.toString());
        }
    }
}

