public class MainEntidade extends MainBasico {
    private int energia;
    private MainPosicao posicao;

    public MainEntidade(int energia, int x, int y, int id, String[] h){
        super(id, h);
        setEnergia(energia);
        posicao = new MainPosicao(x, y);
        setMainPosicao(posicao);
        System.out.println("Energia = " + getEnergia() + "\nPosição x = " + posicao.getX() + "\nPosição y = " + posicao.getY());
    }

    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int e){
        this.energia = e;
    }

    public MainPosicao getMainPosicao(){
        return this.posicao;
    } 
    
    public void setMainPosicao(MainPosicao p){
        this.posicao = p;
    }
 
}