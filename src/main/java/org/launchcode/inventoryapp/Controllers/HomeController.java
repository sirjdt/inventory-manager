package org.launchcode.inventoryapp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashMap;

@Controller
@RequestMapping("inventory")
public class HomeController {
    @RequestMapping(value = "")
    public String index(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("inventory", "Inventory");
        actionChoices.put("schedule", "Schedule");
        actionChoices.put("reports", "Reports");

        model.addAttribute("actions", actionChoices);

        return "index";
    }

    @RequestMapping(value = "inventory")
    public String inventory(Model model) {
        return "inventory";
    }

}

