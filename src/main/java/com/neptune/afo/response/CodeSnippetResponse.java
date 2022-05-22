package com.neptune.afo.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CodeSnippetResponse {
    Long snippetId;
    String title;
    String snippet;
}
