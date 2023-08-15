package fundamentos;

public class Inferencia {
    //Inferencia é uma presunção que o proprio java faz quando, dentro de um metodo, nao se declara o tipo da variavel
    //Nesse caso utiliza-se a palavra reservada "var" antes do nome da variável e o java vai atribuir o tipo baseado no valor
    //Após a Inferencia a variável não pode mais ter seu tipo de valor modificado.

    public static void main(String[] args) {
        double a = 4.5;
        var b = 4.5; //nesse caso o Java inferiu que o var b, é do tipo double e executou o comando "print"

        System.out.println(a);
        System.out.println(b);

       // b = "teste"; <=nao pode ser executado porque b ja havia sido definida como "double"
        b = 9.5; // se for do mesmo tipo a variável pode ser alterada
        System.out.println(b);
    }
}
