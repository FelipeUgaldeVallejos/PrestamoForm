package org.example.prestamoform.presentation;

import org.example.prestamoform.logic.Prestamo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller("RootRedirectController")
public class RootRedirectController {
    @GetMapping("/")
    public String redirect(Model model) {
        return "redirect:/presentation/prestamos/list";
    }
}
