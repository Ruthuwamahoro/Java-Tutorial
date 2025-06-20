import java.util.HashMap;
import java.util.Map;


public class Example {
    public static void main(String[] args){
        Map<String, String> students = new HashMap<>();
        students.put("name", "John Doe");
        students.put("age", "20");
        students.put("major", "Computer Science");
        students.put("university", "XYZ University");

        System.out.println(students);
        System.out.println("Name: " + students.get("name"));
        System.out.println("Age: " + students.get("age"));
        System.out.println("Size: " + students.size());
        System.out.println("is map empty? " + students.isEmpty());
        System.out.println("Contains key: "+ students.containsKey("major"));
        System.out.println("contains value: " + students.containsValue("John Doe"));
        System.out.println("get values: " + students.values());
        System.out.println("students: " + students.entrySet() );
        System.out.println("students key set" + students.keySet());


        for(Map.Entry<String, String> student: students.entrySet()){
            System.out.println("-----------Keys: " + student.getKey() + " ------ " + student.getValue());
        }
    }
}
