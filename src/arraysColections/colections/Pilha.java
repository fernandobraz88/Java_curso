package arraysColections.colections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        //adicionando: .add e .push
        livros.add("O pequeno principe"); //exception
        livros.push("Don Quixote"); //false
        livros.push("O Hobbit");

        //exibindo: .peek e . element
        System.out.println(livros.peek()); //null
        System.out.println(livros.element()); //exception

        //removendo: .poll e .pop
        System.out.println(livros.poll());//null
        System.out.println(livros.pop()); //exception

        //.size()  .clear()  .contains()  isEmpty() igual a Fila

        //uma das diferenças entre a pilha e a fila é a ordem de processamento de dados.
        //Fila: o primeiro dado de entrada será o primeiro processado
        //Pilha: o ultimo dado de entrada será o primeiro processado
    }
}
