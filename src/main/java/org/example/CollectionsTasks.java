package org.example;

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




    }
}
