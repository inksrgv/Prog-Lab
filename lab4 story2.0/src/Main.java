import java.util.Scanner;
interface Hit {
    String shot();
}

public class Main {
    public static void main(String[] args) {
        Hit hit = new Hit(){
          @Override
          public String shot(){
              return "Как это получается?";
          }

        };
        class LovelyMan{
            protected String name = "Её любимец";
            public String noBetter(){
                return name + " был ничуть не лучше";
            }
        }
        Hit newHit = () -> {
            return "Маленький мальчик с голубыми глазами - драчун?";
        };
        //создаем персонажей
        Human.Child child = new Human.Child();
        //Mother.Homily homily = new Mother.Homily();
        Mother.Brawler brawler = new Mother.Brawler();
        Human Mother = new Human("Мама", Gender.FEMALE);
        Human Mommy = new Human("Маме", Gender.FEMALE);


        //создаем объекты
        Objects Table = new Objects ("кухонному столу");
        Objects Head = new Objects("свою разбитую голову");
        Objects Sermon = new Objects("умиротворяющую проповедь");
        Objects Candy = new Objects(" свежие плюшки");
        Objects Choco = new Objects(" чашку горячего шоколада");
        Objects And = new Objects(" И ");

        System.out.println(Mother.sigh());

        System.out.println("Сколько камней швырнул Малыш?");
        Scanner rocksCounter = new Scanner(System.in) ;
        int rocksCount = rocksCounter.nextInt();
        try{
            System.out.println(child.threw(rocksCount));

        } catch (FindRunTimeException e){
            System.out.println(e.toString());
        }
        

        System.out.println(hit.shot());
        System.out.println(newHit.shot());
        System.out.println(child.setNear(Table));
        System.out.println(child.tookUp(Head));
        Mother.setFeel(Feelings.PACYFYING);
        System.out.println(Mother.conf(And) + Mommy.forced(Sermon));
        System.out.println(brawler.setDown(Feelings.GLOOMY));
        System.out.println(Mother.hurryUp(Candy));

        Mother mother = new Mother();


        try {
            System.out.println(mother.bring());
            System.out.println(mother.bring());
        }
        catch (FindException e){
            System.out.println(e.diabetes());
        }


    }
}