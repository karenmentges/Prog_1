public class InimigoVolatil extends Inimigo {
    private int vida = 100;

    Posicao p = new Posicao();
    Forca f = new Forca();
    Inimigo i = new Inimigo();

    public InimigoVolatil(Posicao p, Forca f){
        this.p = p;
        this.f = f;
    }

    @Override
    public int getVida(){
        return p.getX()+p.getY();
    }

    @Override
    public void setVida(int v){
        f.setA(v);
        f.setB(v);
    }

    @Override
    public int getEnergia(){
        return vida+i.getEnergia();
    }
}
