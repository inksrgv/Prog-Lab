public class Objects extends AObjects{

    Objects(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public String tookUp(Objects o){
        return " обхватил свою " + o.getName() + ". ";
    }

    public String found(Objects o){
        return " не нашла что " + o.getName() + ". ";
    }

    public String forced(Objects o){
        return " пришлось оборвать " + o.getName() + ". ";
    }
    public String hurryUp(Objects o){
        return " поспешила поставить " + o.getName() + ". ";
    }

}
