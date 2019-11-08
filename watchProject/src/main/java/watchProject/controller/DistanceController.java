package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.DistancesDAO;
import watchProject.objects.Calorie;
import watchProject.objects.Distance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@Controller
@RequestMapping("/distances")
public class DistanceController {

    private DistancesDAO distancesDAO;

    public DistanceController(DistancesDAO distancesDAO) {
        this.distancesDAO = distancesDAO;
    }

    @GetMapping(value="/")
    public Iterable<Distance> getAllDistances(){ return distancesDAO.findAll();}

    @GetMapping(value="/ {id}")
    public Distance getDistances(@PathVariable long id){ return distancesDAO.findById(id).get();}

    @GetMapping(value="/distances/runs/{run_id}")
    public Iterable<Distance> getUserRuns(@PathVariable long run_id){
        List<Distance> distancesList = new ArrayList<>();
        Iterator<Distance> allDistances = distancesDAO.findAll().iterator();
        Distance distanceTampon;
        while(allDistances.hasNext()){
            distanceTampon = allDistances.next();
            if(distanceTampon.getRun_id() == run_id){
                distancesList.add(distanceTampon);
            }
        }
        return distancesList;
    }
}
