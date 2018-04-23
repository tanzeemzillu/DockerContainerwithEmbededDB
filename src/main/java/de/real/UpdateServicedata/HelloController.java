package de.real.UpdateServicedata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "Hello Roberto";
    }
}
