import ru.ifmo.se.pokemon.*;
public class Main {
public static void main(String... args) {
    Battle battle = new Battle();
    battle.addAlly(new Dhelmise("Dhelmise", 1));
    battle.addAlly(new Litleo("Litleo", 1));
    battle.addAlly(new Pyroar("Pyroar", 1));
    battle.addFoe(new Poliwag("Polywag", 1));
    battle.addFoe(new Poliwhirl("Poliwhirl", 1));
    battle.addFoe(new Politoed("Politoed", 1));
    battle.go();
    }
}