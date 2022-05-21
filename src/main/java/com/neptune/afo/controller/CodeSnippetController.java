package com.neptune.afo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeSnippetController {
    @GetMapping
    public String getAllSnippets() {
        return "Hello World";
    }
}
