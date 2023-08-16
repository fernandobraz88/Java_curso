package fundamentos;

public class A008PrimitivosVsObjeto {

    public static void main(String[] args) {

        //o Tipo String é uma classe, sendo assim instancia objetos e possui atributos e comportamentos

        String exemplo = "texto";
        exemplo.toUpperCase(); //to upper case é um comportamento da classe String
        System.out.println(exemplo);

        //tipos primitivos nao possuem atrigutos e comportamentos

        //os tipos primitivos possui uma versão classe/objeto. São os Wrappers, 1 para cada tipo primitivo.

        //primitivos
        byte b = 10;
        short s = 1000;
        int i = 10000;
        long l = 100_000L;
        boolean bo = true;
        char c = '#';
        double d = 4.5;

        //wrappers
        Byte B = 10;
        Short S = 1000;
        Integer I = 10000;
        Long L = 100_000L;
        Boolean BO = true;
        Character C = '#';
        Double D = 4.5;

        System.out.println(B.byteValue());
        System.out.println(BO.toString().toUpperCase());


    }
}
