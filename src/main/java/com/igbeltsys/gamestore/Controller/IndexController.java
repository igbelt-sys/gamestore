package com.igbeltsys.gamestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Rotas de navegacao do site
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/game-add")
    public String getGameAdd() {
        return "/games/add";
    }
}
