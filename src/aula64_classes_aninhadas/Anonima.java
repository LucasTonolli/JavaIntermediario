package aula64_classes_aninhadas;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("Imprime qualquer texto");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
            public void imprimeTexto() {
                System.out.println("AAAA");
            }
        };
        anonima.imprimeTexto();
    }

    //usando interface

    Texto texto = new Texto(){
        @Override
        public void imprimeTexto(){
            System.out.println("Qualquer texto");
        }
    };
}
