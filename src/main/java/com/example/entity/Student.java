package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//the class which will represent the table in the db will call the entity class.

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //must :: this will determine that this is the entity class.
@Table(name = "student")//need to provide the table name that this is representing. mapping of class to table
public class Student {//any class that is representing any table in db must have default constructor::NoArgsConstructor:: by default java provides default contructor.
    
    @Id
    @GeneratedValue
    @Column(name = "id") //mapping of fields to columns. Need to do this for each field.
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}
