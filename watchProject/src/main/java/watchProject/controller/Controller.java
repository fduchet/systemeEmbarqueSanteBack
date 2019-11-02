package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.UsersDAO;

@RestController
public class Controller {

    //déclaration des DAO (accès aux Tables de la BDD)
    private final UsersDAO usersDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @RequestMapping("/")
    public String index(){
        return "Coucou la fafa";
    }

    @GetMapping(value="/users/{id}")
    public String getUsers(@PathVariable long id){
        return usersDAO.findById(id).toString();
    }
}
