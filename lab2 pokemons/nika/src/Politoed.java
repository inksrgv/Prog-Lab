import ru.ifmo.se.pokemon.*;

public class Politoed extends Pokemon  {
    public Politoed(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(90D,75D,75D,90D,100D,70D);
        setMove(new Growl(),new Rest(),new Crunch(),new Tackle());
    }
}
