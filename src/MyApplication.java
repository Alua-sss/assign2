import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Employee("Lyazzat", "Zhandarbekova", "Teacher", 450000));
        people.add(new Employee("Aidana", "Abusadykova", "Diplomat", 300000));
        people.add(new Student("Alua", "Sagyndyk", 2.5));
        people.add(new Student("Kundyzai", "Tazabek", 3.5));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> personsList) {
        for (Person person : personsList) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                System.out.printf("%s earns %.2f tenge%n", employee.toString(), employee.getPaymentAmount());
            } else if (person instanceof Student) {
                Student student = (Student) person;
                System.out.printf("%s earns %.2f tenge%n", student.toString(), student.getPaymentAmount());
            }
        }
    }


}