package aula55_enum_value_value_of;

import aula_enum_java.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {
        DiaSemana dia;

        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));

        dia = Enum.valueOf(DiaSemana.class,"SEGUNDA");

        System.out.println(dia);
    }
}
