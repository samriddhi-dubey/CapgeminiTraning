package taskProgram2;

public class University {
    private Person[] people = new Person[5];  // fixed size
    private int index = 0;

    public void addPerson(Person p) {
        if (index < people.length) {
            people[index++] = p;
        } else {
            System.out.println("University is full.");
        }
    }

    public void showPeople() {
        for (int i = 0; i < index; i++) {
            people[i].displayInfo();  // polymorphism
            System.out.println("-----------");
        }
    }
}

