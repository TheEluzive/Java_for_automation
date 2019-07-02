package Lambda_Expressions_And_Stream_API;

import Collection.Task_2.Person;
import Exceptions.Optional_Task.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Vasya", 14));
        arrayList.add(new Person("Vasya", 25));
        arrayList.add(new Person("Vasya", 27));
        arrayList.add(new Person("Afanasiy", 31));
        arrayList.add(new Person("Hristofor", 22));
        arrayList.add(new Person("Kuzmar", 27));
        arrayList.add(new Person("Efstafiy", 46));
        for (Person name : arrayList)
            System.out.println(name);




        ArrayList<Person> sorted = new ArrayList<>();
        sorted.addAll(arrayList.stream().
                filter( (p)->p.getAge()>=20&& p.getAge()<=30).
                peek(p -> p.setName(p.getName().toUpperCase()))
                .sorted(Comparator.comparingInt(p->p.getName().length()))
                .collect(Collectors.toList())
        );
        ArrayList<String> names = new ArrayList<>();
        for (Person name : sorted) {
           // System.out.println(name);
            names.add(name.getName());
        }

        ArrayList<String> sortedNames = new ArrayList<>();
        sortedNames.add(
        names.stream().distinct().
        collect(Collectors.toList()) .toString()
        );


        System.out.println("\nResult: ");
        for (String sortedName : sortedNames) {
            System.out.println(sortedName);
        }

    }
}
