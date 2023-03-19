package com.emr.cotodigital.cliente;

import com.emr.cotodigital.producto.Carrito;

public class Pedido {
    private int id_pedido;
    private Carrito carrito;
    private int precioFinal;
    private MedioPago medioPago;

    private int ultimoIdPedido;

    Pedido(){
        this.id_pedido = ++ultimoIdPedido;

    }


    Pedido(Carrito carrito){
        this();
        this.carrito = carrito;
    }

    Pedido(Carrito carrito, int precioFinal){
        this(carrito);
        this.precioFinal = precioFinal;
    }

    public Carrito getCarrito(){ return this.carrito;}
    public int getId_pedido() { return this.id_pedido;}
    public int getPrecioFinal(){ return  this.precioFinal;}

    public void setCarrito(Carrito carrito){ this.carrito = carrito;}


}
