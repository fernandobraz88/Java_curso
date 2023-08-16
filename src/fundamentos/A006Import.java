package fundamentos;

import java.util.Date;
import java.util.Scanner;

public class A006Import {
    //import é utilizado quando uma funcionalidade do java não está disponivel por padrão
    //ex: Date, Scanner, ArrayList

    public static void main(String[] args) {
        Date D = new Date();
        System.out.println(D);

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
    }
}
