package watchProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.TemperaturesDAO;
import watchProject.objects.Temperature;


@RestController
public class TemperatureController {

    private TemperaturesDAO temperaturesDAO;

    public TemperatureController(TemperaturesDAO temperaturesDAO) {
        this.temperaturesDAO = temperaturesDAO;
    }

    @GetMapping(value="/temperatures")
    public Iterable<Temperature> getAllTemperatures(){ return temperaturesDAO.findAll();}

    @GetMapping(value="/temperatures/ {id}")
    public Temperature getTemperatures(@PathVariable long id){ return temperaturesDAO.findById(id).get();}

}
