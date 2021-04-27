public class Services extends Inimigo{ 
    public static int contaPossiveisCandidatos(Inimigo i[]){
        int cont = 0;
        Posicao p = new Posicao();
        Forca f = new Forca();

        for(int j=0; j<i.length; j++){
            p = i[j].getPosicao();
            f = i[j].getVelocidade();

            if(p.getX()>100 || p.getY()>100 || p.getX()>100 && p.getY()>100){
                if(i[j].getEnergia()<=50 && f.tamanho()==200){
                    cont++;
                }
            }
        }

        return cont;
    }

    public void imprime(Inimigo i[]){
        System.out.println(contaPossiveisCandidatos(i));
    }
}
