/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bulletinspace.bulletindao.student;

import com.bulletinspace.bulletindao.domain.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;




@Component
public class StudentDao {

    @PersistenceContext private EntityManager em;
    
    @Transactional
    public void persist(Student student) {
        em.persist(student);
    }

    // Retrieves all the guests:
    public List<Student> getAllStudents() {
        TypedQuery<Student> query = em.createQuery(
                "SELECT s FROM Student s ORDER BY s.id", Student.class);
        return query.getResultList();
    }
}
