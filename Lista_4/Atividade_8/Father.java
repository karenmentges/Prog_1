class Father extends Grandfather {
    private String name;
    
    public Father(int i){
        this("Father");
    }
    
    public Father(String h){
        super("ok");
        name = h;
        System.out.println(h + " almost");
    }

}