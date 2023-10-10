package arraysColections.colections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //.offer() e .add() adicionam elementos numa fila
        fila.add("Ana");   //.add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("Joana"); //.offer() retorna falso caso a fila esteja cheia.
        fila.offer("Maria");
        fila.offer("José");
        fila.offer("João");

        //.peek() e .element() obtem o proximo elemento da fila (sem remover)
        System.out.println(fila.peek()); //.peek() retorna null caso a fila esteja vazia
        System.out.println(fila.element());//.element() gera uma excessão caso a fila esteja vazia

        //.size() exibe o tamanho da fila
        System.out.println(fila.size());

        //.isEmpty() retorna true ou false caso a lista esteja vazia
        System.out.println(fila.isEmpty());

        //.poll() e .remove() obtem o proximo elemento da fila removendo-o
        System.out.println(fila.poll()); // se a fila estiver vazia, retorna null
        System.out.println(fila.remove());// se a fila estiver vazia, gera uma excessão

        //.clar() esvazia a fila
        //.contains() verifica se o objeto está na fila

    }
}
