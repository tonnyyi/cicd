package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href=mailto:ktyi@iflytek.com>伊开堂</a>
 * @date 2020/6/22
 */
@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "hello ";
    }

    @GetMapping("/add")
    public int test(int a, int b) {
        return a + b;
    }

}