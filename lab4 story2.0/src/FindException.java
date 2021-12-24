public class FindException extends Exception{
    public String diabetes(){
        return "Куда столько сладкого драчуну, у него диабет.";
    }
}

class FindRunTimeException extends RuntimeException{
    public String toString() {
        return "Малыш не мог кинуть 0 или меньше камней";
    }
    //public String heads(){
        //return "Введи положительное количество голов";
    //}
}