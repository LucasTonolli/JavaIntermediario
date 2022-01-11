package exercicio_enum;

public class TesteCalculadoraEnum {

    public static void main(String[] args) {
        for(Operacoes calculo : Operacoes.values())
            System.out.println( "20 "+ calculo +" 3.2 = " + calculo.executarOperacao(20,3.2));
    }
}
