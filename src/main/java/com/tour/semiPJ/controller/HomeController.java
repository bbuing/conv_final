package com.tour.semiPJ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        HomeForm homeForm = new HomeForm();

        model.addAttribute("mainTag"      , homeForm.getMainTag());
        model.addAttribute("mainRegion"   , homeForm.getMainRegion());
        model.addAttribute("mainTheme"    , homeForm.getMainTheme());
        model.addAttribute("mainTransport", homeForm.getMainTransport());
        model.addAttribute("mainStay"     , homeForm.getMainStay());

        return "home";
    }
}
