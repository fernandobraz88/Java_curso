package estruturasControle;

import java.util.Scanner;

public class A02_While {
    /*WHILE: é uma estrutura de controle/ repetição que enquanto uma condição for verdadeira, o codigo será executado repetidamente.
     *WHILE DETERMINADO: O codigo sera executado até que uma variavel contadora chegue a 0 (melhor utilizar o FOR)*/

    public static void main(String[] args) {
        //exemplo de While determinado:
        int contador = 1;
        while (contador <=5){
            System.out.println("Contador agora é: "+ contador);
            contador++;
        }

        //exemplo de While indeterminado:
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            valor = entrada.nextLine();
            System.out.println("Você disse: " + valor);
        }
        entrada.close();

        //Do-While: o codigo é executado pelo menos uma vez, mesmo que nao satisfaça a condição do While
        //Estrutura: do{} while();

    }
}
