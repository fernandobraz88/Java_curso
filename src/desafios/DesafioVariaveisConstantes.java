package desafios;

import java.util.Scanner;

public class DesafioVariaveisConstantes
{
    //Desafio: criar um conversor de Farenheit p/ Celcius. Utilizando os conceitos de variaveis e constantes
    //Formula para a conversão: ºC = (ºF - 32) * 5/9
    public static void main(String[] args)
    {
        final int CONST1 = -32;
        final double CONST2 = 5.0/9.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit para converter para Celcius");
        double farenheit = input.nextDouble();
        double celcius = (farenheit + CONST1)* CONST2;

        System.out.println(celcius + "ºC");
    }
}
