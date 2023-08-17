package desafios;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salario 1: ");
        String salario1 = input.nextLine();
        System.out.println("Digite o salario 2: ");
        String salario2 = input.nextLine();
        System.out.println("Digite o salario 3: ");
        String salario3 = input.nextLine();


        //usando o metodo parseDouble() da classe Wrapper Double

        double media = (Double.parseDouble(salario1)+ Double.parseDouble(salario2)+ Double.parseDouble(salario3))/3;

        System.out.println(media);

        //usando o metodo valueOf() da calsse Wrapper Double

        double media2 = (Double.valueOf(salario1)+Double.valueOf(salario2)+Double.valueOf(salario3))/3;

        System.out.println(media2);

    }
}
