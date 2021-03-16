public class Parser {
    
    public Parser(){

    }

    public static int analize(String vetor[], int n){
        String palavra = new String("token");
        int cont=0;
        //char c;

        for(int i = 0; i < n; i++){
            if(palavra.equals(vetor[i])){
                cont++;
            }
            else {
                String p = new String();
                p = vetor[i];
                char result = p.charAt(0);
                if(result == 'h'){
                    cont++;
                }
            }
        }
        return cont;
    }
}
