public class ProgramTen {
    public static void main(String[] args){
        Father f = new Father();
        Son s = new Son();

        f.setLado(2);
        f.translada(5, 6);
        System.out.println(f.debug());
        
        s.setLado(10);
        s.translada(10, 11);
        s.escala(0.5);
        System.out.println("Lado encolhido: " + s.getLado());
        System.out.println(s.debug());
    }
}