package guru.springframework.jokesapp.sfgjokesapp.controllers;

import guru.springframework.jokesapp.sfgjokesapp.services.JokeService;
import guru.springframework.jokesapp.sfgjokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    JokeService service;

    public JokesController(JokeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("random_joke", service.getJoke());

        return "jokes";
    }
}
