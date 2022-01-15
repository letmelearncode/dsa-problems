package sorting;

import core.generics.Person;
import core.generics.PersonAgeComparator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


//Time Complexity of Bubble, Selection & Insertion sort = O(n^2)
//Time complexity of Merge Sort/ Heap Sort/ Quick Sort = O(n*log(n))
public class SortingClient {

  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();
    Person person1 = new Person(27, "Soham", new BigDecimal(12300));
    Person person2 = new Person(24, "Runit", new BigDecimal(15300));
    Person person3 = new Person(47, "Sonu", new BigDecimal(12500));
    Person person4 = new Person(75, "Mohan", new BigDecimal(32300));
    Person person5 = new Person(21, "Raj", new BigDecimal(12350));
    Person person6 = new Person(34, "Sunil", new BigDecimal(14300));
    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);
    personList.add(person5);
    personList.add(person6);
    for (Person person : personList) {
      System.out.print(person + ", ");
    }
    System.out.println(" ");
    BubbleSort bubbleSort = new BubbleSort();
    BubbleSort.bubbleSort(personList, new PersonAgeComparator());
    for (Person person : personList) {
      System.out.print(person + ", ");
    }

  }

}
