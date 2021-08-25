package core.generics;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

  public static void main(String[] args) {
    //Stream<Person>.of (new Person(23, "Ramesh", new BigDecimal(23000)));
    List<Person> persons = Stream.of(new Person(23, "Ramesh", new BigDecimal(23000)),
        new Person(25, "ajitersh", new BigDecimal(23000)),
        new Person(23, "Suresh", new BigDecimal(23000)))
        .sorted(new PersonNameComparator())
        .collect(Collectors.toList());

    for (Person person : persons) {
      System.out.print(person);
    }
  }

}
