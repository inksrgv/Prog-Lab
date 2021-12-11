import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
        pokemon.setMod(Stat.HP, +6);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}