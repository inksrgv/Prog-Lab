import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super();
        this. type = Type.NORMAL;
    }
    @Override
    protected String describe() { return "уклонився"; }
        protected void applySelfEffects(Pokemon p) {
            p.setMod(Stat.EVASION, +1);
        }
}