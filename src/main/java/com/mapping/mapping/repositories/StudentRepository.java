package com.mapping.mapping.repositories;

import com.mapping.mapping.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    @Query(value = "select id, psp, name from student", nativeQuery = true)

    List<Student> findAllStudentsPspAndBrand();
}
