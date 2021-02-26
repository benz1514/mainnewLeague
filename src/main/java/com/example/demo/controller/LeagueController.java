package com.example.demo.controller;

import com.example.demo.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/lol")
public class LeagueController {   


    @Autowired
    LeagueRepository lol;



    @GetMapping("/index")
    public String index(Model model) {
    model.addAttribute("league",lol.findAll());
        return "index";
    }


    @GetMapping("/create")
    public String create(Model model) {
        return "createpage";
    }


    @PostMapping("/save")
    public String createdb(Model model, String itemname,String damageitem, String categoryitem, String ablityitem , String price  ){
        if (itemname == null) {
            model.addAttribute("league","กรุณากรอกค่า");
        }else{
            LeagueEntity legends = new LeagueEntity();
            legends.setItemname(itemname);
            legends.setDamageitem(damageitem);
            legends.setCategoryitem(categoryitem);
            legends.setAblityitem(ablityitem);
            legends.setPrice(price);
            lol.save(legends);
            
        }
        return "redirect:/lol/index";
    }

    @GetMapping("/edit")
    public String edit(Model model, Integer id) {
        model.addAttribute("league",lol.findById(id));
        return "edit";
    }

    @PostMapping("/editsave")
    public String editdb(Model model, Integer id, String itemname,String damageitem, String categoryitem, String ablityitem , String price  ){
        if (itemname == null) {
            model.addAttribute("league","กรุณากรอกค่า");
        }else{
            LeagueEntity legends = new LeagueEntity();
            legends.setItemname(itemname);
            legends.setDamageitem(damageitem);
            legends.setCategoryitem(categoryitem);
            legends.setAblityitem(ablityitem);
            legends.setPrice(price);
            legends.setId(id);
            lol.save(legends);
            
        }
        return "redirect:/lol/index";
    }

    @GetMapping("/delete")
    public String delete(Model model, Integer id) {
        
        lol.delete(lol.findById(id).get());
        
        return "redirect:/lol/index";
    }
        
}