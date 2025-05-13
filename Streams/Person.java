
import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<String> namesLists;
    private String names;

    public Person(String name) {
        this.namesLists = new ArrayList<>();
        this.namesLists.add(name);
    }

    public void addPeople(String name) {
        namesLists.add(name);
    }

    public List<String> getPeople() {
        return namesLists;
    }
    
}
