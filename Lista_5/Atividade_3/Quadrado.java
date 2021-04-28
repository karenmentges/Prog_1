public class Quadrado extends FormaGeo implements Rotacionavel, Desenhavel {
    public int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double area(){
        return this.lado * this.lado;
    }

    @Override
    public void rotacionar(){
        System.out.println("Rotacionando Quadrado");
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando Quadrado");
    }
    
}
