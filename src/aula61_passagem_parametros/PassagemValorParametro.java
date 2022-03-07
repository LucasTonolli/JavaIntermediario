package aula61_passagem_parametros;

public class PassagemValorParametro {
    public static void testePassagemPorReferencia(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Contato 2", "5678-1234", "contato2@email.com");
    }

    public static void testePassagemPorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato " + novoValor);
    }



    public static void main(String[] args) {
        Contato contato = new Contato("Contato 1","1234-5678", "contato1@email.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        //testePassagemPorReferencia(valor,contato);
        testePassagemPorReferencia2(valor,contato);


        System.out.println(contato);
        System.out.println(valor);
    }
}
