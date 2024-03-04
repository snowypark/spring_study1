package com.study.mvc.controller;

import com.study.mvc.model.HelloModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class StudyController {

    // MVC
    @GetMapping("/hello")
    public String helloPage(Model model) {
//        Map<String, Object> model = new HashMap<>();
//        model.put("name1", "김준일1");
//        model.put("name2", "김준일2");
//        model.put("name3", "김준일3");

        HelloModel helloModel = HelloModel.builder()
                .name1("김준일")
                .name2("김준이")
                .name3("김준삼")
                .build();

        model.addAttribute("helloModel", helloModel);

        return "hello";
    }

    //RestAPI
    @GetMapping("/test")
    @ResponseBody
    public Map<String, Object> testPage(Model model) {
//        model.addAttribute("age", 32);

        Map<String, Object> testObj = new HashMap<>();
        testObj.put("age", 32);

        return testObj;
    }
}
