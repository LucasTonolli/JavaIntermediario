package exercicio_enum;

public enum Operacoes {
    ADICAO("+"){
        @Override
        public double executarOperacao(double x, double y){
            return x + y;
        }
    }, SUBTRACAO("-"){
        @Override
        public double executarOperacao(double x, double y){
            return x - y;
        }
    }, MULTIPLICACAO("*"){
        @Override
        public double executarOperacao(double x, double y){
            return x * y;
        }
    }, DIVISAO("/"){
        @Override
        public double executarOperacao(double x, double y){
            return x / y;
        }
    };

    private String operacao;

    Operacoes(String operacao){
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return  operacao;
    }

    public abstract double executarOperacao(double x, double y);
}
