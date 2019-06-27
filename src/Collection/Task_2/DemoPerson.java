package Collection.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class DemoPerson {
    private static Person person;
    private static Person person2;
    private static int n;
    private static ArrayList<Person> list = new ArrayList<>();


    private static ArrayList <Person> persons;

    public static void main(String[] args) {
        /*person = new Person("Test", 1);
        person2 = new Person("Test2", 1);

        out();

        person.setAge(2);
        out();

        person2.setAge(2);
        person2.setName("Test");
        out();

        n = 7;

        ArrayList <Person> persons = new ArrayList<Person>();
        String[] names = {"First", "Second", "Third", "Fourth", "Fifth", "First", "Last"};
        for (int i = 0; i < n; i++){
            persons.add(new Person(names[i], i));
        }




        persons.get(5).setAge(persons.get(0).getAge());

        System.out.println("All: ");
        for(int i = 0; i < persons.size(); i++)
            System.out.println(persons.get(i).toString());

        ArrayList<Person> returnedList = new ArrayList<Person>();

        returnedList.addAll(Person.withoutEqualPerson(persons));

        System.out.println("\nWithout repeat: ");
        for(int i = 0; i < returnedList.size(); i++)
            System.out.println(returnedList.get(i).toString());
*/

        n=7;
        persons = new ArrayList<Person>();
        String[] names = {"First", "Second", "Third", "Fourth", "Fifth", "First", "Last"};
        for (int i = n, j = 0; i > 0; i--, j++){
            persons.add(new Person(names[j], i));
        }
        System.out.println("ArrayList: ");
        for (Person value : persons) System.out.println(value.toString());

        menu();
    }

    public void out(){
        System.out.println(person.toString() + " and " + person2.toString() +
                ((person.compareTo(person2)==0)?"\nequal by age":"\nnot equal by age"));
        System.out.println();
        System.out.println(person.toString() + " and " + person2.toString() +
                ((person.compareName(person, person2)==0)?"\nfull equal ":"\nnot equal "));
        System.out.println();
    }

    private static void outAfterSort(){for (Person value : persons) System.out.println(value.toString());}

    private static void menu(){
        Scanner in = new Scanner(System.in);
        int choose;
        choose = in.nextInt();

        switch (choose){
            case 1:
                Collections.sort(persons);
                System.out.println("\nAfter sort by age: ");
                outAfterSort();
                break;
            case 2:
                System.out.println(choose);
                persons.sort(Person::compareName);
                System.out.println("\nAfter sort by Name(and age): ");
                outAfterSort();
                break;
            default:
                    break;

        }


    }





}
