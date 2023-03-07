package ru.nightmare.yite.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nightmare.yite.model.data.entity.User;
import ru.nightmare.yite.model.data.repository.UserRepository;

import java.sql.Date;
import java.util.HashSet;
import java.util.UUID;

@Controller
@RequestMapping("/home")
public class Home {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/home")
    public String get() {
        User user = new User();
        user.setName("Yra");
        user.setLastName("Kurbatov");
        user.setPassword("123123");
        user.setStatus("lonely developer");
        user.setBirthday(new Date(2005 , 0, 17));
        user.setRegistrationTime(new Date(2020 , 4, 10));
        userRepository.save(user);
        return "home";
    }

}
