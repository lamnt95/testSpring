package com.example.demo.controller;


import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("/test")
@Validated
public class TestController {


    // GET localhost:9000/test/data
    @GetMapping(value = "/data", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    private String test(
    ) throws IOException {
        return "test";
    }

}
