package arraysColections.colections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set2 {

    public static void main(String[] args) {


        //criando uma lista homogenea (apenas como mesmo tipo de dados)
        Set<Integer> conjunto = new HashSet<Integer>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);

        /*Por se tratar de um Conjunto homogeneo, facilita a manipulação dos dados dentro dele.
        No entanto se não for declarado um parametro de ordenação, os dados serão acessados de forma aleatorea.*/
        //ex:

        for(Integer num : conjunto) {
            System.out.println(num);
        }
        System.out.println();
        // no caso os nomes serão exibidos de forma aleatórea

        /*Para criar um conjunto ordenado (que respeite a ordem de inserção) deve-se fazer da seguinte forma:*/

        SortedSet<String> conjuntoOrdenado = new TreeSet<String>();
        conjuntoOrdenado.add("Ana");
        conjuntoOrdenado.add("Jose");
        conjuntoOrdenado.add("Lucas");
        conjuntoOrdenado.add("Fernando");

        for (String nome : conjuntoOrdenado) {
            System.out.println(nome);
        }
    }
}
