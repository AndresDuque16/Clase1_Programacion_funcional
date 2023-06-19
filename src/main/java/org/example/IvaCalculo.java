package org.example;

public class IvaCalculo {


    public void calculoIva(Double precio){

        Double p = precio *(21.0/100.0);
        System.out.println(p);
    };
    public void calculoIva(Double precio, Double iva){

        Double p = precio *(iva/100);
        System.out.println(p);
    };
}
