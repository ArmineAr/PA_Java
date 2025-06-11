package org.example;

import org.example.models.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SetMapTasks {
    public static void main(String[] args) {
        //HOMEWORK ________________________________________________________
        //1 Word Counter
        //	•	Read a sentence from the console.
        //	•	Count the frequency of each word using a HashMap<String, Integer>.
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a word");
        String word = scanner.next();
        //TODO ???? dont understand how it stores the frequencies and why not use ArrayList
        scanner.close();

        // 2.	Phone Book
        //	•	Create a HashMap<String, String> to store names and phone numbers.
        //	•	Implement functions to: •	Add a contact, Delete a contact, Search by name
        HashMap<String, String> phoneBook =  new HashMap<>();
        phoneBook.put("Armine","123"); //add
        phoneBook.put("Aram","124");
        phoneBook.put("Vahe","125");
        phoneBook.put("Anna","126");
        System.out.println(phoneBook);
        phoneBook.remove("Vahe");//remove
        System.out.println(phoneBook);
        System.out.println(phoneBook.get("Armine")); //??it returns only the number is that ok ?

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


    }
}
