package orientacaoObjetos.Exercicio02;

public class DataMain {

    public static void main(String[] args) {

        Data d1 = new Data(26,10,1988);

        System.out.println(d1.dataFormat());

        Data d2 = new Data();
        d2.dia = 17;
        d2.mes = 5;
        d2.ano = 1995;

        System.out.printf("%d/%d/%d", d2.dia,d2.mes,d2.ano);
    }
}
