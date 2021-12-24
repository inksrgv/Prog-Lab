public class Mother {
    protected String name = "Мама";
    int CountTea = 0;

    public String stop() {
        return homily.dickhead();
    }

    public String bring() throws FindException {
        if (CountTea >= 1) {
            throw new FindException();
        }
        CountTea++;
        return name + " принесла горячий шоколад" + ".";
    }

    Homily homily = new Homily();

    protected class Homily {
        protected String name = "Умиротворяющая проповедь";

        public String dickhead() {
            return Mother.this.name + " вынуждена была прервать свою " + name;
        }
    }

    static class Brawler {
        protected String name = "Драчун-сын";

        public String setDown(Feelings feelings) {
            return (name + " сын сидел совсем мрачный.");
        }
    }
}
