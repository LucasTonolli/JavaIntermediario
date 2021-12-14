package aula54_enum_como_classe;

public class Formulario {
    private String nome;
    private GENERO genero;
     enum GENERO{
        MASCULINO('M'), FEMININO('F');
        private char valor;

        GENERO(char valor){
            this.valor = valor;
        }

     }

}
