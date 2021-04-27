public class Entidade {
    private int id;
    private Posicao posicao;

    public int getId(){
        return this.id;
    }

    public void setId(int i){
        this.id = i;
    }

    public Posicao getPosicao(){
        return this.posicao;
    } 
    
    public void setPosicao(Posicao p){
        this.posicao = p;
    }

}