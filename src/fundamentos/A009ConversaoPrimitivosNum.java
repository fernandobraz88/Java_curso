package fundamentos;

public class A009ConversaoPrimitivosNum {

    public static void main(String[] args) {

        double n = 1;
        System.out.println(n); //o valor int 1 é automaticamente convertido para double 1.0 pelo proprio java

        float N = (float) 1.0; // o 1.0 esta descrito literalmente em sua forma double, sendo necessario fazer o cast antes
        //outra forma seria colocar o F apos o numero (1.0F)

        int c = 4;
        //byte d = c; resulta em erro
        byte d =  (byte) c;
        System.out.println(d);
        //mesmo que a memoria do tipo numerico comporte o valor da variavel, o java analisa a conversao entre tipos.

    }
}
