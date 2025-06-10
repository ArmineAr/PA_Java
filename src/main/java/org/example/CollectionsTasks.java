package org.example;

import org.example.models.Student;

import java.util.*;

public class CollectionsTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(4,-3,7,-1,8,5));
        numbers.removeIf(n->n<0);

        ArrayList<Integer> numbers2= new ArrayList<>(Arrays.asList(4,-3,7,-1,8,5));
        System.out.println(numbers2);
        TreeSet<Integer> sorted = new TreeSet<>(numbers2);
        System.out.println(sorted);
        System.out.println("min is:" + sorted.first());
        System.out.println("max is:" + sorted.last());


        //or best is
        List<Integer> numbers4= new ArrayList<>(Arrays.asList(4,-3,7,-1,8,5));
        System.out.println(Collections.min(numbers4));
        System.out.println(Collections.max(numbers4));

        // OR we will have to do

//        ArrayList<Integer> negatives= new ArrayList<>();
//        for(Integer i:numbers){
//            if(i<0){
//                numbers.add(i);
//            }
//        }
//        for (Integer neg: negatives){  //int wont work so we put Integer
//            numbers.remove(neg);
//        }


        //list to uppercase
        ArrayList<String> names = new ArrayList<>();
        names.add("anna");
        names.add("ani");
        names.add("anahit");
        names.add("anushavan");
        for(String name:names){
            names.set(names.indexOf(name),name.toUpperCase()) ;
        }
        System.out.println(names);
        //sort by names
        Collections.sort(names);
        System.out.println(names);
        //reverse the sort
        Collections.reverse(names);
        System.out.println(names);

        //longest string
        String max="";
        System.out.println(max.length());
        for(String name:names){
            if(name.length()>max.length()){
                // ete uzenam naxaverjin erkar@ >= ara
                max=name;
            }
        }
        System.out.println(max);
        // ete uzenam bolor yerkarner@ .. kvercnem amenaerkaroi length@ kpahem u kasem
        //noric for ara u asa ov uni es length@

        ///HOMEWORK.--------------------------------------------------------------
        //1 new list from the quare of all even number
        ArrayList<Integer> numbers3=new ArrayList<>(Arrays.asList(-2,0,1,4,5,8,9,10,13,14));
        ArrayList<Integer> numbersEven=new ArrayList<>();
        for (int number:numbers3){
            if (number%2==0 && number!=0){
                numbersEven.add(number);
            } }
        System.out.println(numbers3);
        System.out.println(numbersEven);

        //students list
        ArrayList<Student> studentsList= new ArrayList<>();
        studentsList.add(new Student("Armine", "Arakelyan", 87, 18));
        studentsList.add(new Student("Ani", "Narinyan", 50, 19));
        studentsList.add(new Student("Aram", "Stepanyan", 82, 22));
        studentsList.add(new Student("David", "Sargsyan", 72, 18));

        //2.sorting array of objects by property  / Comparing objects
        //TODO ??? couldnt do it on my own
        //   Collections.sort(studentsList);

        //3. find the avarage of student ages
        float sumAge=0;
        for (Student student:studentsList){
            sumAge += student.getAge();
        }
        System.out.println("average of student age is "+(sumAge/(studentsList.size())));

        //4 Find and print users that have score higher than 85
        ArrayList<Student> studentsListHighGrade= new ArrayList<>();
        for (Student student:studentsList){
            if (student.getGrade()>85){
                studentsListHighGrade.add(student);
            }
        }
        System.out.println(studentsListHighGrade.toString());

        //5 check if there is a student named David
        boolean hasDavid=false;
        for (Student student:studentsList) {
            if (student.getName().equalsIgnoreCase("david")) {
                hasDavid=true;
                System.out.println("yes there is at least one student named David");
                break;
            }   // TODO ?? do i need else here ?
        }
        if (!hasDavid) {
            System.out.println("No there is no David");
        }

        //6 remove students with grades lower tha 60
        //TODO ??? getting error java.util.ConcurrentModificationException??

//        for (Student student:studentsList){
//            if (student.getGrade()<60){
//                studentsList.remove(student);
//            }
//        }
//        System.out.println(studentsList.toString());

        // 7 return the list of student whoes name starts with A
        ArrayList<Student> studentsListStartingWithA= new ArrayList<>();
        for (Student student:studentsList){
            if (student.getName().toLowerCase().startsWith("a")){
                studentsListStartingWithA.add(student);
            }
        }
        System.out.println(studentsListStartingWithA.toString());

        ///HOMEWORK.--------------------------------------------------------------

    }
}
