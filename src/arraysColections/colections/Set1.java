package arraysColections.colections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        //as colections não aceitam tipos primitivos,
        // fazem automaticamente a conversão para classe usando os wrappers
        //não possuem tamanho pre definido como os arrays e matrizes

        //adicionando itens ao conjunto:
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add(1);
        conjunto.add("teste");
        conjunto.add("X");

        System.out.println(conjunto.size()); //.size() refere-se ao tamanho da colection

        //removendo itens do conjunto:
        conjunto.remove("X");
        conjunto.remove(1);

        System.out.println(conjunto.size());

        //verificando se um elemento está contido no conjunto:
        System.out.println(conjunto.contains("teste"));
        System.out.println(conjunto.contains("X"));

        //outra forma de instanciar um conjunto
        Set nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);


        //uniao de conjuntos:
        conjunto.add(nums);


    }
}
