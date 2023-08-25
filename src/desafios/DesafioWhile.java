package desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args)
    {
        //Calcular a media das notas digitadas
        //Nao se sabe a quantidade de alunos
        //Notas validas de 0 a 10
        //Quando uma nota valida for digitada, armazenar em uma variável
        //Criar uma variável para saber quantas notas foram digitadas
        //digitando -1 o programa encerra e imprime o numero de alunos e a media da turma

        Scanner input = new Scanner(System.in);
        double total = 0;
        int contador = 0;
        double nota = 0;

        while (nota != -1)
        {
            System.out.println("Digite uma nota de 0 a 10");
            nota = input.nextDouble();

            if(nota <= 10 && nota >=0)
            {
                total += nota;
                contador++;
            }
            else if (nota!= -1)
            {
                System.out.println("Nota inválida, digite novamente");
            }


        }

        double media = total / contador;

        System.out.println("O total de alunos foi: " + contador);
        System.out.printf("\nA média das notas foi: %.1f", media);

        input.close();
    }

}
