public class MainBasico {
    private int id;
    private String rotulos[];

    public MainBasico(int id, String[] h){
        setId(id);
        setRotulos(h);
        System.out.println("Id = " + getId());

        System.out.print("String = ");        
        for(int i=0; i<h.length; i++){
            System.out.print(h[i] + " ");
        }
        System.out.println(" ");   
    }

    public int getId(){
        return this.id;
    }

    public void setId(int i){
        this.id = i;
    }

    public String[] getRotulos(){
        return this.rotulos;
    }

    public void setRotulos(String[] r){
        this.rotulos = r;
    }

}