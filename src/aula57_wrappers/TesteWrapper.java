package aula57_wrappers;

public class TesteWrapper {
    public static void main(String[] args) {
        //Tipos primitivos
        short a = 1;
        byte b = 10;
        int c = 100;
        long d = 1000;//1000l ou 1000L
        float e = 10.56f;
        double f = 2.2555;
        boolean g = true;
        char h = 'h';

        Short num1 = new Short((short)1);
        Byte num2 = new Byte((byte)10);
        Integer num = new Integer(12);
        Long num3 = new Long((long) 120000.6);
        Float num4 = new Float(15.6f);
        Double num5 = new Double(152.66);
        Boolean flag = new Boolean(true);
        //Character f = new Character('b');

        Integer num10 = new Integer("1000");
        Integer num10_2 = 1000;
        Long num11 = num10_2.longValue();
        int num12 = Integer.parseInt("10000");

        double num17 = Double.parseDouble("123.333");

        Integer num15 = Integer.valueOf(1343);
        System.out.println(num15);
    }
}
