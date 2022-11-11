package com.example.areas_y_volumenes;

import java.io.Serializable;

public class ListaElementosVolumenes implements Serializable {
    public int imgv;
    public String tituloV;
    public String formulaV;

    public ListaElementosVolumenes(int imgV, String tituloV, String formulaV )
    {
        this.imgv = imgV;
        this.tituloV = tituloV;
        this.formulaV = formulaV;
    }

    public int getImgv(){return imgv;}

    public void setImgv(int imgv) {
        this.imgv = imgv;
    }

    public String getTituloV(){return tituloV;}

    public void setTituloV(String tituloV) {
        this.tituloV = tituloV;
    }

    public String getFormulaV(){return formulaV;}

    public void setFormulaV(String formulaV) {
        this.formulaV = formulaV;
    }
}
