package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafetera C1= new Cafetera();
        System.out.println(C1);
         while (true) {
            System.out.println("Ingrese el numero de la opcion que desee: ");
            System.out.println("1-Americano");
            System.out.println("2-Expresso");
            System.out.println("3-Capuchino");
            System.out.println("4-Salir");
            Scanner Teclado = new Scanner(System.in);
            int entrada = Integer.parseInt(Teclado.nextLine());
            if(entrada==1 || entrada==2 || entrada==3 || entrada==4) {
                if (entrada == 1) {
                    if ((C1.getDeposito_Agua() >= 180) && (C1.getDeposito_Cafe() >= 15) && (C1.getDeposito_Vasos() >= 1)) {
                        C1.Americano();
                        System.out.println(C1);
                    } else {
                        System.out.println("NO hay ingredientes necesarios para realizar el cafe");
                        System.out.println("Insumos necesarios Agua:180ml Cafe:15g Vasos:1");
                        System.out.println(C1);
                    }
                }
                if (entrada == 2) {
                    if ((C1.getDeposito_Agua() >= 120) && (C1.getDeposito_Cafe() >= 20) && (C1.getDeposito_Vasos() >= 1)) {
                        C1.Expresso();
                        System.out.println(C1);

                    } else {
                        System.out.println("NO hay ingredientes necesarios parsa realizar el cafe");
                        System.out.println("Insumos necesarios Agua:120ml Cafe:20g Vasos:1");
                        System.out.println(C1);
                    }
                }
                if (entrada == 3) {
                    if ((C1.getDeposito_Agua() >= 100) && (C1.getDeposito_Cafe() >= 14) && (C1.getDeposito_Vasos() >= 1) && (C1.getDeposito_Crema() >= 70)) {
                        C1.Capuchino();
                        System.out.println(C1);
                    } else {
                        System.out.println("NO hay ingredientes necesarios para realizar el cafe");
                        System.out.println("Insumos necesarios Agua:100ml Cafe:20g Crema:70ml Vasos:1");
                        System.out.println(C1);
                    }
                }
                if (entrada == 4) {
                    break;
                }
            }
            else {
                System.out.println("Ingrese una opcion valida");
            }

        }

    }
}