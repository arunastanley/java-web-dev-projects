package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker(){
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Dot Net</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String formDetails(){
        return "<html>" +
                "<body>" +
                "<form method = \"post\" action = 'processForm'>" +
                "<input type = 'text' name = 'name' />" +
                "<select name = 'favLanguage'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'DotNet'> DotNet </option>" +

                "<input type = 'submit' value = 'Submit'>"  +
                "</form>"+
                "</body>" +
                "</html>";
    }

    @PostMapping("processForm")
    @ResponseBody
    public String displayDetails(@RequestParam String name,String favLanguage){
        return name ;
    }



}
