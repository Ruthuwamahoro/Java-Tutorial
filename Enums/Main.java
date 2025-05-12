
public class Main {

    // you can't extends an enum and inherts

    enum Transport {
        PLANE(600), TRAIN(80), AUTOMOBILE(50);

        int speed;

        // creating constructor as in the class

        Transport(int s) {
            this.speed = s;
        }
    }
    public static void main(String[] args) {
        Transport tp = Transport.PLANE;
        if(tp == Transport.PLANE){
            System.out.println(Transport.PLANE);
        }

        // Methods that enums provide
        Transport allTransport[] = Transport.values();
        for(Transport t: allTransport){
            System.out.println(t);
        }

        // Getting the ordinal value of an enum

        System.out.println(Transport.AUTOMOBILE.ordinal());

        System.out.println(Transport.AUTOMOBILE.speed);
        
    }
}
