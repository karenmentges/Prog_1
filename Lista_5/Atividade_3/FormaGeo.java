abstract class FormaGeo {
    public int x;
    public int y;
    
    abstract public double area(){ }

    public void rotacionar(){
        System.out.println("Rotacionando forma geométrica");
    }

    public void desenhar(){
        System.out.println("Desenhando forma geométrica");
    }
}