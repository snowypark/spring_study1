package com.study.mvc.controller;

import com.study.mvc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// 순서: Controller -> Repository -> Service

@RestController
@RequiredArgsConstructor
public class StudentRestController {

    // get /students - 응답: ok [{"name": "ㅇㅇㅇ"}]
    // get /student/0 - 응답: ok {"name": "ㅇㅇㅇ"}

    @Autowired
    @Qualifier("studentServiceImpl2")
    private StudentService studentService;

    @GetMapping("/ex/students")
    public ResponseEntity<?> students()  throws NullPointerException{
        studentService.getStudentList();
        return ResponseEntity.ok(studentService.getStudentList());
    }

    @GetMapping("/ex/student/{index}")
    public ResponseEntity<?> student(@PathVariable int index) {

        return ResponseEntity.ok(studentService.getStudent(index));
    }

}
