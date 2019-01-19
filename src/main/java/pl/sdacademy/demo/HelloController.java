package pl.sdacademy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    MyFileWriter myFileWriter;

    @RequestMapping("/")
    public String index() {
        myFileWriter.doSomething();
        return "Greetings from Spring Boot!";
    }

}
