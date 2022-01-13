package aula59_static_import;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; IMPORTA TODOS OS MÉTODOS
public class StaticImport {
    public static void main(String[] args) {

        double a,b,c;
        a = 2;
        b = 3;
        c = 4;

        System.out.println(pow(a,b));//System.out.println(Math.pow(a,b));
        System.out.println(sqrt(c));//System.out.println(Math.sqrt(a,b));
    }
}
