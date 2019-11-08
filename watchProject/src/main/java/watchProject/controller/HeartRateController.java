package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.HeartRatesDAO;
import watchProject.objects.Calorie;
import watchProject.objects.HeartRate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@Controller
@RequestMapping("/heartRates")
public class HeartRateController {

    private HeartRatesDAO heartRatesDAO;

    public HeartRateController(HeartRatesDAO heartRatesDAO) {
        this.heartRatesDAO = heartRatesDAO;
    }

    @GetMapping(value="/")
    public Iterable<HeartRate> getAllHeartRates(){ return heartRatesDAO.findAll();}

    @GetMapping(value="/ {id}")
    public HeartRate getHeartRates(@PathVariable long id){ return heartRatesDAO.findById(id).get();}

    @GetMapping(value="/calories/runs/{run_id}")
    public Iterable<HeartRate> getUserRuns(@PathVariable long run_id){
        List<HeartRate> heartRateList = new ArrayList<>();
        Iterator<HeartRate> allheartRates = heartRatesDAO.findAll().iterator();
        HeartRate heartRateTampon;
        while(allheartRates.hasNext()){
            heartRateTampon = allheartRates.next();
            if(heartRateTampon.getRun_id() == run_id){
                heartRateList.add(heartRateTampon);
            }
        }
        return heartRateList;
    }
}
