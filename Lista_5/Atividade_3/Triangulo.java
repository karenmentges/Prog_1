public class Triangulo extends FormaGeo {
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
}