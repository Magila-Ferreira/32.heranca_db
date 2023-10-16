package edu.fatec.heranca_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_prof")
public class Professor extends Pessoa {
    @Id
    @Column(name = "reg_prof")
    private int registro;

    @Column(name="tit_prof", nullable = false,length = 20)
    private String titulo;
    
    @Column(name="area_tit", nullable = false,length = 20)
    private String area;
    
    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}