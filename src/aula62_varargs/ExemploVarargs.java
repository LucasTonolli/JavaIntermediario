package aula62_varargs;

public class ExemploVarargs {
    public static void main(String[] args) {
        //System.out.println(soma(1,2));

        int[] vetor = {1,2,3,5,4};

        System.out.println(soma(vetor));
        System.out.println(soma(1,2,3,4,5,6,6,8));
    }

    static int soma(int a, int b, int c) {
        return a + b + c;
    }
    static int soma(int a, int b){
        return a + b;
    }

    static int soma(int [] vetor){
        int total = 0;

        for(int i = 0; i < vetor.length; i++)
            total+=vetor[i];

        return total;
    }

    //Varargs
    static int soma(Integer... vetor){
        int total = 0;

        for(int i = 0; i < vetor.length; i++)
            total += vetor[i];

        return total;
    }
}
