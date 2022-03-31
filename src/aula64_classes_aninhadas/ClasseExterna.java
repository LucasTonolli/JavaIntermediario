package aula64_classes_aninhadas;

public class ClasseExterna {
    private String texto = "OI";

    public class ClasseInterna{
        private String texto = "interno";

        private void ImprimeTexto(){
            System.out.println(texto);

            System.out.println(ClasseExterna.this.texto);
        }
    }

    public static void main(String[] args) {
        ClasseExterna externa = new ClasseExterna();
        ClasseInterna interna = externa.new ClasseInterna() ;
    }
}
