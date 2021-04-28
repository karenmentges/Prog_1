public class UpEntidade {
    private int vida;
    private UpPosicao posicao;
    
    public UpEntidade(){
        UpPosicao p = new UpPosicao(0, 0);
        setUpPosicao(p);
        this.vida = 0;

        System.out.print("x = " + posicao.getX() + " y = " + posicao.getY() + " Vida = " + this.vida);
    }

    public UpEntidade(int vida){
        UpPosicao p = new UpPosicao(0, 0);
        setUpPosicao(p);
        this.vida = vida;

        System.out.print("x = " + posicao.getX() + " y = " + posicao.getY() + " Vida = " + this.vida);
    }

    public UpEntidade(int x, int y, int vida){
        UpPosicao p = new UpPosicao(x, y);
        setUpPosicao(p);
        this.vida = vida;

        System.out.print("x = " + posicao.getX() + " y = " + posicao.getY() + " Vida = " + this.vida);
    }

    public int getUpVida(){
        return this.vida;
    }

    public void setUpVida(int v){
        this.vida = v;
    }

    public UpPosicao getUpPosicao(){
        return this.posicao;
    }

    public void setUpPosicao(UpPosicao p){
        this.posicao = p;
    }

}
