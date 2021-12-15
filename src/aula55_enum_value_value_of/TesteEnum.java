package aula55_enum_value_value_of;

import aula54_enum_como_classe.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for(DiaSemana dia: dias){
            System.out.println(dia.toString() + ' ' + dia.getValor());
        }
        for(DiaSemana dia: DiaSemana.values())
            System.out.println(dia.toString());
    }
}
