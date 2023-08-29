package estruturasControle;

public class A05_BreakContinue {

    /*Break:
		 * Quando usado em um laço (for, while, do-while), o break causa a interrupção imediata do laço,
		levando a execução para fora do bloco do laço.
		 * Quando usado em um Switch, o break é usado para sair do bloco case, interrompendo a execução dos casos subsequentes.*/

    /*Continue:
     * Interrompe a execução atual do laço e continua para a próxima iteração.
     * No caso de um for ou while, o continue pula para a próxima iteração, ignorando o restante do bloco do laço
     * No caso de um  do-while, o continue leva à verificação da condição do laço,
     pulando o restante do bloco do laço se a condição for verdadeira.
     * No contexto de um switch, o continue não tem um efeito especial*/

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
        {
            if (i == 9)
            {
                break; // interrompe o laço se i for igual a 9
            }
            else if (i == 6)
            {
                continue; // pula a iteração atual se i for igual a 6
            }
            System.out.println(i);
        }

    }
}
