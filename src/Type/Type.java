package Type;

public class Type {
    String name;
    Effective attacking;
    Effective defending;

    public Type(String name){
        this.name=name;
        attacking = new Effective();
        defending = new Effective();
    }

}
