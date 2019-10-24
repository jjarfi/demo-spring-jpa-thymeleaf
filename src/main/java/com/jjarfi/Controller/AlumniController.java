package com.jjarfi.Controller;


import com.jjarfi.DAO.AlumniDao;
import com.jjarfi.Model.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/ustj")
public class AlumniController {


    @Autowired
    private AlumniRepository alumniRepository;

    @RequestMapping("/home")
    private String home(ModelMap modelMap) {
        modelMap.addAttribute("halo");
        return "/home/index";
    }

    @RequestMapping("/news")
    private String news() {
        return "Holla News";
    }

    @RequestMapping("/gallery")
    private String gallery() {
        return "Holla Gallery";
    }

    @RequestMapping(value = "/allalumni", method = RequestMethod.GET)
    public ResponseEntity<List<AlumniDao>> showDataAlumni() {
        List<AlumniDao> list = alumniRepository.findAll();
        return new ResponseEntity<List<AlumniDao>>(list, HttpStatus.OK);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/allalumni/{npm}",
            produces = {"application/json"})
    @ResponseBody
    public String login(@PathVariable(value = "npm") String npm) {
        AlumniDao kon = alumniRepository.findByNim(npm);
        if (kon !=null){
            return "Erorr";
        }
        return "Success";
    }
}
