public class Human extends AHuman {

    Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if (gender.equals(Gender.FEMALE)) {
            ending = "ла";
        } else ending = "л";
    }


    public String setNear(Objects objects) {
        return (name + " присел к " + this.gender.getGenderCase() + objects.getName() + ".");
    }

    public String tookUp(Objects objects) {
        if (feel == Feelings.BROKEN) {
            return (name + " обхватил " + this.gender.getGenderCase() + " свою разбитую " + objects.getName() + ".");
        } else {
            return (name + " обхватил " + this.gender.getGenderCase() + objects.getName() + ".");
        }
    }
    public String sigh(){
        return (name + " вздохнула" + ".");
    }
    public String conf(Objects objects) {
        return (name + " не нашла что ответить " + objects.getName());
    }

    public String forced(Objects objects) {
        if (feel == Feelings.PACYFYING) {
           return (name + " пришлось оборвать свою" + "умиротворяющую проповедь" + objects.getName() + ".");
        } else {
            return (name + " пришлось оборвать свою " + objects.getName() + ".");
       }
    }

    public String setDown(Feelings feelings) {
        if (feel == Feelings.GLOOMY) {
            return (name + " сын сидел совсем мрачный.");
        } else {
            return (name + " сын сидел совсем мрачный" + ".");
        }
    }

    public String hurryUp(Objects o) {
        return (name + " поспешила поставить перед ним" + o.getName() + " .");
    }

    public String hurryUp(Objects obj, Objects obj2) {
        return (name +  " поспешила поставить перед ним" + obj.getName() + " и " + obj2.getName() + " .");
    }

    protected static class Child{
        String name = "Малыш";
        public String threw(int rocks) {
            if (rocks <= 0)
                throw new FindRunTimeException();
            return "Было ясно, что не один " + name + " при случае швыряется камнями.";

        }
        public String setNear(Objects objects) {
            return (name + " присел к " + objects.getName() + ".");
        }
        public String tookUp(Objects objects) {
            return (name + " обхватил " + objects.getName() + ".");
        }
    }
}