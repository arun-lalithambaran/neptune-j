package com.neptune.afo.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.util.StringUtils;

import java.io.Serializable;

public class CustomPhysicalNamingStrategy implements PhysicalNamingStrategy, Serializable {
  @Override
  public Identifier toPhysicalCatalogName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
    return capitalize(identifier);
  }

  @Override
  public Identifier toPhysicalSchemaName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
    return capitalize(identifier);
  }

  @Override
  public Identifier toPhysicalTableName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
    return capitalize(identifier);
  }

  @Override
  public Identifier toPhysicalSequenceName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
    return capitalize(identifier);
  }

  @Override
  public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment jdbcEnvironment) {
    return capitalize(identifier);
  }

  private Identifier capitalize(Identifier name) {
    if (name == null) return null;
    if (name.isQuoted()) return name;
    String text = StringUtils.capitalize(name.getText());
    return Identifier.toIdentifier(text);
  }
}
