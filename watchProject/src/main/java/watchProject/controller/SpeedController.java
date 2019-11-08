package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.SpeedsDAO;
import watchProject.objects.Speed;


@RestController
@Controller
@RequestMapping("/speeds")
public class SpeedController {

    private final SpeedsDAO speedsDAO;

    public SpeedController(SpeedsDAO speedsDAO) {
        this.speedsDAO = speedsDAO;
    }

    @GetMapping(value="/")
    public Iterable<Speed> getAllSpeeds(){ return speedsDAO.findAll();}

    @GetMapping(value="/ {id}")
    public Speed getSpeeds(@PathVariable long id){ return speedsDAO.findById(id).get();}

}
