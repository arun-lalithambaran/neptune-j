package com.neptune.afo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "users")
@Getter
@Setter
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  private String firstName;
  private String lastName;
  private String profilePicture;
  private String gender;
  private String email;
  private String password;
}
