package Daviplata;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        int opcionU;
        int terminar = 0;
        BolsilloE billeteraD = new BolsilloE();
        terminar = billeteraD.InicioSesion();

        Scanner lectura = new Scanner(System.in);
        while (!(terminar == 0)) {
            System.out.println("\nElija una opción:\n1.Agregar dinero \n2.Retirar dinero \n3.Mostrar saldo.");

            opcionU = lectura.nextInt();

            if (opcionU == 1) {
                billeteraD.MeterPlata();
                break;
            } else if (opcionU == 2) {
                billeteraD.SacarPlata();
                break;
            }

            else if (opcionU == 3) {
                billeteraD.ConsultarSaldo();
                break;
            }

        }

    }

}
