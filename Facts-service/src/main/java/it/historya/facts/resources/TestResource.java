package it.historya.facts.resources;

import it.historya.facts.entities.Fact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;

@RestController
public class TestResource {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/data")
    public Fact[] getData() {
        Fact[] facts = new Fact[3];
        Fact fact = new Fact("I'm a fact", 2, true, "Test1");
        Fact fact2 = new Fact("I'm a fact with a longer text to test things with dynamic cssing", 234, true, "Test2");
        Fact fact3 = new Fact("I'm a fact", 2, false, "Test1");
        return facts;
    }

    @GetMapping("/test")
    public String test() {
        return "Test work";
    }

}
