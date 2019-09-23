public class Test10 {
    public static void main(String[] args) {
        float v1;
        float v2;
        System.out.println("Introdueix el primer num");
        v1 = Float.parseFloat(System.console().readLine());
        System.out.println("Introdueix el segon num");
        v2 = Float.parseFloat(System.console().readLine());     
        


        System.out.println("El resultat de sumar " + (int)v1 + " i " + (int)v2 + " es: " + (v1 + v2));
        System.out.println("El resultat de restar " + (int)v1 + " i " + (int)v2 + " es: " + (v1 - v2));
        System.out.println("El resultat de multiplicar " + v1 + " i " + v2 + " es: " + (v1 * v2));
        System.out.println("El resultat de dividir " + v1 + " i " + v2 + " es: " + (v1 / v2));
    }
}