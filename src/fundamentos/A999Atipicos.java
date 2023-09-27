package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class A999Atipicos {

    //nextInt() e nextDouble():
    /*Acontece por causa da maneira como o nextInt() e nextDouble() fazem a leitura de valores.
    * Além do valor que deve ser lido, também apertamos enter, o que gera um caracter "\n" no buffer de entrada.
    * Sendo assim o proximo nextLine() lerá esse /n como entrada.
    * Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt()/nextDouble() não lê.
    * Isso pode ser feito colocando um comando nextLine() depois do nextInt()/nextDouble()*/

    //nextDouble: useLocale => faz com que o scaner leia . no lugar da virgula em imputs
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double input = entrada.useLocale(Locale.US).nextDouble();
    }

}
