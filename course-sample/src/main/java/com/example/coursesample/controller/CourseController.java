package com.example.coursesample.controller;

import com.example.coursesample.model.Course;
import com.example.coursesample.service.CourseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CourseController {
    @Autowired
    private CourseService courseService;
    // Ví dụ demo
    // Lấy danh sách tất cả khóa học
    //Xem danh sách tất cả khóa học
    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return courseService.getAll();
    }

    //Xem danh sách khóa học online
    @GetMapping("/courses/online")
    public List<Course> getOnlineCourse() {
        return courseService.getOnlineCourse();
    }

    //Xem danh sách khóa học onlab
    @GetMapping("/courses/onlab")
    public List<Course> getOnlabCourse() {
        return courseService.getOnlabCourse();
    }

    //Lọc khóa học (tiêu đề, chủ đề)
//    @GetMapping("/sort_by_name")
//    public List<Person> sortByName(){
//        return service.sortPersonByName();
//    }
//
//    @GetMapping("/top5_job")
//    public Map<Integer,Set<String>> findTop5Job(){
//        return service.findTop5Job();
//    }
}
