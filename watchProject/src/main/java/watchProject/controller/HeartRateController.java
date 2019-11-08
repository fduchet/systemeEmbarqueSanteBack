package watchProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.HeartRatesDAO;
import watchProject.objects.HeartRate;

@RestController
public class HeartRateController {

    private HeartRatesDAO heartRatesDAO;

    public HeartRateController(HeartRatesDAO heartRatesDAO) {
        this.heartRatesDAO = heartRatesDAO;
    }

    @GetMapping(value="/heartRates")
    public Iterable<HeartRate> getAllHeartRates(){ return heartRatesDAO.findAll();}

    @GetMapping(value="/heartRates/ {id}")
    public HeartRate getHeartRates(@PathVariable long id){ return heartRatesDAO.findById(id).get();}

}
