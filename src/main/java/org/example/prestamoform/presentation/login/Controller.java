package org.example.prestamoform.presentation.login;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/login")
    public String login() {
        return "presentation/login/View";
    }

    @GetMapping("/notAuthorized")
    public String notAuthorized() {
        return "presentation/login/ViewNotAuthorized";
    }
}
