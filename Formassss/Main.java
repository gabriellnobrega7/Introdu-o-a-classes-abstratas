   package Formassss;

    public class Main {
    
    public static void main(String[] args) {
        
       Circulo c1 = new Circulo(3);
       Quadrado q1 = new Quadrado(4);

       System.out.println("Area do quadrado: " + q1.area());
       System.out.println("Comprimento do quadrado: " + q1.comprimento());

       System.out.println("Área do Círculo: " + c1.area());
       System.out.println("Comprimento do Círculo: " + c1.comprimento());
    }


}
