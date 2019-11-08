package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.OxygenLevelsDAO;
import watchProject.objects.OxygenLevel;


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

}
