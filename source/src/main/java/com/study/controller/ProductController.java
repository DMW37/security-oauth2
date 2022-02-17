package com.study.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Secured("ROLE_PRODUCT")
    @GetMapping("/a")
    public String findAll() {
        return "查询产品列表成功！";
    }

    @Secured("PRODUCT")//下面的不允许访问
    @GetMapping("/b")
    public String get() {
        return "get成功！";
    }
}