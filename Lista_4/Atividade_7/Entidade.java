public class Entidade extends Basico {
    private int energia;
    private Posicao posicao;

    public Entidade(int energia, int x, int y, int id, String[] h){
        super(id, h);
        setEnergia(energia);
        posicao.setX(x);
        posicao.setY(y);
        setPosicao(posicao);
        System.out.println("Energia = " + getEnergia() + "x = " + posicao.getX() + "y = " + posicao.getY() + "Posição = " + getPosicao());
    }

    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int e){
        this.energia = e;
    }

    public Posicao getPosicao(){
        return this.posicao;
    } 
    
    public void setPosicao(Posicao p){
        this.posicao = p;
    }
 
}