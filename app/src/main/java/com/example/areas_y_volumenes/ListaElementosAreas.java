package com.example.areas_y_volumenes;

import java.io.Serializable;

public class ListaElementosAreas implements Serializable {
    public int img;
    public String titulo;
    public String formulaA;

    public ListaElementosAreas(int img, String titulo, String formulaA) {
        this.img = img;
        this.titulo = titulo;
        this.formulaA = formulaA;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormulaA() {
        return formulaA;
    }

    public void setFormulaA(String formulaA) {
        this.formulaA= formulaA;
    }
}
