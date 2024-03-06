package com.study.mvc.controller.mvc.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    public List<String> studentList = List.of("전주환", "서창현", "예홍렬");

    @Override
    public List<String> getStudentListAll() {
        return studentList;
    }

    @Override
    public String findStudentNameByIndex(int index) {
        return studentList.get(index);
    }

}



