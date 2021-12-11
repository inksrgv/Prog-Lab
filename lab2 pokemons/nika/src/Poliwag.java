import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon  {
    public Poliwag(String name,int level){
        super(name,level);
        setType(Type.WATER);
        setStats(40D,50D,40D,40D,40D,90D);
        setMove(new Growl(),new Rest());
    }
}
