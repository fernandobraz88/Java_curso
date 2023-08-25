package estruturasControle;

import java.util.Scanner;

public class A04_Switch {

    /*É uma maneira de avaliar uma expressão e executar diferentes blocos de código com base no valor da expressão.
    * Cada caso é uma correspondência para um valor específico da expressão.
    * O break é usado para sair do switch após um caso ser executado.
      Se o break for omitido, a execução continuará para os casos subsequentes até encontrar um break.
    * O default é opcional e é executado quando nenhum dos casos anteriores corresponde ao valor da expressão*/

   /* switch (expressao) {
        case valor1:
            // Código a ser executado se a expressão for igual a valor1
            break;
        case valor2:
            // Código a ser executado se a expressão for igual a valor2
            break;
        // Outros casos
        default:
            // Código a ser executado se nenhum dos casos anteriores corresponder
    }*/

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        System.out.println("Escolha uma opção de destino:");
        System.out.println("1 - Madri");
        System.out.println("2 - Buenos Aires");
        System.out.println("3 - Londres");
        System.out.println("4 - Paris");

        switch(option)
        {
            case 1:
                System.out.println("Capital da Espanha");
                break;

            case 2:
                System.out.println("Capital da Argentina");
                break;

            case 3:
                System.out.println("Capital da Inglaterra");
                break;

            case 4:
                System.out.println("Capital da Franca");
                break;

            default:
                System.out.println("Opção inválida");
        }

        input.close();
    }
}
