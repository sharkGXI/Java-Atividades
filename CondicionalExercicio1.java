/*
    Faça um programa que receba a altura e o sexo de uma pessoa e calcule 
    e mostre seu peso ideal, utilizando as seguintes formulas onde h é a altura.

    para homens: (72.7 * h) - 58;
    para mulheres: (62.1 * h) - 44.7;
 */

package com.mycompany.condicionalexercicio1;

import java.util.Scanner;

public class CondicionalExercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();
        
        System.out.print("Digite M para masculino ou F para feminino: ");
        char sexo = sc.next().charAt(0);

        double ideal;

        if (sexo == 'M' || sexo == 'm') {
            ideal = (72.7 * altura) - 58; 
            System.out.println("Seu peso ideal é: " + ideal + " kg");
        } 
        else if (sexo == 'F' || sexo == 'f') {
            ideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + ideal + " kg");
        } 
        else {
            System.out.println("Digite um valor válido para o sexo (M ou F).");
        }
    }
}
