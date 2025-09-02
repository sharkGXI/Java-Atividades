/*
 * Faça um programa que receba:
        - O codigo do produto comprado;
        - A quantidade comprada do produto.
   
   Calcule e mostre:
        - O preço unitario do produto comprado, seguindo a tabela I;
        - O preço total da nota;
        - O valor do desconto, seguindo a tabela II e aplicando sobre o preço
            total da nota;
        - O preço final da nota depois do desconto.

   TABELA I
    CODIGO      PREÇO
    1 a 10      R$ 100,00
    11 a 20     R$ 150,00
    21 a 30     R$ 200,00
    31 a 40     r$ 300,00

   TABELA II
    PREÇO TOTAL DA NOTA                % DE DESCONTO
    Até R$ 2.500,00                         5%
    Entre R$ 2.500,00 e R$ 5.000,00         10%
    Acima de R$ 5.000,00                    15%

 */

package com.mycompany.condicionalexercicio4;

import java.util.Scanner;
public class CondicionalExercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codProd;
        int quantidadeComprada;
        double precoUnit = 0;
        double totalSemDesconto;
        double desconto;
        double totalComDesconto;

System.out.print("digite o codigo do produto: ");
codProd = sc.nextInt();

System.out.print("digite a quantidade comprada: ");
quantidadeComprada = sc.nextInt();

// - O preço unitario do produto comprado, seguindo a tabela I;
        if (codProd >= 1 && codProd <= 10) { 
            precoUnit = 100;

        } else if (codProd >=11 && codProd <= 20) {
            precoUnit = 150;
            
        } else if (codProd >=21 && codProd <= 30){
            precoUnit = 200;

        } else if (codProd >=31 && codProd <= 40){
            precoUnit = 300;
        } else {
            System.out.println("digite um valor valido");
            return;
        }

 // - O preço total da nota;        
        totalSemDesconto = quantidadeComprada * precoUnit;


//- O valor do desconto, seguindo a tabela II e aplicando sobre o preço total da nota;
            if (totalSemDesconto <= 2500) {
                desconto = totalSemDesconto * 0.05;
                totalComDesconto = totalSemDesconto - desconto;
                System.out.println("o desconto foi de 5%");
                
            } else if (totalSemDesconto > 2500 && totalSemDesconto <=5000) {
                desconto = totalSemDesconto * 0.10;
                totalComDesconto = totalSemDesconto - desconto;
                System.out.println("o desconto foi de 10%");
                
            } else  {
                desconto = totalSemDesconto * 0.15;
                totalComDesconto = totalSemDesconto - desconto;
                System.out.println("o desconto foi de 15%");
            }

            System.out.println("o preço unitário do produto é: "+ precoUnit);
            System.out.println("o preço sem desconto é de: " + totalSemDesconto);
            System.out.println("O preço com desconto é de: " + totalComDesconto);
    }
}
