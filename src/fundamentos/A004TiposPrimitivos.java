package fundamentos;

public class A004TiposPrimitivos {
    //6 numericos e 2 não numericos

    /*Numericos: convencionalmente utiliza-se int e double
        inteiros
            byte: 1byte (-128 - 127)  1byte = 8 bits
            Short: 2bytes
            int: 4bytes
            long: 8bytes
        reais
            float: 4bytes
            double: 8bytes
     */

    /*Não-Numericos:
        char: corresponde um caractere ("A", " ", "?")
        boolean: true e false (corresponde a valore logicos)
     */

    public static void main(String[] args) {
        //utilizando tipos primitivos na pratica:


        //informaçoes do funcionario:
        //tipos numericos inteiros
        byte anosDeEmpresa = 23; //poderia armazenar até o numero 127
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados =  3_134_845_223L; //numeros do tipo long literais utiliza-se o _ no lugar do . e o L no final

        //tipos numericos reais
        float salario = 11_445.44F; // se nao por o F no final o java interpretará o valor como double
        double vendasAcumuladas = 2_998_123.03;

        //tipo booleano
        boolean ferias = false; // ou true

        //tipo caractere
        char status = 'A'; //ativo
    }
}
