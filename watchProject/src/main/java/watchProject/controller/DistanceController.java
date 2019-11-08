package watchProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.DistancesDAO;
import watchProject.objects.Distance;

@RestController
public class DistanceController {

    private DistancesDAO distancesDAO;

    public DistanceController(DistancesDAO distancesDAO) {
        this.distancesDAO = distancesDAO;
    }

    @GetMapping(value="/distances")
    public Iterable<Distance> getAllDistances(){ return distancesDAO.findAll();}

    @GetMapping(value="/distances/ {id}")
    public Distance getDistances(@PathVariable long id){ return distancesDAO.findById(id).get();}

}
