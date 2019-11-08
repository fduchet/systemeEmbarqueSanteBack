package watchProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.RunsDAO;
import watchProject.objects.Run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@Controller
@RequestMapping("/runs")
public class RunController {

    private final RunsDAO runsDAO;

    public RunController(RunsDAO runsDAO) {
        this.runsDAO = runsDAO;
    }

    @GetMapping(value="/")
    public Iterable<Run> getAllRuns(){ return runsDAO.findAll();}

    @GetMapping(value="/{id}")
    public Run getRuns(@PathVariable long id){ return runsDAO.findById(id).get(); }

    @GetMapping(value="/users/{user_id}")
    public Iterable<Run> getUserRuns(@PathVariable long user_id){
        List<Run> runList = new ArrayList<>();
        Iterator<Run> allRuns = runsDAO.findAll().iterator();
        Run runTampon;
        while(allRuns.hasNext()){
            runTampon = allRuns.next();
            if(runTampon.getUser_id() == user_id){
                runList.add(runTampon);
            }
        }
        return runList;
    }
}
