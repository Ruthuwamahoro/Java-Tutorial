
public class Pokemon {
    String name;
    int level;

    // this one is created as soon as object is created
    
    Pokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    void attack(){
        System.out.println("attack");
    }
}
