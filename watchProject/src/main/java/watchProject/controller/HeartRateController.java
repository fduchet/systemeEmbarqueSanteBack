package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.HeartRatesDAO;
import watchProject.objects.HeartRate;

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

}
