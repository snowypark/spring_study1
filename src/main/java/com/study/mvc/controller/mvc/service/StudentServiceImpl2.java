package com.study.mvc.controller.mvc.service;

import com.study.mvc.controller.mvc.dto.StudentExDto;
import com.study.mvc.controller.mvc.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl2 implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<?> getStudentList() {
        List<StudentExDto> studentDtoList = new ArrayList<>(); // <?> -> Dto
        List<String> studentList = studentRepository.getStudentListAll();

        for(String studentName : studentList) {
            studentDtoList.add(new StudentExDto(studentName));
        }

        return studentDtoList;
    }

    @Override
    public Object getStudent(int index) {
        String studentName = studentRepository.findStudentNameByIndex(index);
        return new StudentExDto(studentName);
    }

}
