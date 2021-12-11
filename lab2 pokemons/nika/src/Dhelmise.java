import ru.ifmo.se.pokemon.*;

public class Dhelmise extends Pokemon  {
    public Dhelmise(String name,int level){
        super(name,level);
        setType(Type.GHOST, Type.GRASS);
        setStats(70D,131D,100D,86D,90D,40D);
        setMove( new Swagger(),new Slam(),new MuddyWater());
    }
}
