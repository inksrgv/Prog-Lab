import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl() {super(Type.NORMAL,0.0,0.0); }
    @Override
    protected java.lang.String describe() {
        return "Growl lowers the target's Attack by one stage.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.ATTACK, -1);
        p.addEffect(effect);
    }
}