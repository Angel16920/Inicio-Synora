package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static int psw;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int telefono;

        while (opcion != 3) {
            System.out.println("=======================");
            System.out.println("Bienvenido");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar Sesion");
            System.out.println("3. Salir");
            System.out.println("=======================");
            while (!sc.hasNextInt()) {
                System.out.println("Numero incorrecto");
                sc.next();
                System.out.println("Ingrese otra vez");
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                    System.out.println("=======================");
                    System.out.println("      REGISTRO      ");
                    System.out.println("=======================");

                    System.out.println("-----------------------");
                    System.out.println("Registrar una cuenta");
                    System.out.println("-----------------------");
                    System.out.println("Nombre completo");
                    String cliente = sc.nextLine();
                    System.out.println("Correo electronico");
                    String correo = sc.nextLine();
                    System.out.println("Número telefonico");
                    while (!sc.hasNextInt()) {
                        System.out.println("No ingrese caracteres");
                        sc.next();
                        System.out.println("Ingrese otra vez");
                    }
                    telefono = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Crear una contraseña");
                    while (!sc.hasNextInt()) {
                        System.out.println("No ingrese caracteres");
                        sc.next();
                        System.out.println("Ingrese otra vez");
                    }
                    psw = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Confirme la contraseña");
                    while (!sc.hasNextInt(psw)) {
                        System.out.println("Contraseña Incorrecta");
                        sc.next();
                        System.out.println("Ingrese otra vez");
                    }
                    psw = sc.nextInt();
                    sc.nextLine();
                    System.out.println("     Ingresar     ");
                break;

                case 2:
                    System.out.println("=======================");
                    System.out.println("Iniciar Sesion");
                    System.out.println("=======================");
                    System.out.println("Correo electronico");

                    String correoIngresado = sc.nextLine();

                    System.out.println("Contraseña");
                    int pws;
                    while (!sc.hasNextInt(psw)) {
                        System.out.println("Contraseña incorrecta");
                        sc.next();
                        System.out.println("Ingrese otra vez");
                    }
                    psw = sc.nextInt();
                    sc.nextLine();
                        System.out.println("     Ingresar     ");
                        System.out.println("                       ");
                        System.out.println("———————————————————————");
                        System.out.println("¿No tienes cuenta?");
                        System.out.println("Registrate");
                        System.out.println("=======================");
                        System.out.println("=======================");
                        System.out.println("=======================");
                        System.out.println("=======================");
                break;

                case 3:
                    System.out.println("Tenga un buen dia");
                break;

                        default:
                            System.out.println("Opcion no válida");
                            break;
            }
            sc.close();
        }
    }
}