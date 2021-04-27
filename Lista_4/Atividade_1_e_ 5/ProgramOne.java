public class ProgramOne {

    public static void main(String args[]){
        Inimigo[] inimigo = new Inimigo[5];
        Inimigo ini = new Inimigo();
        Forca forca = new Forca();
        Posicao posicao = new Posicao();
        Services service = new Services();
        int x = 40;

        forca.setA(2000);
        forca.setB(10);
        posicao.setX(102);
        posicao.setY(150);

        for(int i=0; i<5; i++){
            inimigo[i] = new Inimigo();
            inimigo[i].setEnergia(x);
            inimigo[i].setVelocidade(forca);
            inimigo[i].setPosicao(posicao);
            x = x + 20;
        }
        
        service.imprime(inimigo);

        ini.imprime(inimigo);
      
    }
   
}