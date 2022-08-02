package com.example.student.service;

import com.example.student.dto.StudentDto;
import com.example.student.exception.NotFoundException;
import com.example.student.mapper.StudentMapper;
import com.example.student.model.Student;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    //Tạo danh sách Students
    private List<Student> students;

    @Autowired
    private ModelMapper modelMapper;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", "A@gmail.com", "123"));
        students.add(new Student(2, "Nguyễn Văn B", "A@gmail.com", "123"));
        students.add(new Student(3, "Nguyễn Văn C", "A@gmail.com", "123"));
    }

    //Lấy danh sách tất cả sinh viên
    public List<StudentDto> getAll() {
        return students.stream().map(student -> modelMapper.map(student, StudentDto.class))
                .collect(Collectors.toList());
    }

    //Lấy thông tin sinh viên theo id
    public StudentDto getStudentById(int id) {
        Optional<Student> studentOptional = students.stream()
                .filter(student -> student.getId() == id).findFirst();

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            return modelMapper.map(student, StudentDto.class);
        }

        throw new NotFoundException("K có sinh viên có id = " + id);
    }

    //Hepper method
    public Optional<Student> findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id).findFirst();
    }


    public List<StudentDto> searchStudent(String name) {
        return null;
    }

    public void deleteStudent(int id) {
        Optional<Student> studentOptional = students.stream()
                .filter(student -> student.getId() == id).findFirst();

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            //return modelMapper.map(student, StudentDto.class);
            students.remove(student);
            return;
        }

        throw new NotFoundException("K có sinh viên có id = " + id);

    }
}
