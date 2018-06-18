import java.util.List;
import java.util.ArrayList;

public class Listing {

    public static void main(String[] args) {
        
        List<Person> ListOfPeople = new ArrayList<Person>();

        Person person1 = new Person("First", "LastName", true);

        ListOfPeople.add(person1);

        System.out.println();
        System.out.println(" NAME\t\t\t\tLOCATION\t\tHAPPY?");
        System.out.println("================================================================");

        for (Person person : ListOfPeople) {
            if (person.isHappy()) {
                System.out.println(person.getLastName() + ", \t" + person.getFirstName() + "\t\t" + person.getLocation() + "\t\t\t" + "YES");
            }
            else {
                System.out.println(person.getLastName() + ", \t" + person.getFirstName() + "\t\t" + person.getLocation() + "\t\t\t" + "NO");
            }
        }

        System.out.println();
    }
}