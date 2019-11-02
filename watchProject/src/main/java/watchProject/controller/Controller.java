package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.OxygenLevelsDAO;
import watchProject.DAO.UsersDAO;
import watchProject.DAO.RunsDAO;

import java.net.ConnectException;

@RestController
public class Controller {

    //déclaration des DAO (accès aux Tables de la BDD)
    private final UsersDAO usersDAO;
    private final RunsDAO runsDAO;
    private final OxygenLevelsDAO oxygenLevelsDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO, RunsDAO runsDAO, OxygenLevelsDAO oxygenLevelsDAO) {
        this.usersDAO = usersDAO;
        this.runsDAO=runsDAO;
        this.oxygenLevelsDAO=oxygenLevelsDAO;

    }

    @RequestMapping("/")
    public String index(){
        return "Coucou la fafa";
    }

    @GetMapping(value="/users/{id}")
    public String getUsers(@PathVariable long id){
        return usersDAO.findById(id).toString();
    }

    @GetMapping(value="/runs/{id}")
    public String getRuns(@PathVariable long id){
        return runsDAO.findById(id).toString();
    }

    @GetMapping(value="/oxygenLevels/ {id}")
    public String getOxygenLevels(@PathVariable long id){ return oxygenLevelsDAO.findById(id).toString();}
}
