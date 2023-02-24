package com.spring.restapi.controller;

import com.spring.restapi.entities.Course;
import com.spring.restapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/home")
    public String getHome(){
         List<Course> list;
       list =  getCourses();
       //System.out.println(list.get(0).getTitle());
        String myPage="<table border=\"2\" >" +
                "  <tr>" +
                "    <th>Id</th>\n" +
                "    <th>Title</th>  \n" +
                "    <th>Description</th>\n" +
                "  </tr>";
        String tdstring ="";
        for(int i=0;i<list.size();i++){
            tdstring = tdstring +" <tr> <td>" + list.get(i).getId()+
                    "</td>\n" +
                    "    <td>" +list.get(i).getTitle()+
                    "</td>\n" +
                    "    <td>"+list.get(i).getDescription()+
                    "</td>\n</tr>";

        }
        String tdend ="</table>";

        myPage = myPage+tdstring+tdend;


        return myPage;
    }
    //Get all the courses
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourses(){
return this.courseService.getCourses();
    }
}
