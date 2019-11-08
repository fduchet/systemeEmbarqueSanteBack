package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.TemperaturesDAO;
import watchProject.objects.Calorie;
import watchProject.objects.OxygenLevel;
import watchProject.objects.Temperature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@Controller
@RequestMapping("/temperatures")
public class TemperatureController {

    private TemperaturesDAO temperaturesDAO;

    public TemperatureController(TemperaturesDAO temperaturesDAO) {
        this.temperaturesDAO = temperaturesDAO;
    }

    @GetMapping(value="/")
    public Iterable<Temperature> getAllTemperatures(){ return temperaturesDAO.findAll();}

    @GetMapping(value="/ {id}")
    public Temperature getTemperatures(@PathVariable long id){ return temperaturesDAO.findById(id).get();}

    @GetMapping(value="/calories/runs/{run_id}")
    public Iterable<Temperature> getUserRuns(@PathVariable long run_id){
        List<Temperature> temperatureList = new ArrayList<>();
        Iterator<Temperature> allTemperature = temperaturesDAO.findAll().iterator();
        Temperature temperatureTampon;
        while(allTemperature.hasNext()){
            temperatureTampon = allTemperature.next();
            if(temperatureTampon.getRun_id() == run_id){
                temperatureList.add(temperatureTampon);
            }
        }
        return temperatureList;
    }
}
