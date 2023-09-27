package fundamentos.orientacaoObjetos.Exercicio01;

public class ProdutoMain {

    public static void main (String[] args){

        Produto p1 = new Produto(); //instanciando um objeto com o construtor generico
        p1.nome = "celular";
        p1.preco = 1965.65;

        Produto p2 = new Produto("Tablet", 2550.70); //instanciando com o construtor personalizado

        System.out.println("Produto: " + p1.nome);
        System.out.println("Preço: " + p1.preco);
        System.out.printf("à Vista: %.2f ", p1.getPrecoFinal());
        System.out.println();
        System.out.println();
        System.out.println("Produto: " + p2.nome);
        System.out.println("Preço: " + p2.preco);
        System.out.printf("à Vista: %.2f", p2.getPrecoFinal());
    }
}
