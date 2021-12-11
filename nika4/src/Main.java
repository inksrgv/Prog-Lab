public class Main {
    public static void main(String[] args) {
        //создаем персонажей
        Human Child = new Human("Малыш", Gender.MALE);
        Human Brawler = new Human("Драчун", Gender.MALE);
        Human Mother = new Human("Мама", Gender.FEMALE);
        Human Mommy = new Human("Маме", Gender.FEMALE);

        //создаем объекты
        Objects Table = new Objects ("кухонному столу");
        Objects Head = new Objects("свою разбитую голову");
        Objects Sermon = new Objects("умиротворяющую проповедь");
        Objects Candy = new Objects("свежие плюшки");
        Objects Choco = new Objects(" чашку горячего шоколада");

        Objects And = new Objects(" И ");


        System.out.println(Child.setNear(Table));
        System.out.println(Child.tookUp(Head));
        Mother.setFeel(Feelings.PACYFYING);
        System.out.println(Mother.conf(And) + Mommy.forced(Sermon));
        Child.setFeel(Feelings.GLOOMY);
        System.out.println(Brawler.setDown(Feelings.GLOOMY));
        System.out.println(Mother.hurryUp(Choco, Candy));

    }
}