package fundamentos.orientacaoObjetos.EqualsHashcode;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Fernando Braz","fernandobraz@gmail.com");

        Usuario u2 = new Usuario("Fernando Braz","fernandobraz@gmail.com");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        //o equals por padrão tem a mesma função do ==, porem, assim como o construtor, pode ser reconfigurado
        //a propria IDE pode gerar os metodos Equals, Hashcode, Construtor e Get Set.
    }
}
