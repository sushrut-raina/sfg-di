package sushrut.springdipoc.springdi.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets" , "/vets/index", "/vets/index.html", "/vets/" , "/vets/index/", "/vets/index.html/"})
    public String list(){
        return "vets/index";
    }
}
