package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.OxygenLevelsDAO;
import watchProject.objects.Calorie;
import watchProject.objects.OxygenLevel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@Controller
@RequestMapping("/oxygenLevel")
public class OxygenLevelController {

    private final OxygenLevelsDAO oxygenLevelsDAO;

    public OxygenLevelController(OxygenLevelsDAO oxygenLevelsDAO) {
        this.oxygenLevelsDAO = oxygenLevelsDAO;
    }

    @GetMapping(value="/")
    public Iterable<OxygenLevel> getAllOxygenLevels(){ return oxygenLevelsDAO.findAll();}

    @GetMapping(value="/ {id}")
    public OxygenLevel getOxygenLevels(@PathVariable long id){ return oxygenLevelsDAO.findById(id).get();}

    @GetMapping(value="/calories/runs/{run_id}")
    public Iterable<OxygenLevel> getUserRuns(@PathVariable long run_id){
        List<OxygenLevel> oxygenLevelList = new ArrayList<>();
        Iterator<OxygenLevel> allOxygenLevels = oxygenLevelsDAO.findAll().iterator();
        OxygenLevel oxygenLevelTampon;
        while(allOxygenLevels.hasNext()){
            oxygenLevelTampon = allOxygenLevels.next();
            if(oxygenLevelTampon.getRun_id() == run_id){
                oxygenLevelList.add(oxygenLevelTampon);
            }
        }
        return oxygenLevelList;
    }
}
