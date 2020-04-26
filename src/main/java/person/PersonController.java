package person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    public String helloPerson() {
        return "Hello Person!";
    }

    @GetMapping("/list")
    public Collection<Person> getPersonList() {
        return PersonStorage.getInstance().getPersons();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable final int id) {
        Person foundPerson = PersonStorage.getInstance().getPerson(id);
        if (foundPerson == null) {
            throw new PersonNotFoundException();
        }
        return foundPerson;
    }
}
