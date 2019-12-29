package clidrobalo.bookingdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello()  {
        return "Hello gays, this is my first application spring-boot.";
    }
}
