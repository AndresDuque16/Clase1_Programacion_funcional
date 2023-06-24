package org.example;

public interface CalcularIva {

    static double calcularIva (double precio){
        return precio * 0.19;
    }
    double calcularIva (double precio, double iva);
}
