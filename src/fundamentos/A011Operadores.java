package fundamentos;

public class A011Operadores {

    public static void main(String[] args) {

        /*
        Operadores Unários: Apenas 1 operando. (A++)
        Normalmente usado para incrementos ou decrementos

        forma prefixada: ++A (incrementa +1 ao valor de A)
        forma postfixada: A-- (decresce -1 do valor de A)
        forma interfixada: A - B (entre os operandos)
        */

        //Operadores Binários: 2 operandos. (A + B)
        //Operadores Ternários: 3 Operandos. (A ? B : C)

        {
            /*
            Operadores Aritmeticos:
                  + :adição
                  - :subtração
                  * :multiplicação
                  / :divisão
                  % :modulo (resto da divisão entre 2 operandos)
             */
        }
        {
            /*
            * Operadores Lógicos

                    Operador E : AND => &&
                    Operador OU : OR => ||
                    Operador OU exclusivo : XOR => ^
                    Operador Negação : NOT => ! (operador de negação é unario)
             */
            boolean v = true;
            boolean f = false;

            System.out.println("tabela Verdade: AND ");
            System.out.println(v && v);
            System.out.println(v && f);
            System.out.println(f && v);
            System.out.println(f && f);

            System.out.println("tabela Verdade: OR ");
            System.out.println(v || v);
            System.out.println(v || f);
            System.out.println(f || v);
            System.out.println(f || f);

            System.out.println("tabela Verdade: XOR ");
            System.out.println(v ^ v);
            System.out.println(v ^ f);
            System.out.println(f ^ v);
            System.out.println(f ^ f);

            System.out.println("Negação de Verdadeiro: !V = "+ !v);
            System.out.println("Negacão de Falso: !F = "+ !f);
        }
        {
            /* Operadores Relacionais
                    == comparativo de igualdade
                    != comparativo de diferença
                     > maior que
                     < menor que
                     >= maior ou igual a
                     <= menor ou igual a
              */

            //todo operador relacional retorna um resultado do tipo boolean
        }
    }
}
