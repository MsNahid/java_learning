package com.ant.lambda;

public class DriverClass {
    public static void main(String[] args) {

        for(int i = 1; i < 81; i = i * 3){
            System.out.println(i);
        }


    }

//    public List<Person> filter(List<Person> personList, Filterable filterable){
//        List<Person> filteredPersonList = new ArrayList<>();
//
//        for(Person person : personList){
//            if(filterable.apply(person)) {
//                filteredPersonList.add(person);
//            }
//        }
//    }
}
