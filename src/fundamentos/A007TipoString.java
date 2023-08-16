package fundamentos;

public class A007TipoString {

    public static void main(String[] args) {

    System.out.println("Fernando".charAt(0));//.charAt(index) após a string diz o caractere na posição escolhida

    String s = "Boa Tarde";

		System.out.println(s.concat("!!!!!"));
		System.out.println(s + "!"); //.concat() e + "" tem a finalidade de concatenar uma string ao conteudo da variavel

		System.out.println(s.toUpperCase());//muda todos os caracteres da string para letras maiusculas
		System.out.println(s.toLowerCase());//muda todos os caracteres da string para letras minusculas
		System.out.println(s.length());//conta quantos caracteres possui a string

    //Em strings compostas por 2 palavras:
		System.out.println(s.startsWith("boa"));// testa se a string inicia com a palavra descrita (retorna True ou False)
		System.out.println(s.endsWith("Tarde"));// testa se a string termina com a palavra descrita (retorna True ou False)

    //Comparativo de igualdade:
		System.out.println(s.equals("boa tarde"));//testa se a palavra descrita é a mesma contida na variável (true ou false)
		System.out.println(s.equalsIgnoreCase("boa tarde"));//faz o mesmo teste acima ignorando as diferenças de upper e low case (true ou false)

    //Formatando prints:

    String nome = "Pedro";
    String sobrenome = "Santos";
    int idade = 33;
    double salario = 12345.656;

    //forma convencional:
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

    //usando o printf() para uma formatação otimizada.

    //no printf() primeiro se escreve o texto junto com os caracteres especiais que serão substituidos pelas variaveis
    //%s para variaveis do tipo string
    //%d para variaveis do tipo inteiro
    //%f para variaveis do tipo float (.n antes do f para definir a quantidade de casas decimais)
    //por fim são descritas as variáveis na ordem de seus respectivos caracteres especiais
		System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalario: %.2f", nome, sobrenome, idade, salario);

    //usando variaveis:

    String dados = String.format("\n\nNome: %s \nSobrenome: %s \nIdade: %d \nSalario: %.2f", nome, sobrenome, idade, salario); //o String.format vai fazer a mesma função do printf()
		System.out.println(dados);
    }
}
