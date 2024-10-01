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
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String formDetails(){
        return "<html>" +
                "<body style=\"font-size:2vw\">" +
                "<form method = \"post\" action = 'processForm'>" +
                "<label>Name:</label>"+"<br>"+
                "<input type = 'text' name = 'name' /><br>"+


                "<label>My favourite language:</label>"+"<br>"+
                "<select name = 'favLanguage'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> DotNet </option>" +
                "</select><br>" +

                "<label>My second favourite language:</label>"+"<br>"+
                "<select name = 'secFav'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> DotNet </option>" +
                "</select><br>" +

                "<label>My third favourite language:</label>"+"<br>"+
                "<select name = 'thirdFav'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> DotNet </option>" +
                "</select><br>" +

                "<input type = 'submit' value = 'Submit'>"  +
                "</form>"+
                "</body>" +
                "</html>";
    }

    @PostMapping("processForm")
    @ResponseBody
    public String displayDetails(@RequestParam String name,String favLanguage, String secFav, String thirdFav){
        return "<html>" +
                "<body style=\"font-size:2vw\">"+
                "<h1>"+name+"</h1>" +

                "<ol>" +
                "<li>"+favLanguage+"</li>" +
                "<li>"+secFav+"</li>" +
                "<li>"+thirdFav+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }



}
