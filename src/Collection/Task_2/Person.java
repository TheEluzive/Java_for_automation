package Collection.Task_2;

import java.util.ArrayList;


public class Person implements Comparable <Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "";
        age = 0;
    }


    public static int compareName(Person o1, Person o2) {
        if (o1.name.compareTo(o2.name) != 0) return o1.name.compareTo(o2.name);
        else return o1.compareTo(o2);
    }

    public static ArrayList<Person> withoutEqualPerson(ArrayList<Person> arrayList) {
        ArrayList<Person> arrayListReturned = new ArrayList<Person>();


        for (int i = 0; i < arrayList.size(); i++) {
            int equals = 0;
            for (int j = i+1; j < arrayList.size(); j++) {
                //System.out.println(arrayList.get(i).toString()+" " + arrayList.get(j)+ arrayList.get(i).compare(arrayList.get(i), arrayList.get(j)));
                if (arrayList.get(i).compareName(arrayList.get(i), arrayList.get(j)) == 0)  equals++;

            }
            if (equals == 0) {arrayListReturned.add(arrayList.get(i));}
        }


        return arrayListReturned;

    }

    public static boolean CompareTwoListPerson(ArrayList<Person> person, ArrayList<Person> person2){
        if (person.size() == person2.size()){
            for(int i = 0; i<person.size(); i++){
               // System.out.println(person.get(i).compareName(person.get(i),person2.get(i))+person.get(i).toString() + " " +  person2.get(i).toString() );
                if (person.get(i).compareName(person.get(i),person2.get(i))!=0)
                    return false;
            }
            return true;

        }

        else return false;
    }


}
