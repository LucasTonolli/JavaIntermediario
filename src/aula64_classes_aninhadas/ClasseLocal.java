package aula64_classes_aninhadas;

public class ClasseLocal {
    public void metodoQualquer(){
        class ClasseLocal1{
            private String texto = "texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal1 cl1 = new ClasseLocal1();
        cl1.imprimeTexto();
    }

    public static void main(String[] args) {
        ClasseLocal cl = new ClasseLocal();
        cl.metodoQualquer();
    }
}
