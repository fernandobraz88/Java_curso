package fundamentos.orientacaoObjetos.Exercicio03;

//testando atributos estaticos
public class AreaCirc {

    double raio;
    static double pi = 3.14; //o valor definido no atributo estático será compartilhado por todas as instancas da classe

    //construtor:
    public AreaCirc(double raio){

        this.raio = raio;
    }

    public double area(){

        return pi*raio*raio;
    }
}
