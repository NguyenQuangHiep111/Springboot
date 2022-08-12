package com.example.coursesample.service;

import com.example.coursesample.model.Course;
import com.example.coursesample.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    // Ví dụ demo
    // Lấy danh sách tất cả khóa học
    public List<Course> getAll() {
        return courseRepository.getAll();
    }

    // Xem danh sách khóa học online
    public List<Course> getOnlineCourse() {
        return courseRepository.getAll()
                .stream()
                .filter(course -> course.getType().equals("online"))
                .collect(Collectors.toList());
    }

    // Xem danh sách khóa học onlab
    public List<Course> getOnlabCourse() {
        return courseRepository.getAll()
                .stream()
                .filter(course -> course.getType().equals("onlab"))
                .collect(Collectors.toList());
    }

//    // findById
//    public List<Course> findById(int id) {
//        return Course.stream().filter(todo -> todo.getId() == id).findFirst();
//    }
}
