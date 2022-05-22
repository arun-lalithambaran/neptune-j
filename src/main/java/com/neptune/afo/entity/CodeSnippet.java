package com.neptune.afo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "codeSnippets")
@Getter
@Setter
@Entity
public class CodeSnippet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long snippetId;

  private String title;
  private String snippet;

  @ManyToOne
  @JoinColumn(name = "categoryId")
  private CodeSnippetCategory codeSnippetCategory;

  @ManyToOne
  @JoinColumn(name = "userId")
  private User user;

  @ManyToOne
  @JoinColumn(name = "languageId")
  private ProgrammingLanguage language;

  private Instant createdAt;
  private Instant updatedAt;
}
