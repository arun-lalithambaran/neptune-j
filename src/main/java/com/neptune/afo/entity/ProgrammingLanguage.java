package com.neptune.afo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "programmingLanguages")
@Getter
@Setter
@Entity
public class ProgrammingLanguage {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long languageId;

  private String languageName;
}
