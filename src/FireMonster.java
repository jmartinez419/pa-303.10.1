public class FireMonster  extends  Monster{
    public FireMonster(String name) {
        super(name);
    }

    @Override
    String attack(){
        return "Attack with fire!";
    }
}
