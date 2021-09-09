package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    //Handles request of form /hello?name=java
    @GetMapping("hello")
    public String helloQuery(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String skillForm() {

        return      "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker" + "</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!" + "</h2>" +
                        "<ol>"+"<li> Java </li>"+
                        "<li> JavaScript </li>"+
                        "<li> python </li>"+"</ol>"+
                        "</body>" +
                        "</html>";

    }
    @GetMapping("form1")
    public String fillingForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='formSubmission'><br>" +
                "<label for='name'><b> Name: </b></label><br>" +
                "<input type ='text' name='name'/><br><br>" +
                "<label for='firstLanguage'><b> My favorite Language: </b></label><br>" +
                "<select name='favLanguage'>" +
                "<option value='select'>select</option>" +
                "<option value='Java'>Java</option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br><br>" +
                "<label for='secondLanguage'><b> My Second favorite Language: </b></label><br>" +
                "<select name='secondLanguage'>" +
                "<option value='select'>select</option>" +
                "<option value='Java'>Java</option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br><br>" +
                "<label for='thirdLanguage'><b> My third favorite Language: </b></label><br>" +
                "<select name='thirdLanguage'>" +
                "<option value='select'>select</option>" +
                "<option value='Java'>Java</option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
         }
    @RequestMapping(method= {RequestMethod.GET,RequestMethod.POST}, value="formSubmission")
    @ResponseBody
    public String formSubmission(@RequestParam String name,String favLanguage, String secondLanguage,String thirdLanguage ){
        return "<html>" +
                "<body>" +
                "<table style='width:50%' border='1'>" +
                "<th> Name </th>" +
                "<th> " + name +"</th>"+
                "<tr>" +
                "<th> Favorite Language </th>" +
                "<th>"+ favLanguage +"</th>" +
                "</tr>" +
                "<tr>" +
                "<th> Second Language </th>" +
                "<th>"+ secondLanguage +"</th>" +
                "</tr>" +
                "<tr>" +
                "<th> Third Language </th>" +
                "<th>"+ thirdLanguage +"</th>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
           }
    }

