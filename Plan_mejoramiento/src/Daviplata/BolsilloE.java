package Daviplata;

import java.util.Scanner;

public class BolsilloE implements Interfaz {

    private double MontoDiT=1200;
    private double MontoDiS;
    private double MontoDiM;
    private String NombreUsuario;
    private String ContraseñaU;
    

   

 
    public double getMontoDiT() {
        return MontoDiT;
    }

    public void setMontoDiT(double montoDiT) {
        MontoDiT = montoDiT;
    }

    public double getMontoDiS() {
        return MontoDiS;
    }

    public void setMontoDiS(double montoDiS) {
        MontoDiS = montoDiS;
    }

    public double getMontoDiM() {
        return MontoDiM;
    }

    public void setMontoDiM(double montoDiM) {
        MontoDiM = montoDiM;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public void setContraseñaU(String contraseñaU) {
        ContraseñaU = contraseñaU;
    }

    public int InicioSesion() {
        String Usuario = "Carlap";
        String Contraseña = "1234";
        int terminar = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite su usuario ");
        NombreUsuario = lectura.next();
        System.out.println("Digite su contraseña ");
        ContraseñaU = lectura.next();

        if (NombreUsuario.equalsIgnoreCase(Usuario)) {
            if (ContraseñaU.equals(Contraseña)) {
                System.out.println("Bienvenido " + NombreUsuario);
                terminar = 1;
            }

            else{
                System.out.println("Su contraseña es incorrecta " );
            }

        } else {
            System.out.println("Su usuario y contraseña son incorrectos ");
            terminar = 0;

        }

        return terminar;

    }

    public void MeterPlata() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("digite el monto de dinero que va meter ");
        MontoDiM = lectura.nextDouble();
        MontoDiT = MontoDiT + MontoDiM;
        this.ConsultarSaldo();

    }

    public void SacarPlata() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("digite el monto de dinero que va sacar ");
        MontoDiS = lectura.nextDouble();

        if (MontoDiS <= MontoDiT) {
            System.out.println("felicidades has sacado " + MontoDiS);
         MontoDiT = MontoDiT - MontoDiS;
            this.ConsultarSaldo();



        }

        else {
            System.out.println("lo siento saldo insuficiente " + this.getMontoDiT());
        }

    }

    public void ConsultarSaldo() {
        Scanner lectura = new Scanner(System.in);

        System.out.println("su saldo es " + MontoDiT);

    }

}
