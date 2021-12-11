import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Pokemon  {
    public Poliwhirl(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(65D,65D,65D,50D,50D,90D);
        setMove( new Growl(),new Rest(),new Crunch());
    }
}