package com.zhugunag.zhou.sentinel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudentController {

    @GetMapping("/getStudentInfo")
    public String getStudentInfo(String name) {
        log.info("name: " + name);
        return "getStudentInfo";
    }
}
