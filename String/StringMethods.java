public class StringMethods {
    public static void main(String[] args) {
        /* string are immutable, we can't
         * 
         */
        String name = "Bro";

        //conparing strings
        boolean result = name.equals("Bro");
        System.out.println(result);

        //comparing strings by ignoring case

        boolean result2 = name.equalsIgnoreCase("bro");
        System.out.println(result2);

        //length methods

        int result3 = name.length();
        System.out.println(result3);

        //returning single characters

        char result4 = name.charAt(0);
        System.out.println(result4);

        //finding characters it's index

        int result5 = name.indexOf("B");
        System.out.println(result5);

        //finding characters it's last index

        int result6 = name.lastIndexOf("B");
        System.out.println(result6);

        //check if it is empty

        boolean result7 = name.isEmpty();
        System.out.println(result7);

        //change string to uppercase

        String result9 = name.toUpperCase();
        System.out.println(result9);

        //change it to lowercase

        String result10 = name.toLowerCase();
        System.out.println(result10);

        //trim the string
        String result11 = name.trim();
        System.out.println(result11);

        //replace the string
        String result12 = name.replace("B", "z");
        System.out.println(result12);

        //substring
        //endIndex is exclusive
        //startIndex is inclusive
        String result13 = name.substring(0, 2);
        System.out.println(result13);

        //string concatenation
        String name2 = " woww";
        String result14 = name.concat(name2);
        System.out.println(result14);

        //string concatenation using + operator
        String result15 = name + name2;
        System.out.println(result15);

        //string concatenation using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(name2);
        String result16 = sb.toString();
        System.out.println(result16);

        // splitting a string
        String name3 = "Bro, woww";
        String[] result17 = name3.split(", ");
        for(String s: result17){
            System.out.println(s);
        }
    }
}


