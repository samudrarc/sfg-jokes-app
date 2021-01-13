package guru.springframework.jokesapp.sfgjokesapp.controllers;

import guru.springframework.jokesapp.sfgjokesapp.services.JokesGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    JokesGeneratorService service;

    public JokesController(JokesGeneratorService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("random_joke", service.getJoke());

        return "jokes";
    }
}
