public class Basico {
    private int id;
    private String rotulos[];

    public Basico(int id, String[] h){
        setId(id);
        setRotulos(h);
        System.out.println("Id = " + getId() + "String = " + getRotulos());
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