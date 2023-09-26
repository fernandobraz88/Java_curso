package desafios.DesafioJantar;

public class Pessoa {

    String nome;
    double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        System.out.println(nome + " comeu " + comida.nome + "\n");
        peso += comida.peso;
    }

    public void mostrarPeso(){
        System.out.println("Nome: "+ nome);
        System.out.println("Peso: "+ peso + "\n");
    }
}
