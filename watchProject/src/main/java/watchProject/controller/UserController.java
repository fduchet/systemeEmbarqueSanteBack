package watchProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import watchProject.DAO.UsersDAO;
import watchProject.objects.User;

@RestController
public class UserController {

    private final UsersDAO usersDAO;

    public UserController(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @GetMapping(value="/users")
    public Iterable<User> getAllUsers(){ return usersDAO.findAll();}

    @GetMapping(value="/users/{id}")
    public User getUsers(@PathVariable long id){
        return usersDAO.findById(id).get();
    }
}
