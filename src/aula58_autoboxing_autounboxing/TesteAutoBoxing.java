package aula58_autoboxing_autounboxing;



public class TesteAutoBoxing {

    public static void main(String[] args) {
        //AutoBoxing → A partir do Java 5
        Integer num = 10;
        Double num2 = 3.569;
        Short num3 = 1;

        //Auto unboxing
        int num4 = num;

        System.out.println(num++);
        System.out.println(num/++num4);

    }
}
