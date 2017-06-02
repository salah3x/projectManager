package com.salah.projectmanager.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by bnadem on 5/21/17.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Project Manager");
        return "index";
    }

    @RequestMapping(value = "search")
    public String search(@RequestParam String p, Model model){
        model.addAttribute("title", "Search");
        model.addAttribute("keyword", "You searched for: "+p);
        return "search";
    }

    @RequestMapping(value = "wiki")
    public String wiki(Model model) {
        model.addAttribute("title", "Wiki");
        return "wiki";
    }

    @RequestMapping(value = "message", method =RequestMethod.POST)
    public String message() {

        return "redirect:/";
    }

}