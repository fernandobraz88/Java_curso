package arraysColections;

import java.util.Arrays;

public class A002Matrizes {

    //As matrizes são Estruturas de Dados capazes de armazenar na forma de tabelas (linhas e colunas)
    //No java uma matriz trata-se de um Array de arrays.
    //Cada elemento de uma matriz pode ser acessado pelo indice da linha e o da coluna.

    public static void main(String[] args) {
        //Construção de uma matriz: declarar primeiro o array extreno depois o interno

        int [][] matriz = new int [2][3]; // Uma matriz de 2 linhas e 3 colunas

        matriz [0][0] = 1;
        matriz [0][1] = 2;
        matriz [0][2] = 3;
        matriz [1][0] = 4;
        matriz [1][1] = 5;
        matriz [1][2] = 6;

        System.out.println(matriz[1][2]);

        //ou declarar de forma explicita
        int [][] matriz2 = {{7,8,9},{10,11,12},{13,14,15}};

        System.out.println(matriz2[1][0]);

        //imprimindo todos os elementos de uma matriz
        for (int [] m: matriz2) {
            System.out.println(Arrays.toString(m));
        }
    }
}
