package aula56_enum_metodos_abstratos;

public class TesteDoc {
    public static void main(String[] args) {
        /*for(TipoDocumento documento : TipoDocumento.values()) {
            System.out.println(documento + " - " + documento.geraNumeroTeste());
        }*/

        Pessoa pessoa = new Pessoa();
        pessoa.setIdentificacao(Enum.valueOf(TipoDocumento.class,"CPF"));
        pessoa.setNumero_identificacao(pessoa.getIdentificacao().geraNumeroTeste());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setIdentificacao(TipoDocumento.CNPJ);
        pessoa2.setNumero_identificacao(pessoa2.getIdentificacao().geraNumeroTeste());

        System.out.println(pessoa);
        System.out.println(pessoa2);
    }
}
