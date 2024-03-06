package com.study.mvc.controller.mvc.repository;

import java.util.List;

public interface CarRepository {

    public List<String> getCraNames();
    public int insertCar(String carName);

}
