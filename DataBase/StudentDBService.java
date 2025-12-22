package com.database.student_demo.controller;


import com.database.student_demo.model.StudentDatabase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentdb")
public class StudentDBService {

    StudentDatabase studentDatabase;
  //StudentDatabase: (the class that has studentId, name, address, phone)
  //studentDatabase: It keeps the data in memory while the application is running.”

    @GetMapping("{studentId}")
    public StudentDatabase getStudentDetails(String studentId){
//        return new StudentDatabase("01","Alex",
//                "UK", "9876540321" );

        return studentDatabase;
    }

    @PostMapping
    public String createStudentDetails(@RequestBody StudentDatabase studentDatabase){ 
      // public: Means anyone can call this method from outside the class. In Spring Boot, it allows HTTP requests to access this API
      // String : This is the return type of the method. The method will send back a text message (like “Student Details is Added Successfully”)
      // createStudentDetails: This is the name of the method. to create/add new student details
      // @RequestBody: Means “take data sent by the user in the request body. Converts JSON from Postman → Java object automatically
      // StudentDatabase → the class type that stores student info 
      // studentDatabase → method variable that temporarily holds the data coming from user
        this.studentDatabase=studentDatabase;
      // studentDatabase receives the data from the user like name, id, address, and phone number, and this data is saved into the controller’s class variable this.studentDatabase.
        return "Student Details is Added Successfully";
      
    }

    @PutMapping
    public String updateStudentDetails(@RequestBody StudentDatabase studentDatabase){
        this.studentDatabase=studentDatabase;
        return "Student Details is Update Successfully";
    }

    @DeleteMapping
    public String deleteStudentDetails(String studentId){ //Method 
        this.studentDatabase=null; // This line removes the student data. null means no data / empty.
        return "Student Details is Delete Successfully";
    }



}
