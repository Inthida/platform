/*
import com.training.platform.entities.User;
import com.training.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/ser")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "")
    public String indexAll() {
        List<User> users = userService.findAll();
        System.out.println("############### Find All User (In Console) ###############");
        System.out.println(users);
        return "Method GET, Function : index => SHOW data list on page";
    }

    @GetMapping(value = "/findA_JPQ")
    public List<User> index() {
        // Change from UserRepository to UserService
        return userService.findAllByJpqlParamsQuery(0, "bangkok");
    }


    // Example for findAllByQuery
    @GetMapping(value = "/findA")
    public List<User> findAllByQuery() {
        return userService.findAllByQuery();
    }
    // Example for findAllByParamsQuery
    @GetMapping(value = "/findA_PQ")
    public List<User> findAllBPQ() {
        return userService.findAllByParamsQuery(0, "nakornpathom");
    }

    // Example for findAllByJpqlQuery
    @GetMapping(value = "/findA_JQ")
    public List<User> findAllBJQ() {
        return userService.findAllByJpqlQuery();
    }

    // Example for findAllByLimit
    @GetMapping(value = "/findA_LM")
    public Page<User> findAllLM(@RequestBody String start, @RequestBody String limit, @RequestBody String field) {
        Page<User> userLimit = userService.findAllByLimit(Integer.parseInt(start), Integer.parseInt(limit), field);
        return userLimit;
    }

    @GetMapping(value = "/{id}")
    public String showWithPath(@PathVariable String id) {
        Optional<User> user = userService.findById(Integer.parseInt(id));
        System.out.println("############### Find User By ID (In Console) ###############");
        System.out.println(user);

        return "Method Get, Function : show, ID : "+ id +" => SHOW data by id on page with path";
    }

    @GetMapping(value = "/findA_CAA")
    public List<User> indexCAA() {
        List<User> users = userService.findByCityAndActiveAndAge("nakornpathom", 1, 18);
        return users;
    }

    @GetMapping(value = "/find_AgeI")
    public List<User> indexAI(@RequestParam(name = "age") List<Integer> listAgeI) {
        return userService.findByAgeIn(listAgeI);
    }
}*/
