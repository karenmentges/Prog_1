public class Triangulo extends FormaGeo implements Rotacionavel, Desenhavel {
    public int base;
    public int altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public void rotacionar(){
        System.out.println("Rotacionando Triangulo");
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando Triangulo");
    }
    
}