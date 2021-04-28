class Son extends Father {
    public int id;
    
    public Son(int i){
        this(3.14);
        id = i;
    }
    
    public Son(double t){
        this();
    }
    
    public Son(){
        super(4);
        System.out.println("Son done!");
    }

}