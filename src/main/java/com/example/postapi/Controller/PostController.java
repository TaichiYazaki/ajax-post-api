package com.example.postapi.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.postapi.PostSerivce;
import com.example.postapi.DTO.Results;

@Controller
public class PostController {

    @Autowired
    public PostSerivce serivce;

    @RequestMapping("")
    public String index() {
        return "post";
    }

    @RequestMapping("/submit")
    public String submit(String zipCode, Model model) throws IOException {
        if (zipCode.isBlank()) {
            return "redirect:/";
        } else {
            List<Results> results = serivce.service(zipCode);
            model.addAttribute("address1", results.get(0).getAddress1());
            model.addAttribute("address2", results.get(0).getAddress2());
            model.addAttribute("address3", results.get(0).getAddress3());
            model.addAttribute("kana1", results.get(0).getKana1());
            model.addAttribute("kana2", results.get(0).getKana2());
            model.addAttribute("kana3", results.get(0).getKana3());
            model.addAttribute("zipcode", "〒" + results.get(0).getZipcode());
            return "forward:/";
        }
    }

}
