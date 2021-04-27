public class Boid extends Entidade {
    private int energia;
    private Forca velocidade;

    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int e){
        this.energia = e;
    }

    public Forca getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade(Forca f){
        this.velocidade = f;
    }

}