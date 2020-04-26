package person;

import java.util.Collection;
import java.util.HashMap;

public class PersonStorage {
    private static PersonStorage instance = null;
    private HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();

    public static PersonStorage getInstance() {
        if (instance == null) {
            instance = new PersonStorage();
            instance.init();

        }
        return instance;
    }

    public Collection<Person> getPersons() {
        System.out.println("Calling getPersons");
        return this.personMap.values();
    }

    public Person getPerson(final int id) {
        return personMap.getOrDefault(id, null);
    }

    private void init() {
        this.personMap.put(1, new Person(1, "Meier", "Hans", 40));
        this.personMap.put(2, new Person(2, "Mahler", "Sandra", 32));
        this.personMap.put(3, new Person(3, "Huber", "Franz", 56));
    }
}
