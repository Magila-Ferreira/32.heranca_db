package edu.fatec.heranca_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa {
    @Id
    @Column(length = 15,nullable = false,name = "al_ra")
    private String ra;
    
    @Column(length = 25,nullable = false,name = "al_curso")
    private String curso;
    
    public String getRa() {
        return ra;
    }
    public void serRa(String ra) {
        this.ra = ra;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
