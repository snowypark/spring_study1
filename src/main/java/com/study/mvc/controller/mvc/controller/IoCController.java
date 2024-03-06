package com.study.mvc.controller.mvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.study.mvc.controller.mvc.diAndIoc.IoCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
public class IoCController {

    @Autowired
    private IoCService ioCService;

    @GetMapping("/ioc")
    public ResponseEntity<?> iocTest() throws JsonProcessingException {
        String json = ioCService.getJson();

        return ResponseEntity.ok(json);
    }
}
