public class Quadrado extends FormaGeo {
    public int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double area(){
        return this.lado * this.lado;
    }
}
