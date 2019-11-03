package watchProject.controller;

import org.springframework.web.bind.annotation.*;
import watchProject.DAO.*;

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
    private final TemperaturesDAO temperaturesDAO;

    //initialisation des DAO
    public Controller(UsersDAO usersDAO, RunsDAO runsDAO, OxygenLevelsDAO oxygenLevelsDAO, SpeedsDAO speedsDAO, CaloriesDAO caloriesDAO, DistancesDAO distancesDAO, HeartRatesDAO heartRatesDAO, TemperaturesDAO temperaturesDAO) {
        this.usersDAO = usersDAO;
        this.runsDAO = runsDAO;
        this.oxygenLevelsDAO = oxygenLevelsDAO;
        this.speedsDAO = speedsDAO;
        this.caloriesDAO = caloriesDAO;
        this.distancesDAO = distancesDAO;
        this.heartRatesDAO = heartRatesDAO;
        this.temperaturesDAO = temperaturesDAO;
    }

    @RequestMapping("/")
    public String index(){
        return "Coucou la fafa";
    }

    @GetMapping(value="/users")
    public String getAllUsers(){ return usersDAO.findAll().toString();}

    @GetMapping(value="/users/{id}")
    public String getUsers(@PathVariable long id){
        return usersDAO.findById(id).toString();
    }

    @GetMapping(value="/runs")
    public String getAllRuns(){ return runsDAO.findAll().toString();}

    @GetMapping(value="/runs/{id}")
    public String getRuns(@PathVariable long id){ return runsDAO.findById(id).toString(); }

    @GetMapping(value="/oxygenLevels")
    public String getAllOxygenLevels(){ return oxygenLevelsDAO.findAll().toString();}

    @GetMapping(value="/oxygenLevels/ {id}")
    public String getOxygenLevels(@PathVariable long id){ return oxygenLevelsDAO.findById(id).toString();}

    @GetMapping(value="/speeds")
    public String getAllSpeeds(){ return speedsDAO.findAll().toString();}

    @GetMapping(value="/speeds/ {id}")
    public String getSpeeds(@PathVariable long id){ return speedsDAO.findById(id).toString();}

    @GetMapping(value="/calories")
    public String getAllCalories(){ return caloriesDAO.findAll().toString();}

    @GetMapping(value="/calories/ {id}")
    public String getCalories(@PathVariable long id){ return caloriesDAO.findById(id).toString();}

    @GetMapping(value="/distances")
    public String getAllDistances(){ return distancesDAO.findAll().toString();}

    @GetMapping(value="/distances/ {id}")
    public String getDistances(@PathVariable long id){ return distancesDAO.findById(id).toString();}

    @GetMapping(value="/heartRates")
    public String getAllHeartRates(){ return heartRatesDAO.findAll().toString();}

    @GetMapping(value="/heartRates/ {id}")
    public String getHeartRates(@PathVariable long id){ return heartRatesDAO.findById(id).toString();}

    @GetMapping(value="/temperatures")
    public String getAllTemperatures(){ return temperaturesDAO.findAll().toString();}

    @GetMapping(value="/temperatures/ {id}")
    public String getTemperatures(@PathVariable long id){ return temperaturesDAO.findById(id).toString();}
}
