package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.OutsideTemperatureDAO;
import watchProject.objects.BodyTemperature;
import watchProject.objects.OutsideTemperature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@Controller
@RequestMapping("/outsideTemperature")
public class OutsideTemperatureController {

    private OutsideTemperatureDAO outsideTemperatureDAO;

    public OutsideTemperatureController(OutsideTemperatureDAO outsideTemperatureDAO) {
        this.outsideTemperatureDAO = outsideTemperatureDAO;
    }

    @GetMapping(value = "/")
    public Iterable<OutsideTemperature> getAllOutsideTemperatures() {
        return outsideTemperatureDAO.findAll();
    }

    @GetMapping(value = "/ {id}")
    public OutsideTemperature getOutsideTemperatures(@PathVariable long id) {
        return outsideTemperatureDAO.findById(id).get();
    }

    @GetMapping(value = "/runs/{run_id}")
    public Iterable<OutsideTemperature> getUserRuns(@PathVariable long run_id) {
        List<OutsideTemperature> outsideTemperaturesList = new ArrayList<>();
        Iterator<OutsideTemperature> allOutsideTemperature = outsideTemperatureDAO.findAll().iterator();
        OutsideTemperature outsideTemperatureTampon;
        while (allOutsideTemperature.hasNext()) {
            outsideTemperatureTampon = allOutsideTemperature.next();
            if (outsideTemperatureTampon.getRun_id() == run_id) {
                outsideTemperaturesList.add(outsideTemperatureTampon);
            }
        }
        return outsideTemperaturesList;
    }
}
