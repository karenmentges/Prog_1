public class Character extends FlxSprite {

    public Character(String j, boolean b, String n, int x, int y){
        super(j);
        setAlive(b);
        loadGraphics(n);
        reset(x, y);
        imprime(j);
    }
    
}
