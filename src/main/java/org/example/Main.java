package org.example;


import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/**
 * Haciendo uso de lo aprendido(Expresiones lambda, referencias a métodos y funciones puras) resuelva:
 * */

        /**
         * 1. Con la intención de encontrar el número mayor en una lista y a su vez el número menor, cree un método que le permita
         * estas dos funciones, siguiendo los principios de las funciones puras.
         * */



        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(5);
        numeros.add(2);

        MayorMenor buscar = new MayorMenor();

        System.out.println("Respuesta punto 1");
        buscar.numeroMayorMenor(numeros);



        /**
         * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
         * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
         * y devuelva el nuevo precio total.
         * */


        System.out.println("**********------------**********");
        System.out.println("Respuesta Punto 2");
        Descuentos ventaFinal = (precio, descuenta) -> precio*(1-descuenta/100);

        System.out.println("Precio de: 10000" + '\n' +
                            "Descuento de:  10%"

    );
        System.out.println("El valor de la compra es:" + ventaFinal.descuento(10000.0, 10.0));

        /**
         * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
         * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
         * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
         * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
         * Cree una sola función que pueda lograr estos dos propósitos
         * */

        System.out.println("**********------------**********");
        System.out.println("Respuesta Punto 3");


        System.out.println("Para el articulo de valor de 10.000 el valor de Iva con el 21% es  de: ");

        IvaCalculo calcular = new IvaCalculo();

        calcular.calculoIva(10000.0);


        System.out.println("Para el articulo de valor de 10.000 el valor de Iva ingresado de el 19% es  de: ");
        calcular.calculoIva(10000.0, 19.0);




    }
}

