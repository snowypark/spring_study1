package com.study.mvc.service;

import com.study.mvc.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service()
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Override
    public List<?> getStudentList() {
        List<Map<String, String>> studentMapList = new ArrayList<>(); // 담아줄 List
        List<String> studentList = studentRepository.getStudentListAll();

        for(String studentName : studentList) {
            studentMapList.add(Map.of("name", studentName));
        }

        return studentMapList; //(studentName 반복 -> studentMapList)
    }

    @Override
    public Object getStudent(int index) {
        String studentName = studentRepository.findStudentNameByIndex(index);
        return Map.of("name", studentName);
    }

}
