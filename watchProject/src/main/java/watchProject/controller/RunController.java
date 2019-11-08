package watchProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.RunsDAO;
import watchProject.objects.Run;


@RestController
public class RunController {

    private final RunsDAO runsDAO;

    public RunController(RunsDAO runsDAO) {
        this.runsDAO = runsDAO;
    }

    @GetMapping(value="/runs")
    public Iterable<Run> getAllRuns(){ return runsDAO.findAll();}

    @GetMapping(value="/runs/{id}")
    public Run getRuns(@PathVariable long id){ return runsDAO.findById(id).get(); }
}
