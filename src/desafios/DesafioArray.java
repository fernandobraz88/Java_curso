package desafios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DesafioArray {
    /*Desafio: desenvolver um programa que construa um array de notas
    * A quantidade de notas (tamanho do array) deve ser definida pelo usuario
    * Calcular a media do aluno e exibir no console
    * Utilizar (for) para inserir as notas e (foreach) para calcular */

    public static void main(String[] args) {

        double soma = 0, media = 0;

        //Construindo o Array:
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas notas ?");
        int num = entrada.nextInt();
        double [] notas = new double [num];

        //Definindo as notas:
        for (int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota " + (i+1));
            notas[i] =  entrada.useLocale(Locale.US).nextDouble();
        }

        //Fazendo a soma das notas:
        for (double nota: notas) {
            soma += nota;
        }

        //Calculando e Exibindo a media:
        media = soma/ notas.length;
        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println(String.format("Media: %.1f", media));

        entrada.close();

    }

}

