package ru.nightmare.yite.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nightmare.yite.model.data.repository.UserRepository;

@Controller
@RequestMapping("/home")
public class Home {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/home")
    public String get() {
        return "home";
    }

}
