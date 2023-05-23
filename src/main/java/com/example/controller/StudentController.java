package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// import com.example.response.StudentResponse;
import com.example.service.StudentService;
import com.example.entity.Student;


@RestController // combines @Controller & @ResponseBody ==> annotated with these , no need to annotate controller to the response body.
@RequestMapping("/api/student/") // prefix of each and every API.
public class StudentController {

    // @Value("${app.name:Default Demo App}")// Spring @Value annotation is used to assign default values to variables and method arguments. We can read spring environment variables as well as system variables using @Value annotation.
    // private String appName;//@Value only works with spring managed beans i.e classes with annotations like @controller, @service. not with bojo file.

    // @GetMapping("/get") //Annotation for get APIs
    // // @RequestMapping(value = "/get", method = RequestMethod.GET)
    // public StudentResponse getStudent () { //spring boot automatically converts this java object into JSON, don't need to manually do it.
    //     StudentResponse studentResponse = new StudentResponse(1, "Shristi", "Singh");
    //     return studentResponse;
    // }

    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents () {
        return studentService.getAllStudents();
    }
}
