package com.emr.cotodigital.producto;

public class Producto {
    private int plu;
    private double precio;

    public Producto(int plu, double precio) {
        this.plu = plu;
        this.precio = precio;
    }

    public int getPlu() {return plu;}
    public double getPrecio() {return precio;}

    public void setPlu(int plu) {this.plu = plu;}
    public void setPrecio(double precio) {this.precio = precio;}
}
