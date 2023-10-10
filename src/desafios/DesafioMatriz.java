package desafios;

import java.util.Scanner;

public class DesafioMatriz {
    //Criar um Programa que peça do usuario a quantidade de alunos e a quantidade de notas
    //o Usuário deve repassar todas as notas de todos os alunos
    //calcular a media final da turma.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int qa = entrada.nextInt();

        System.out.println("Digite a quantidade de notas: ");
        int qn = entrada.nextInt();

        double [][] notas = new double[qa][qn];
        double soma = 0;

        for(int a = 0 ; a < qa ; a++){
            for(int n = 0 ; n < qn ; n++){
                System.out.println(String.format("Digite a nota %d do aluno %d", (n+1), (a+1)));
                notas [a][n]= entrada.nextDouble();
                soma += notas[a][n];
            }
        }
        double media = soma/(qa*qn);
        System.out.println(String.format("Media dos alunos: %.1f",media));


    }
}
