package com.neptune.afo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "api/v1/")
public class CodeSnippetController {

    @GetMapping("/getAllCodeSnippets")
    private String getAllCodeSnippets() {
        return "Hello world!";
    }

}
