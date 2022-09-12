package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sayonara");
        model.addAttribute("username","Phubordee Romin");
        return "home"; //html templates ซึ่งเป็นหน้า home.html
    }

}
