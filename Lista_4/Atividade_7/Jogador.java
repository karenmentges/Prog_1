public class Jogador extends Entidade {
    private int vida;

    public Jogador(int vida, int energia, int x, int y, int id, String h){
        super(energia, x, y, id, h);
        setVida(vida);

        System.out.println("Vida = " + vida);
    }

    public int getVida(){
        return this.vida;
    }

    public void setVida(int v){
        this.vida = v;
    }

}