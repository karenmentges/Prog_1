public class MainFather {
    private int x, y, lado;
    
    public int getLado(){
        return lado;
    }
    
    public void setLado(int l){
        lado = l;
    }
    
    public int area(){
        return lado * lado;
    }
    
    public void translada(int a, int b){
        x = a;
        y = b;
    }
    
    public String debug(){
        return getLado() + " (" + x + "," + y + ") = " + area();
    }

    public void escala(double e){
        lado *= e;
    }

}