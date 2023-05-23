package com.example.response;

import com.example.entity.Student;

// import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonProperty;

// import lombok.AllArgsConstructor;
import lombok.Getter;
// import lombok.NoArgsConstructor;
import lombok.Setter;

// import org.springframework.beans.factory.annotation.Value;

// @AllArgsConstructor
// @NoArgsConstructor
@Getter //lambok class gets rid of the boilerplate code.
@Setter
public class StudentResponse {

    // @JsonIgnore //this is used when we don't want the id as a response, hence ignorre it. from jackson library.
    // private long id;

    // // @JsonProperty("first_name") //if we want to change the key that is being passed in the response.
    // private String firstName;
    // private String lastName;

    // @Value("${app.name}")
    // public String appNam;
    
    // public StudentResponse(long id, String firstName, String lastName) {
    //     this.id = id;
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    // }

    // public long getId() {
    //     return id;
    // }
    // public void setId(long id) {
    //     this.id = id;
    // }
    // public String getFirstName() {
    //     return firstName;
    // }
    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }
    // public String getLastName() {
    //     return lastName;
    // }
    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }

    private long id;

    private String firstName;
    private String lasttName;
    private String email;

    public StudentResponse (Student student) {
        this.id = student.getId();
        // this.firstName = student.getFirstName();
        // this.lasttName = student.getLastName();
        // this.email = student.getEmail();

    }


}
