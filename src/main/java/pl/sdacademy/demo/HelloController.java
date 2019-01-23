package pl.sdacademy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private MyFileWriter myFileWriter;

    @RequestMapping("/postalCodes")
    public List<PostalCode> index(@RequestParam("postalCode") String code) {
        System.out.println("Code=" + code);
        //TODO find postal code from db and return matching codes
        List<PostalCode> list = new ArrayList<>();
        list.add(new PostalCode("00-200", "Warszawa"));
        list.add(new PostalCode("94-201", "Lodz"));
        list.add(new PostalCode("96-201", "Rawa Mazowiecka"));
        return list;
    }

}
