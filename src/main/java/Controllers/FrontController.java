package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class FrontController {


    @GetMapping("/index")
    public String index()
    {
    return "index";
    }
    @GetMapping("/bin2decCalc")
    public String bin2decCalc()
    {
    return "bin2decCalc";
    }
    @PostMapping("/calculate")
    public String calculation(Model model)
    {
    model.getAttribute("binary-input");
    return "redirect:/bin2decCalc";
    }
    }


