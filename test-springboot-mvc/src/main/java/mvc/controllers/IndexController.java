package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //looks for paths / request mappings put inside
public class IndexController {

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
