package Collection.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class DemoPerson {private static int n;

    private static ArrayList<Person> returnedList;
    private static ArrayList <Person> persons;

    public static void main(String[] args) {

        n=7;
        persons = new ArrayList<>();
        returnedList = new ArrayList<>();


        String[] names = {"First", "Second", "Third", "Fourth", "Fifth", "First", "Last"};
        for (int i = n, j = 0; i > 0; i--, j++){
            persons.add(new Person(names[j], i));
        }


        menu();
    }



    private static void outPersonsList(){for (Person value : persons) System.out.println(value.toString());}

    private static void menu(){
        System.out.println("1. Sort by age \n2. Sort by name(and age)\n" +
                "3. Deleting repeats\n4. Compare two <Person> lists\n " +
                "Input: ");
        Scanner in = new Scanner(System.in);
        int choose;
        choose = in.nextInt();

        switch (choose){
            case 1:
                System.out.println("Array list");
                outPersonsList();
                Collections.sort(persons);
                System.out.println("\nAfter sort by age: ");
                outPersonsList();
                break;
            case 2:
                System.out.println("Array list");
                outPersonsList();
                persons.sort(Person::compareName);
                System.out.println("\nArray list after sort by Name(and age): ");
                outPersonsList();
                break;
            case 3:
                persons.get(5).setAge(persons.get(0).getAge());
                System.out.println("New array list:");
                outPersonsList();
                returnedList = new ArrayList<>();
                returnedList.addAll(Person.withoutEqualPerson(persons));

                System.out.println("\nWithout repeat: ");
                for (Person person : returnedList) System.out.println(person.toString());
                break;
            case 4:
                returnedList = new ArrayList<>();
                for (Person person : persons) {
                    returnedList.add(new Person("" + person.getName(), person.getAge() + 1 - 1));

                }
                outCompareToPersons();

                returnedList.get(5).setAge(22);
                outCompareToPersons();
                break;
                default:
                    break;

        }



    }

    public static void outCompareToPersons(){
        System.out.println("\nFirst list:");
        outPersonsList();
        System.out.println("\nSecond list");
        for( Person value : returnedList) System.out.println(value.toString()); //
        System.out.println("\n" +
                "They equals: " + Person.CompareTwoListPerson(persons, returnedList));
    }




}
