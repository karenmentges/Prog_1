public class UpPersonagem extends UpEntidade {
    private int ouro;
    private UpItem[] itens;

    public UpPersonagem(int ouro, int vida){
        super(vida);
        this.ouro = ouro;

        System.out.print(" Ouro = " + this.ouro);
    }

    public UpPersonagem(int ouro, int vida, int x, int y){
        super(x, y, vida);
        this.ouro = ouro;

        System.out.print(" Ouro = " + this.ouro);
    }

    public int getOuro(){
        return this.ouro;
    }

    public void setOuro(int o){
        this.ouro = o;
    }

    /*public UpItem[] getItens(){
        return this.itens;
    }

    public void setItens(UpItem[] i){
        this.itens = i;
    }*/
}
