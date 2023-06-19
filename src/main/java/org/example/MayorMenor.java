package org.example;

import java.util.List;
import java.util.Optional;

public class MayorMenor {

        public void numeroMayorMenor(List<Integer> numeros) {

            int mayor = numeros.get(0);
            int menor = numeros.get(0);

            for (int numero : numeros) {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        }

}
