package com.emr.cotodigital.cliente;

public enum MedioPago {
    EFECTVO("Efectivo"),
    CREDITO("Tarjeta de Credito"),
    DEBITO("Tarjeta de Debito");

    private String medioPago;

    MedioPago(String medioPago){ this.medioPago = medioPago;}

    public String getMedioPago() {return this.medioPago;}
}


