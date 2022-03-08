package org.example.customjavanonreactapp.controller;

import org.example.customjavanonreactapp.modal.Data;
import org.example.customjavanonreactapp.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @Autowired
    private CustomService customService;

    @GetMapping(value = "/data")
    public Data getData() {
        return customService.getData(Thread.currentThread().getId(), System.currentTimeMillis());
    }

}
