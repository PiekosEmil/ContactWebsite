package com.emilpiekos.contactwebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private MailService mailService;

    public MainController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String idxex() {
        return "index";
    }

    @GetMapping("/kontakt")
    public String kontakt(Model model, EmailMessage message) {
        model.addAttribute("message", message);
        return "ContactForm";
    }

    @PostMapping("/send")
    public String sending(EmailMessage message) {
        mailService.sendMail(message.getSubject(), message.getSender(), message.getText());
//        mailService.sendMail("nigowoy464@givehit.com", "treść wiadomości z postmappingu");
        return "redirect:/";
    }
}
