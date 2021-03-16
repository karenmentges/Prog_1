public class Dicionario {
    public static Var tabela[] = new Var[50];
    public static Var v = new Var();

    public Dicionario(){
        
    }

    public static Var getVariavelByNome(String nome){

        for(int i=0; i<50; i++){
            if(nome.equals(tabela[i])){
                return tabela[i];
            }
        }  
    }
}
