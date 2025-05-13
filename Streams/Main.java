
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        Person person = new Person("ruth");
        
        person.addPeople("Esther");
        person.addPeople("Emma");
        person.addPeople("Gihozo");
        person.addPeople("Samuel");
        person.addPeople("Martine");
        person.addPeople("Ingabire");
        List<String> getAllPeople = person.getPeople();

        //forEach loop

        getAllPeople.forEach(per -> System.out.println(per));

        //filtering
        List<String> hundreds = getAllPeople.stream().filter(per -> per.startsWith("E")).collect(Collectors.toList());
        System.out.println(hundreds);

        //mapping
        List<String> collect = getAllPeople.stream().map(per -> per.toUpperCase()).collect(Collectors.toList());

        //sorting
        List<String> sortedArray = getAllPeople.stream().sorted(Comparator.comparing((per -> per))).collect(Collectors.toList());
        System.out.println("Sorted array:  "+ sortedArray);

        System.out.println(collect);

        
    }
}