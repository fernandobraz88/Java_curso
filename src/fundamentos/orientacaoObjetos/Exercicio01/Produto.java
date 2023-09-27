package fundamentos.orientacaoObjetos.Exercicio01;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25; //static faz com que o atributo seja atrelado a classe.


    //métodos construtores: pode-se ter varios construtores

    public Produto() {
        /*construtor padrão - fornecido de forma implicita pelo java.
                            - parametros repassados via notação ponto
                            - se o construtor for definido de forma explicita, o construtor padrão é substituido
                            - para ter novamente o construtor padrão, este deve ser declarado de forma explicita*/}

    public Produto(String nome, double preco){
        /*construtor explicito - parametros repassados no proprio construtor durante a criação do objeto*/
        this.nome = nome;
        this.preco = preco;

        //o this indica que os parametros repassados no construtor, serão atrelados ao objeto, nao a classe.
    }

    public double getPrecoFinal(){
        return preco * (1 - desconto);
    }



}
