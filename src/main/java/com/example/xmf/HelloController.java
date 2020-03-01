package com.example.xmf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String say(){
        return "欢迎访问绣麦坊平台";
    }
}
