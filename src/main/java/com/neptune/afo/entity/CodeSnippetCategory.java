package com.neptune.afo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "codeSnippetCategories")
@Entity
@Getter
@Setter
public class CodeSnippetCategory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long categoryId;

  private String categoryName;
}
