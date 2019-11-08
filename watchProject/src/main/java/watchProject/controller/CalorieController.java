package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.CaloriesDAO;
import watchProject.objects.Calorie;
import watchProject.objects.Run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @GetMapping(value="/runs/{run_id}")
    public Iterable<Calorie> getUserRuns(@PathVariable long run_id){
        List<Calorie> calorieList = new ArrayList<>();
        Iterator<Calorie> allCalories = caloriesDAO.findAll().iterator();
        Calorie calorieTampon;
        while(allCalories.hasNext()){
            calorieTampon = allCalories.next();
            if(calorieTampon.getRun_id() == run_id){
                calorieList.add(calorieTampon);
            }
        }
        return calorieList;
    }

}
