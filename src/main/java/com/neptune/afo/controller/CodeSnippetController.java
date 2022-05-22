package com.neptune.afo.controller;

import com.neptune.afo.response.CodeSnippetResponse;
import com.neptune.afo.service.ICodeSnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/snippets")
public class CodeSnippetController {

  @Autowired ICodeSnippetService codeSnippetService;

  @GetMapping
  public List<CodeSnippetResponse> getAllSnippets() {
    return codeSnippetService.getAllCodeSnippets();
  }
}
