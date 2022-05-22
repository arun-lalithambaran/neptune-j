package com.neptune.afo.service.impl;

import com.neptune.afo.converter.CodeSnippetResponseConverter;
import com.neptune.afo.entity.CodeSnippet;
import com.neptune.afo.response.CodeSnippetResponse;
import com.neptune.afo.respository.CodeSnippetRepository;
import com.neptune.afo.service.ICodeSnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeSnippetServiceImpl implements ICodeSnippetService {

  @Autowired CodeSnippetRepository codeSnippetRepository;
  @Autowired CodeSnippetResponseConverter codeSnippetResponseConverter;

  @Override
  public List<CodeSnippetResponse> getAllCodeSnippets() {
    List<CodeSnippet> codeSnippets = codeSnippetRepository.findAll();
    return codeSnippetResponseConverter.convert(codeSnippets);
  }
}
