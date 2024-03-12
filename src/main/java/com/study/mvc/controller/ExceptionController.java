package com.study.mvc.controller;

import com.study.mvc.service.DBStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class ExceptionController {

    @Autowired
    private DBStudyService dbStudyService;

    @PostMapping("/ex")
    public ResponseEntity<?> duplication(@RequestBody Map<String, String> map) {

        dbStudyService.checkDuplicatedByName(map.get("name"));

//        if(dbStudyService.isDuplicated(map.get("name"))) {
//            throw new DuplicatedException("중복된 이름입니다");
//        }

        return ResponseEntity.ok("중복되지 않은 이름입니다.");
    }

}
