public class ProgramEleven {

    public static void main(String args[]){
        int x = 5, y = 6, ouro = 10, vida = 500;

        System.out.println();
        System.out.print("e : ");
        UpEntidade e = new UpEntidade(x, y, vida);
        System.out.println();
        System.out.print("e2: ");
        UpEntidade e2 = new UpEntidade(); // inicializa todas os atributos com zero
        System.out.println();
        System.out.print("p : ");
        UpPersonagem p = new UpPersonagem(ouro, vida, x, y);
        System.out.println();
        System.out.print("p2: ");
        UpPersonagem p2 = new UpPersonagem(ouro, vida); // inicializa a posição em (0,0)
        System.out.println();
        System.out.println();
    
    }
   
}