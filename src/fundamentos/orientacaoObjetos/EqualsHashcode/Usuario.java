package fundamentos.orientacaoObjetos.EqualsHashcode;

public class Usuario {

    String nome, email;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object obj) {
        Usuario parametro = (Usuario) obj; //fazendo um cast
        boolean nomeEquals = this.nome.equals(parametro.nome);
        boolean emailEquals = this.email.equals(parametro.email);

        return nomeEquals && emailEquals;
    }
}
