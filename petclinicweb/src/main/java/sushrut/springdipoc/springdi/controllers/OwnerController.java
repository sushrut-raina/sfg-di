package sushrut.springdipoc.springdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sushrut.springdipoc.springdi.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;


    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/" , "index", "/index.html"})
    public String owners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }


}
