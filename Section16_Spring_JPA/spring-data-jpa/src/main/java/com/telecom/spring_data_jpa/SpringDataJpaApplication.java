package com.telecom.spring_data_jpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.telecom.spring_data_jpa.model.Student;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        // StudentRepo repo = context.getBean(StudentRepo.class);
        StudentRepo repo = context.getBean(StudentRepo.class);

        // ------------------------------
        //Adding a student to database
        // Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        // Student s3 = context.getBean(Student.class);

        // s1.setRollno(101);
        // s1.setName("Navin");
        // s1.setMarks(75);

        s2.setRollno(102);
        s2.setName("Kiran");
        s2.setMarks(65);

        // s3.setRollno(103);
        // s3.setName("Harsh");
        // s3.setMarks(70);

        // repo.save(s1);
        // repo.save(s2);
        // repo.save(s3);

        //------------------------
        //Get all records
        // System.out.println(repo.findAll());

        //-----------------------------
        //Find by Id
        // System.out.println(repo.findById(104));
        // Optional<Student> s = repo.findById(104);
        // System.out.println(s.orElse(new Student()));

        //find by name ---------------------
        // System.out.println(repo.findByName("Navin"));

        //find by marks -----------------
        // System.out.println(repo.findByMarks(70));

        //find by marks greater than
        // System.out.println(repo.findByMarksGreaterThan(70));

        //Update student
        // repo.save(s2); //update existing record

        //Delete student
        repo.delete(s2);
	}

}
