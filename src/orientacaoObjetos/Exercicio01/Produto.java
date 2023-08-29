package orientacaoObjetos.Exercicio01;

public class Produto {

    String nome;
    double preco;
    double desconto;

    //métodos construtores:

    public Produto() {/*construtor generico - parametros repassados via notação ponto*/}

    public Produto(String nome, double preco, double desconto){
        /*parametros repassados no proprio construtor durante a criação do objeto*/
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;

        //o this indica que os parametros repassados no construtor, serão atrelados ao objeto, nao a classe.
    }

    public double getPrecoFinal(){
        return this.preco * (1 - this.desconto);
    }

}
