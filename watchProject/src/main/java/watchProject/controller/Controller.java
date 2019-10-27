package watchProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index(){
        return "Coucou la fafa";
    }

    @GetMapping(value="/users/{id}")
    public String getUsers(@PathVariable int id){
        return "lul users";
    }
}
