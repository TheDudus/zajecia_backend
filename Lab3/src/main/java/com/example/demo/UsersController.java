package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class UsersController {
    private final Object locker = new Object();
    private final Map<Long, UsersEntity> users = new LinkedHashMap<>();

    @PostConstruct
    private void onCreate() {
        users.put(1L, new UsersEntity(1L, "Jan Kowalski", "jan@gmail.com"));
        users.put(2L, new UsersEntity(2L, "Andrzej Bujak", "bujak@gmail.com"));
        users.put(3L, new UsersEntity(3L, "Stefan Pietrucha", "pietrucha@gmail.com"));
        users.put(4L, new UsersEntity(4L, "Mateusz Wajcha", "Wajcha@gmail.com"));
    }

    @RequestMapping("/api/users")
    @ResponseBody
    public Object getUser(@PathVariable Long id){
        synchronized (this.locker){
            return this.users.get(id);
        }
    }
}

