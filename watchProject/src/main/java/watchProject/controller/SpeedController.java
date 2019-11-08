package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.SpeedsDAO;
import watchProject.objects.Run;
import watchProject.objects.Speed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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

    @GetMapping(value="/speeds/runs/{run_id}")
    public Iterable<Speed> getUserSpeeds(@PathVariable long run_id){
        List<Speed> speedList = new ArrayList<>();
        Iterator<Speed> allSpeeds = speedsDAO.findAll().iterator();
        Speed speedTampon;
        while(allSpeeds.hasNext()){
            speedTampon = allSpeeds.next();
            if(speedTampon.getRun_id() == run_id){
                speedList.add(speedTampon);
            }
        }
        return speedList;
    }
}
