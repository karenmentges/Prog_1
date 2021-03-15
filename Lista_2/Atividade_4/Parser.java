package Lista_2.Atividade_4;

public class Parser {
    
    public Parser(){

    }

    public int analize(String vetor[], int n){
        String palavra = new String("token");
        int cont=0;
        char c;

        for(int i = 0; i < n; i++){
            if(palavra.equals(vetor[i])){
                cont++;
            }
            else{
                c = vetor[i];
                if(c=='h'){

                }
            }
        }
        return 0;
    }
}
