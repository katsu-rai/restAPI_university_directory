package com.example.university_directory.service;


import com.example.university_directory.model.Person;
import com.example.university_directory.model.Student;
import com.example.university_directory.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.google.gson.Gson;

@RestController
@RequestMapping("/directory")
public class DirectoryController {

    Person person;
    List<Person> directory = new ArrayList<Person>();

    @PostMapping
    public String PostPerson(@RequestBody String body) {
//        Gson gson = new Gson();
//        // Define type for the map (key: String, value: Object)
//        Type type = com.google.gson.reflect.TypeToken.getParameterized(Map.class, String.class, Object.class).getType();
//
//        // Parse JSON string into a Map
//        Map<String, Object> jsonMap = gson.fromJson(body, type);

        Gson gson = new Gson();

        if (body.contains("major")) {
            Teacher teacher = gson.fromJson(body, Teacher.class);
            directory.add(teacher);
            return "Teacher Added Successfully";
        }
        else if (body.contains("year")) {
            Student student = gson.fromJson(body, Student.class);
            directory.add(student);
            return "Student Added Successfully";
        }
        else {
            // Handle other cases if necessary
            return "Invalid person type";
        }
    }

    @GetMapping
    public Object GetPerson(@RequestParam Integer id){
        System.out.println(id);
        for(Person eachPerson: directory){
            if(Objects.equals(id, eachPerson.getId())){
                return eachPerson;
            }
        }
        System.out.println("Could not find the ID");
        return "Not Found";
    }

}
