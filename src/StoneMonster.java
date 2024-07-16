public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    String attack(){
        return "Attack with Stone!";
    }
}
