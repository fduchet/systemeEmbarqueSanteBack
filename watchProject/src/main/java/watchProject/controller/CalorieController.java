package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.CaloriesDAO;
import watchProject.objects.Calorie;

@RestController
@Controller
@RequestMapping("/calories")
public class CalorieController {
    private final CaloriesDAO caloriesDAO;

    public CalorieController(CaloriesDAO caloriesDAO) {
        this.caloriesDAO = caloriesDAO;
    }
    @GetMapping(value="/")
    public Iterable<Calorie> getAllCalories(){ return caloriesDAO.findAll();}

    @GetMapping(value="/ {id}")
    public Calorie getCalories(@PathVariable long id){ return caloriesDAO.findById(id).get();}

}
