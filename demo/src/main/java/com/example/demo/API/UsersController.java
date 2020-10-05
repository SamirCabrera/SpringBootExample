package com.example.demo.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* import com.example.demo.Model.PagedResult; */
import com.example.demo.Model.User;
import com.example.demo.Model.UserV2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    final User user1 = new User(1, "User1");
    final User user2 = new User(2, "User2");
    final User user3 = new User(3, "User3");

    ArrayList<User> users = new ArrayList<>();


    @GetMapping("/user")
    public String hello() {
        return " Hola";
    }

    @GetMapping("/listaUser")
    public User lista() {
        return users.get(1);
    }

    @GetMapping("/indexListaUser")
    public int index() {
        users.add(user1);
        users.add(user1);
        users.add(user1);
        return users.size();
    }

    
    @GetMapping("/users/{id}")
    public User Search(@PathVariable("id") final int id) {
        users.add(user1);
        users.add(user1);
        users.add(user1);
        for (final User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @PostMapping("/user")
    public User Add(@RequestBody final User newUser) {
        users.add(newUser);
        return newUser;
    }

    @PutMapping("/user/{id}")
    public User Update(@RequestBody final User updateUser, @PathVariable("id") final int id) {
        for (User user : users) {
            if (user.getId() == id) {
                user = updateUser;
                return user;
            }
        }
        return null;
    }

    @DeleteMapping("/user/{id}")
    public void Delete(@PathVariable("id") final int id) {
        for (final User user : users) {
            if (user.getId() == id) {
                users.remove(user);
            }
        }
    }

    /*
     * private User recorrer(ArrayList<User> user, int id) { for (User _user: user)
     * { if (_user.getId() == id) { return _user; } } }
     */

    public List<User> postList() {

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    private static List<UserV2> usersv2 = Arrays.asList(new UserV2(1, "Usuario 1", "em-US"),
            new UserV2(1, "Usuario 1", "em-US"));

    @GetMapping("/v1/users")
    public List<User> users() {
        return null;
    }

    @GetMapping("/v2/users")
    public List<UserV2> usersV2() {
        return null;
    }

/*     @GetMapping("/v2/users/paged/{pageNumber}")
    public PagedResult<UserV2> UsersV2Page(@PathVariable("pageNumber") final int pageNumber) {
        return new PagedResult<>(users, "/v2/users/paged/", pageNumber);
    } */
}
