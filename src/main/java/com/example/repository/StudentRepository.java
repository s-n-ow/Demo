package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;


@Repository //that we'll use this interface to interact with the DB.
public interface StudentRepository extends JpaRepository<Student, Long> { //entity class, data type of your unique identifier present in the class::mapped to the primamry key of the table....that you marked with @ID annotation in your class.
    //JpaRepository is combination of two other interfaces.
    
    // CrudRepository<T, ID> //using this we can perform crud operations.
    // PagingAndSortingRepository<T, ID> //if you want to perform paging and sorting too, then it has to be extended explicitly.
}

//all the business logic is done in the service layer...read write insert delete everything.