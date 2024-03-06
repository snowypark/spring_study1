package com.study.mvc.controller.mvc.service;

import com.study.mvc.controller.mvc.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class CarServiceImpl implements CarService{

    final String componentName = "a";

    @Autowired
    @Qualifier(componentName)
    private CarRepository carRepository;

    @Override
    public String getCarNames() {

        return String.join(", ", carRepository.getCraNames());
        // 문자열 : k3, k5
    }

    @Override
    public int addCar(String carName) {
        return 0;
    }
}
