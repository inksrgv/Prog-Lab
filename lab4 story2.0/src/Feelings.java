public enum Feelings {
    BROKEN("разбитую"),
    PACYFYING("умиротворяющая"),
    GLOOMY("мрачный"),
    HOT("горячие"),
    FRESH("свежие");

    private final String feel;

    Feelings(String feel) {
        this.feel = feel;
    }

    public String getFeel(){
        return feel;
    }
}