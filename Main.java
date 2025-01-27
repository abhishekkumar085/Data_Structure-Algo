import java.util.HashMap;
import java.util.Map;

/*
 * create a hashmap using java HashMap Class to store the following pair Person and age to display them.
 * example:-
 * Abhi 24
 * Sital 15
 */

class Main{
    static void HashMapMethods(){
        // syntax
        Map<String,Integer> mp=new HashMap<>();
        // Adding Elements
        mp.put("Abhi", 21);
        mp.put("Vivek", 22);
        mp.put("Vishal", 23);
        mp.put("srbh", 24);
        // Getting Value from the hashmap

        System.out.println(mp.get("Abhi"));
        // Changing and upadating the value
        mp.put("srbh", 25);
        System.out.println(mp.get("srbh"));
        System.out.println(mp.remove("srbh"));

        // check if key exist in HashMap
        System.out.println(mp.containsKey("srbh"));
        System.out.println(mp.containsKey("Abhi"));

        // Adding a new entry in HashMap if Key is already does not exist

        // there are two ways to do-
        // 1.

        if(!mp.containsKey("Abhi")) mp.put("Abhi",34);

        // 2.

        mp.putIfAbsent("Surendra", 54);
        mp.putIfAbsent("Abhi", 43);


        // Get All the keys in the HashMap-
        System.out.println(mp.keySet());
        // Get All the Values in the HashMap-
        System.out.println(mp.values());
        // Get All Entries
        System.out.println(mp.entrySet()); 


        // Traversing all entries
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));

        }
        System.out.println();
        
        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}