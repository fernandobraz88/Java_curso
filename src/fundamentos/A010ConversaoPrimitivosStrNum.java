package fundamentos;

public class A010ConversaoPrimitivosStrNum {

    public static void main(String[] args) {

        //NUMERO P/ STRING:

        //quando se trata de conversão entre tipos primitivos e String (objeto), deve-se usar os wrappers

        Integer num1 = 10000;
        System.out.println(num1.toString());
        //convertendo um numero para uma string, pode-se utilizar as funcionalidade que estão disponiveis apenas para String
        //ex:.lengh() => ve a quanditdade de caracteres.

        System.out.println(num1.toString().length());

        int num2 = 12345;
        System.out.println(Integer.toString(num2).length());

        //STRING P/ NUMERO:

        String valor1 = "35";
        String valor2 = "45";

        System.out.println(valor1 + valor2); //por se tratar de numeros em string o resultado será a concatenação

        double v1 = Double.parseDouble(valor1); //usando o wrapper para converter o numero string em double
        double v2 = Double.parseDouble(valor2); //assim pode-se realizar operaçoes matematicas;

        System.out.println(v1+v2);
    }
}
