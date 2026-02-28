package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/leaderboard")
    public String leaderboard(Model model){
        return "leaderboard";
    }

    @GetMapping("/newGame")
    public String newGame(Model model){
        return "newGame";
    }

    @GetMapping("/settings")
    public String settings(Model model){
        return "settings";
    }

    @GetMapping("/profile")
    public String profile(Model model){

        return "profile";
    }
}
