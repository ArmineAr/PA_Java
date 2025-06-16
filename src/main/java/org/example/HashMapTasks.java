package org.example;

import java.util.*;
import java.util.stream.Stream;



public class HashMapTasks {
    public static Map<String, String> contactMap = new HashMap<>();
    //its outside main so we need to make it static to use it in main without object
        public static void main(String[] args) {

            //HOMEWORK ________________________________________________________
        //1 Word Counter
        //	•	Read a sentence from the console.
        //	•	Count the frequency of each word using a HashMap<String, Integer>.
        //TODO -- done in class
            String text = "barev aaa ggg aaa sss aaa";

            String [] words = text.split(" ");
            Stream.of(words).forEach(a-> System.out.println(a)); //TODO ??

            Map<String, Integer> countsMap = new HashMap<>();

            for (String anyVar: words) {
                if (countsMap.get(anyVar) == null) { //if there is no entry in the map with "bareve" key
                    countsMap.put(anyVar, 1);
                }else {
                    int currentCount = countsMap.get(anyVar);
                    countsMap.put(anyVar, currentCount + 1);
                }
            }
            System.out.println(countsMap);
        //    System.out.println(new TreeMap<>(countsMap)); for sorting keys
        // 2.	Phone Book
        //	•	Create a HashMap<String, String> to store names and phone numbers.
        //	•	Implement functions to: •	Add a contact, Delete a contact, Search by name
            //TODO -- done in class

            boolean isAlive = true;
            Scanner scanner = new Scanner(System.in);

            while (isAlive) { //to make the scanner run all the time
                System.out.println("Type 1 for add contact");
                System.out.println("Type 2 for delete contact");
                System.out.println("Type 3 for search contact");
                System.out.println("Type any other for for exit");

                switch (scanner.next()) {
                    case "1":
                        System.out.println("Type name");
                        String name = scanner.next();
                        System.out.println("Type number");
                        String number = scanner.next();
                        addContact(name, number);
                        System.out.println("contact added");
                        break;
                    case "2":
                        System.out.println("Type neme for delete");
                        deleteContact(scanner.next());
                        break;
                    case "3":
                        System.out.println("Type name for search");
                        searchContact(scanner.next());
                        break;
                    default:
                        isAlive = false; //to stop the scanner
                        System.out.println("goodby");
                        break;
                }
        // 3.	Student Grades
        //	•	Map: HashMap<String, Integer> where key is student name and value is grade.
        //	•	Print names of all students who scored above 80.
        HashMap<String, Integer> studentGradeMap = new HashMap<>();
        studentGradeMap.put("Armine", 80);
        studentGradeMap.put("Aram",90);
        studentGradeMap.put("Vahe",60);
        studentGradeMap.put("Anna",82);
        Set<Map.Entry<String, Integer>> setStudents = studentGradeMap.entrySet();
        //TODO dont understand this part ????
        //TODO also dont understand Interator for looping
        for (Map.Entry<String, Integer> student: setStudents){
            if (student.getValue()>80)
                System.out.println(student.getKey());
        }


    } }





    // methods outside main
    public static void addContact(String name, String phoneNumber) {
        contactMap.put(name, phoneNumber);
        System.out.println("added number of" + name);
    }

    public static void deleteContact(String name) {
        contactMap.remove(name);
        System.out.println("removde number of" + name);
    }

    public static void searchContact(String name) {
        System.out.println("Number if aaa is : " + contactMap.get(name));
    }

}
