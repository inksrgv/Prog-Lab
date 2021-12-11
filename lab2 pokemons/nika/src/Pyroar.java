import ru.ifmo.se.pokemon.*;

public class Pyroar extends Pokemon  {
    public Pyroar(String name,int level){
        super(name,level);
        setType(Type.FIRE);
        setStats(86D,68D,72D,109D,66D,106D);
        setMove( new Facade(),new DoubleTeam(),new Rest(),new SwordsDance());
    }
}