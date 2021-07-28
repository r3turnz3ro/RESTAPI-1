package com.khan;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/users")
  public List<User> all() {

    List<User> users = new ArrayList<User>();

    users.add(new User(1L, "sam"));
    users.add(new User(2L, "makid"));


    return users;
  }

}
