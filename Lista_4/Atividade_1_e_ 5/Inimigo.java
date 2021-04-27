public class Inimigo extends Boid {
    private int vida;

    public int getVida(){
        return this.vida;
    }

    public void setVida(int v){
        this.vida = v;
    }

    public Inimigo achaAlvoMaisProximo(Inimigo i[]){
        Posicao p = new Posicao();
        Forca f = new Forca();
        Inimigo inimigo = new Inimigo();

        for(int j=0; j<i.length; j++){
            Posicao pi = new Posicao();
            pi = i[j].getPosicao();
            Forca fi = new Forca();
            fi = i[j].getVelocidade();
            
            if(p.getX() == pi.getX() && p.getY() == pi.getY()){
                if(f.getA() == fi.getA() && f.getB() == fi.getB()){
                    inimigo = i[j];
                }
            }
        }

        return inimigo;
    }

    public void imprime(Inimigo i[]){
        System.out.println(achaAlvoMaisProximo(i));
    }

}
