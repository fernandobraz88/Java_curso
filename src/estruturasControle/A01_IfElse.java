package estruturasControle;

import java.util.Scanner;

public class A01_IfElse {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("informe a media");
            double media = input.nextDouble();

            //situação 1:

            if(media >= 7.0)  //executa a proxima sentença de codigo caso a condição do IF seja Verdadeira
                System.out.println("Aprovado");

            //situação 2:
            System.out.println("Informe a media 2");
            double media2 = input.nextDouble();
            if(media2 >= 7.0)
                System.out.println("Aprovado"); //lembrar de utilizar {} para englobar + de uma sentença de codigos condicionadas ao if
            System.out.println("Parabens"); //neste caso mesmo a condição sendo falsa essa sentença de cod sera executada

            //situação 3:
            if(media <= 10.0 && media >= 7.0) // utilizando operadores logicos e relacionais para cosntruir a condição do IF
            {
                System.out.println("Parabens");
                System.out.println("Aprovado");
            }
            //==============================================================================================================
            //ELSE: executado junto com o IF caso a condição seja falsa
            System.out.println("Informe a media 3");
            double media3 = input.nextDouble();

            if(media3 <= 10.0 && media3 >= 7.0)
            {
                System.out.println("Aluno Aprovado"); //se a condiçao for verdadeira
            }
            else
            {
                System.out.println("Aluno reprovado");//se for falsa
            }

            //==============================================================================================================
            //ELSE IF: Quando se tem mais de 1 condição a ser interpretada como verdadeiro ou falso
            System.out.println("informe a media 4");
            double media4 = input.nextDouble();

            if (media4 > 10.0 || media4 < 0)      //O IF sempre será a primeira condicional a ser avaliada
            {
                System.out.println("media invalida");
            }
            else if (media4 <= 10.0 && media4 >= 7.0) // caso o IF retorne falso, os ELSE IF serão avaliados em sequencia
            {
                System.out.println("Aluno Aprovado");
            }
            else if (media4 < 7.0 && media4 > 4.5)
            {
                System.out.println("Aluno em recuperação");
            }
            else 		//caso nenhuma condição descrita anteriormente retorne verdadeiro o ELSE sera executado
            {
                System.out.println("Aluno reprovado");
            }


            input.close();
        }
    }


