class FlxSprite extends FlxObject {  
    private String graphic;  
    private boolean alive; 
    public int x, y;
    
    public FlxSprite(String j) {    
        super(j);  
    }  

    void setAlive(boolean b) {    
        alive = b;  
    }  

    void loadGraphics(String n) {    
        graphic = n;  
    }  

    void reset(int x, int y) {    
        this.x = x; 
        this.y = y;  
    }
}