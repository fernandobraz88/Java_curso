package desafios;

public class DesafioOperadoresAritimeticos {

    //Resolver:([6*(3+2)]²/3*2 - ((1-5)*(2-7)/2)²)³/10³
    //(Imagem em pdf)
    // o resultado deve ser = 125

    public static void main(String[] args) {

        int a = (6*(3+2));
        int b = ((1-5)*(2-7))/2;
        int c = ((int)Math.pow(a, 2))/(3*2);
        int d = (int)Math.pow(b, 2);
        int e = c - d;
        int resultado = (int)Math.pow(e, 3)/(int)Math.pow(10, 3);

        System.out.println(resultado);
    }
}
