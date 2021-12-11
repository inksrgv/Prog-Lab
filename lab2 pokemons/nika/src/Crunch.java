import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
    public Crunch() {
        super(Type.DARK,80,100);
    }
    @Override
    protected java.lang.String describe() {
        return "Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.chance(0.2);
        Effect.confuse(p);
    p.addEffect(effect);
    }
}