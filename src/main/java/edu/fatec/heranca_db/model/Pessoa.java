package edu.fatec.heranca_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class Pessoa implements Serializable {

  @Column(length = 50, nullable = false)
  private String nome;

  @Column(length = 12)
  private String rg;

  @Column(length = 16)
  private String cpf;

  @Column(length = 25)
  private String pai;

  @Column(length = 25)
  private String mae;
}
