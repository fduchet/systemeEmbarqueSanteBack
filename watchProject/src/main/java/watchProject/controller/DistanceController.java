package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.DistancesDAO;
import watchProject.objects.Distance;

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

}
