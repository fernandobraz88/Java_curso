package desafios;

public class DesafioFor {

    public static void main(String[] args)
    {

        String valor = "#";
        for (int i = 1; i <= 5 ; i++)
        {
            System.out.println(valor);
            valor += "#";
        }

        //Desafio: conseguir o mesmo resultado do laço acima
        //Não usar valores de controle numericos

        for (String i = "#";!i.equals("######"); i += "#")
        {
            System.out.println(i);
        }
    }
}
