package aula56_enum_metodos_abstratos;

public class Pessoa {
    private TipoDocumento identificacao;
    private String numero_identificacao;

    public Pessoa(TipoDocumento identificacao, String numero_identificacao) {
        this.identificacao = identificacao;
        this.numero_identificacao = numero_identificacao;
    }

    public Pessoa() {
    }

    public TipoDocumento getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(TipoDocumento identificacao) {
        this.identificacao = identificacao;
    }

    public String getNumero_identificacao() {
        return numero_identificacao;
    }

    public void setNumero_identificacao(String numero_identificacao) {
        this.numero_identificacao = numero_identificacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "identificacao=" + identificacao +
                ", numero_identificacao='" + numero_identificacao + '\'' +
                '}';
    }
}
