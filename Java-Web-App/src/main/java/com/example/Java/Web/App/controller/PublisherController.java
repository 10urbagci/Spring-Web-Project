package com.example.Java.Web.App.controller;

import com.example.Java.Web.App.repositories.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publisher")
    public String getPublisher(Model model){

        model.addAttribute("publisher",publisherRepository.findAll());

        return "publisher/list";
    }



}
