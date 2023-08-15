package fundamentos;

public class VariaveisConstantes
{
    public static void main(String[] args)
    {
        //declarando variaveis no java: tipo + nome = valor
        double raio = 3.5;

        //declarando constantes no java: final + tipo + NOME = valor
        final double PI = Math.PI;

        double area = PI * Math.pow(raio,2);

        System.out.println("Area: " + area);
    }
}
