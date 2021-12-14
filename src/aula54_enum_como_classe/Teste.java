package aula54_enum_como_classe;

public class Teste {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString() + " - " + dia.getValor());
        Data data = new Data(01,12,2021,DiaSemana.SEXTA);
    }
}
