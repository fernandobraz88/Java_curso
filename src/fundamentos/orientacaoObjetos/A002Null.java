package fundamentos.orientacaoObjetos;

public class A002Null {

    public static void main(String[] args) {
        String s1 =""; //Variável vazia => gera endereço de referencia, porem sem conteudo
        System.out.println(s1.length());

        String s2 = null;//Variavel nula => o null não gera endereço de referencia
        System.out.println(s2.length());
    }
}
