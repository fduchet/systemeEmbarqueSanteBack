package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.*;
import watchProject.objects.Distance;

import java.net.ConnectException;

@RestController
public class Controller {

    //déclaration des DAO (accès aux Tables de la BDD)
    private final UsersDAO usersDAO;
    private final RunsDAO runsDAO;
    private final OxygenLevelsDAO oxygenLevelsDAO;
    private final SpeedsDAO speedsDAO;
    private final CaloriesDAO caloriesDAO;
    private final DistancesDAO distancesDAO;
    private final HeartRatesDAO heartRatesDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO, RunsDAO runsDAO, OxygenLevelsDAO oxygenLevelsDAO, SpeedsDAO speedsDAO, CaloriesDAO caloriesDAO, DistancesDAO distancesDAO, HeartRatesDAO heartRatesDAO) {
        this.usersDAO = usersDAO;
        this.runsDAO=runsDAO;
        this.oxygenLevelsDAO=oxygenLevelsDAO;
        this.speedsDAO=speedsDAO;
        this.caloriesDAO=caloriesDAO;
        this.distancesDAO=distancesDAO;
        this.heartRatesDAO=heartRatesDAO;
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

    @GetMapping(value="/speeds/ {id}")
    public String getSpeeds(@PathVariable long id){ return speedsDAO.findById(id).toString();}

    @GetMapping(value="/calories/ {id}")
    public String getCalories(@PathVariable long id){ return caloriesDAO.findById(id).toString();}

    @GetMapping(value="/distances/ {id}")
    public String getDistances(@PathVariable long id){ return distancesDAO.findById(id).toString();}

    @GetMapping(value="/heartRates/ {id}")
    public String getHeartRates(@PathVariable long id){ return heartRatesDAO.findById(id).toString();}


}
