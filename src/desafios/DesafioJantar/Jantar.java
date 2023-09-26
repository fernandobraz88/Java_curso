package desafios.DesafioJantar;

public class Jantar {

    public static void main(String[] args) {

        //Pessoas:
        Pessoa p1 = new Pessoa("João",87.5);
        Pessoa p2 = new Pessoa("Maria",64.7);

        //Pratos:
        Comida arroz = new Comida("Porção de arroz", 0.300);
        Comida peixe = new Comida("File de peixe", 0.200);
        Comida salada = new Comida("Salada", 0.100);
        Comida batata = new Comida("Porção de batata fritas", 0.150);
        Comida sobremesa1 = new Comida("Pudim", 0.080);
        Comida sobremesa2 = new Comida("Mousse", 0.050);

        //Jantar:
        System.out.println("As 19:00 começou o jantar \n");
        p1.mostrarPeso();
        p2.mostrarPeso();

        p1.comer(arroz);
        p2.comer(salada);
        p1.comer(peixe);
        p2.comer(batata);
        p1.comer(batata);
        p2.comer(peixe);
        p1.comer(peixe);
        p2.comer(salada);
        p1.comer(sobremesa1);
        p2.comer(sobremesa2);

        System.out.println("As 21:00 o jantar terminou \n");
        p1.mostrarPeso();
        p2.mostrarPeso();
    }
}
