package com.mycompany.mavenproject1;

import java.util.Scanner;

public class CalculoIVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double costo;

        System.out.println("--- Sistema de Facturación ---");
        System.out.print("Ingrese el precio del producto: ");
        costo = entrada.nextDouble();

        double resultado = calcularIVA(costo);
        System.out.println("El precio final a pagar con el 15% de IVA es: $" + resultado);
    }

    public static double calcularIVA(double precioBase) {
        double precioTotal = precioBase * 1.15;
        return precioTotal;
    }
}