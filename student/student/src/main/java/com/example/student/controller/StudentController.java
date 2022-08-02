package com.example.student.controller;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.student.service.StudentService;

import java.util.List;

// HTTP mothod : GET, POST, PUT , DELETE
// GET /api/v1/students : Lấy ra danh sách tất cả các sinh viên
// POST /api/v1/students : Tạo mới sinh viên
// GET /api/v1/students/{id} : Lấy thông tin của sinh viên theo id
// PUT /api/v1/students/{id} : Cập nhật thông tin của sinh viên theo id
// DELETE /api/v1/students/{id} : Xóa sinh viên theo id
// GET /api/v1/student/seach?name=nguyenvana : Tìm kiếm sinh viên theo tên

// GET /api/v1/students/{id}/courses : Lấy ra danh sách tất cả khóa học của sinh viên
// POST /api/v1/students/{id}/courses: TẠo mới khóa học của sinh viên theo id

@RestController
@RequestMapping("api/v1")// config cho tất cả bên dưới class
public class StudentController {
    @Autowired
    private StudentService studentService;

    //lấy danh sách tất cả sinh viên
    @GetMapping("/students")
    public List<StudentDto> getAllStudent() {
        return studentService.getAll();
    }

    //lấy thông tin sinh viên theo id
    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    //Xóa sinh viên theo id
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

}
