public class WaterMonster extends Monster{
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    String attack(){
        return "Attack with water!";
    }
}
