package desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    /* Criar a leitura de 2 operandos
     * escolher um operador
     * executar a operação e imprimir o resultado na tela
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("informe o primeiro operando:");
        double n1 = input.nextDouble();

        System.out.println("informe o segundo operando:");
        double n2 = input.nextDouble();

        System.out.println("Informe a operação:");
        String op = input.nextLine();


       if (op.equals("+")){
           double resultado = n1 + n2;
           System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
       }else if (op.equals("-")){
           double resultado = n1 - n2;
           System.out.printf("%.2f - %.2f = %.2f", n1, n2, resultado);
       }else if (op.equals("*")){
           double resultado = n1 * n2;
           System.out.printf("%.2f * %.2f = %.2f", n1, n2, resultado);
       }else{
           double resultado = n1 / n2;
           System.out.printf("%.2f : %.2f = %.2f", n1, n2, resultado);
       }




        input.close();
    }

}
