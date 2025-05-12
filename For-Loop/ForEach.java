public class ForEach {
    public static void main(String[] args) {
        
        //storing multiple values in single variable


        String[] cars = {"Camaro", "Corvette", "Mustang", "Charger", "Challenger"};
        //accessing array elements
        for(String car: cars){
            System.out.println(car);
        }
    }
}
