package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        /* Desafio: Solicitar um numero e retornar o dia da semana equivalente
        * Domingo - 1
        * Segunda - 2
        * Terça - 3 ....*/

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7 para saber qual o dia da semana correspondente");
        int dia = input.nextInt();

        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6){
            System.out.println("Sexta");
        } else {
            System.out.println("Sabado");
        }

        /*Situação inversa: digita o dia e retorna o numero*/
        System.out.println("Agora digite o dia para saber seu numero correspondente:");
        input.nextLine(); //lembrar de sempre apos um nextDouble() ou nextInt() por um nextLine() solto (corrigir o /n)
        String dia2 = input.nextLine();

        if(dia2.equalsIgnoreCase("domingo")){
            System.out.println(1);
        } else if (dia2.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        }else if (dia2.equalsIgnoreCase("terça")|| dia2.equalsIgnoreCase("terca")) {
            System.out.println(3);
        }else if (dia2.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        }else if (dia2.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        }else if (dia2.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        }else if (dia2.equalsIgnoreCase("sabado")|| dia2.equalsIgnoreCase("sábado")) {
            System.out.println(7);
        }else {
            System.out.println("dia invalido");
        }

    }
}
