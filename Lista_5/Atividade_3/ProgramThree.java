public class ProgramThree {
    public static void main(String args[]){
        
        Quadrado q = new Quadrado(10);
        Triangulo t = new Triangulo(6, 10);
        Circulo c = new Circulo(5);

        System.out.println("Área do quadrado = " + q.area());
        System.out.println("Área do triangulo = " + t.area());
        System.out.println("Área do circulo = " + c.area());

        q.rotacionar();
        t.desenhar();

    }
}
