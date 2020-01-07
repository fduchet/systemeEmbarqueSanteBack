package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.BodyTemperaturesDAO;
import watchProject.objects.BodyTemperature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    @RestController
    @Controller
    @RequestMapping("/bodyTemperatures")
    public class BodyTemperatureController {

        private BodyTemperaturesDAO bodyTemperaturesDAO;

        public BodyTemperatureController(BodyTemperaturesDAO bodyTemperaturesDAO) {
            this.bodyTemperaturesDAO = bodyTemperaturesDAO;
        }

        @GetMapping(value = "/")
        public Iterable<BodyTemperature> getAllBodyTemperatures() {
            return bodyTemperaturesDAO.findAll();
        }

        @GetMapping(value = "/ {id}")
        public BodyTemperature getBodyTemperatures(@PathVariable long id) {
            return bodyTemperaturesDAO.findById(id).get();
        }

        @GetMapping(value = "/runs/{run_id}")
        public Iterable<BodyTemperature> getUserRuns(@PathVariable long run_id) {
            List<BodyTemperature> bodyTemperatureList = new ArrayList<>();
            Iterator<BodyTemperature> allBodyTemperature = bodyTemperaturesDAO.findAll().iterator();
            BodyTemperature bodyTemperatureTampon;
            while (allBodyTemperature.hasNext()) {
                bodyTemperatureTampon = allBodyTemperature.next();
                if (bodyTemperatureTampon.getRun_id() == run_id) {
                    bodyTemperatureList.add(bodyTemperatureTampon);
                }
            }
            return bodyTemperatureList;
        }
    }

