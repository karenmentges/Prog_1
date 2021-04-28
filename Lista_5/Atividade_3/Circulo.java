public class Circulo extends FormaGeo implements Rotacionavel, Desenhavel {
    public int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public void rotacionar(){
        System.out.println("Rotacionando Circulo");
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando Circulo");
    }
    
}