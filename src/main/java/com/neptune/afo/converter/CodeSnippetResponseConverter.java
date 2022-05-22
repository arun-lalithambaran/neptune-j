package com.neptune.afo.converter;

import com.neptune.afo.entity.CodeSnippet;
import com.neptune.afo.response.CodeSnippetResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CodeSnippetResponseConverter implements Converter<CodeSnippet, CodeSnippetResponse> {
  public List<CodeSnippetResponse> convert(List<CodeSnippet> codeSnippets) {
    return codeSnippets.stream().map(this::convert).toList();
  }

  public CodeSnippetResponse convert(CodeSnippet codeSnippet) {
    return CodeSnippetResponse.builder()
        .snippetId(codeSnippet.getSnippetId())
        .title(codeSnippet.getTitle())
        .snippet(codeSnippet.getSnippet())
        .build();
  }
}
