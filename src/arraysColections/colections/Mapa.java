package arraysColections.colections;

import java.util.HashMap;
import java.util.Map;

public class Mapa { //Armazena os dados por meio de sistema de chave/valor

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        //adicionando
        usuarios.put(1, "Fernando");
        usuarios.put(2, "Murilo");
        usuarios.put(3, "Aldro");
        usuarios.put(4, "Tony");
        usuarios.put(5, "Marcones");

        System.out.println(usuarios.size()); //exibe o tamanho do map
        System.out.println(usuarios.isEmpty()); //verifica se o mapa está vazio

        System.out.println(usuarios.keySet()); //exibe todas as chaves existentes
        System.out.println(usuarios.values()); //exibe todos os valores existentes
        System.out.println(usuarios.entrySet()); //exibe todas as combinaçoes chave valor

        System.out.println(usuarios.containsKey(6)); //verifica se no mapa possui a chave
        System.out.println(usuarios.containsValue("Marcones")); //verifica se no mapa possui o valor

        System.out.println(usuarios.get(3)); //retorna o valor correspondente a chave passada como parametro

        System.out.println(usuarios.remove(5)); //remove o registro pela chave


        //percorrendo os elementos de um Map:
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> usuario: usuarios.entrySet()) {
            System.out.println(usuario);

        }

    }
}
