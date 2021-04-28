public class Circulo extends FormaGeo {
    public int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * this.raio * this.raio;
    }
}