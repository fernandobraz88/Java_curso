package arraysColections;

import java.util.Arrays;

public class A001Array {
    //Durante a criação de um array deve-se informar o numero de posiçoes que ele possui.
    //Estrutura estatica: uma vez criado nao pode modificar seu tamanho.
    //Homogeneo: cada array so armazena dados de um mesmo tipo
    //Estrutura indexada: cada elemento do array pode ser acessado pelo seu indice do [0] - [tamanho do Array -1]
    //Todo Array é um objeto, sendo assim, possui atributos e metodos

    public static void main(String[] args) {


        //Construtor de um array:
        int[] exemplo = new int[5];
        //tipo - nome do array - tamanho do array

        exemplo[0] = 10;   // [10, - , - , - , -]
        exemplo[1] = 13;   // [10, 13, - , - , -]
        exemplo[4] = 35;   // [10, 13, - , - , 35]
        exemplo[3] = 8;    // [10, 13, - , 8, 35]
        exemplo[2] = 1;    // [10, 13, 1, 8, 35]

        System.out.println(exemplo[0]); //acessa os dados armazenados no indice [0]

        /*para imprimir todos os valores de um array armazenado em suas devidas posiçoes deve-se converter o array em
        String fazendo um import da classe Arrays*/

        System.out.println(Arrays.toString(exemplo));

        //Atributos de um array
        // .length  => indica o tamanho do array
        System.out.println(exemplo.length);

        //forma simplificada de construir um array:
        double [] notas = {8.5, 9.8, 5.3, 6.4};

        //percorrendo um array:
        for (int i = 0; i < notas.length; i++){  //i vai representar cada indice do array
            System.out.println(notas[i] );        //.leght vai representar o tamanho do array
        }
        System.out.println();

        for (double nota : notas) {
            System.out.println(nota + "\n");
        }

    }
}
