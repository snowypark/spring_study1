package com.study.mvc.controller.mvc.repository;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("b")
public class CarRepositoryImpl2 implements CarRepository{


    @Override
    public List<String> getCraNames() {
        return List.of("K3", "K5");
    }

    @Override
    public int insertCar(String carName) {
        System.out.println("등록된 차량: " + carName);
        return 1;
    }
}
