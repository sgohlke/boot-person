package person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PersonController {

    @GetMapping
    public String helloPerson() {
        return "Hello Person!";
    }

}