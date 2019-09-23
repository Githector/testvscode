public class Calc{
    public static void main(String[] args) {
        float a;
        float b;

        System.out.println("Introdueix el primer número");
        String as=System.console().readLine();
        a=Float.parseFloat(as);


        System.out.println("Introdueix el segon número");
        String bs=System.console().readLine();
        b=Float.parseFloat(bs);


        System.out.println("La suma entre "+(int)a+" i "+(int)b+" és: "+(int)(a+b));
        System.out.println("La resta entre "+(int)a+" i "+(int)b+" és: "+(int)(a-b));
        System.out.println("El producte entre "+(int)a+" i "+(int)b+" és: "+(int)(a*b));
        System.out.println("La divisió entre "+(int)a+" i "+(int)b+" és: "+(a/b));

    }
}