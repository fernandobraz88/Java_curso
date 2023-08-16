package fundamentos;

public class A005NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X"; // não existe declaração de "String" com S minusculo, como "double"

        System.out.println(s);

        s.toUpperCase(); //dessa forma não se altera o valor original da variável
        s = s.toUpperCase(); // dessa forma a variavel "s" receberá o resultado do uppercase

        System.out.println(s);

        s = s.replace("X", "Senhora");// troca caracteres sem precisar alterar a variavel original

        System.out.println(s);

        s = s.concat("!!!!"); // serve para concatenar sem precisar usar o "+" no print

        System.out.println(s);
    }
}
