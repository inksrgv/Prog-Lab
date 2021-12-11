import ru.ifmo.se.pokemon.*;

public class Litleo extends Pokemon  {
    public Litleo(String name,int level){
        super(name,level);
        setType(Type.FIRE);
        setStats(62D,50D,58D,73D,54D,72D);
        setMove( new Facade(),new DoubleTeam(),new Rest());
    }
}
