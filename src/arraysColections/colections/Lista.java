package arraysColections.colections;

import fundamentos.orientacaoObjetos.EqualsHashcode.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        ArrayList<ListaUsuario> lista = new ArrayList<>();

        ListaUsuario u1 = new ListaUsuario("Fernando");

        //1 - Adicionando itens na lista (.add)
        lista.add(u1);

        lista.add(new ListaUsuario("Carlos"));
        lista.add(new ListaUsuario("Junior"));
        lista.add(new ListaUsuario("Ana"));
        lista.add(new ListaUsuario("Luiza"));


        //A lista sempre vai respeitar a ordem de inseção dos ojetos dentro dela

        for (ListaUsuario u: lista) {
            System.out.println(u.nome);
        }

        //2 - Acessando um objeto pelo indice dentro da lista (.get)
        System.out.println("\n"+lista.get(3).nome);

        //3 - Removendo itens de 1 lista (.remove):
        //pelo indice:
        lista.remove(0);

        //pelo nome: (só será possivel implementando o equals e hashcode)
        lista.remove(new ListaUsuario("Luiza"));

        for (ListaUsuario u: lista) {
            System.out.println(u.nome);
        }

        //4 - Verificando se um objeto está contido na lista (.contains)
        System.out.println("tem? " + lista.contains(new ListaUsuario("Junior")));
        System.out.println("tem? " + lista.contains(u1));

        //5 - verificando o tamanho da lista (.size)
        System.out.println(lista.size());
    }
}
