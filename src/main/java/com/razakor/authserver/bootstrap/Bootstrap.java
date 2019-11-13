package com.razakor.authserver.bootstrap;

import com.razakor.authserver.documents.UserEntity;
import com.razakor.authserver.services.UserService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationRunner {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public Bootstrap(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
/*
        UserEntity user = new UserEntity(null, "Razakor", passwordEncoder.encode("pass"), "m.shevchuk.o@gmail.com", "Max", "Shevchuk");
        user.AddRole("ROLE_USER");
        userService.save(user);

*/
/*
        User user2 = new User("admin", "password", true);
        user2.AddRole("ROLE_USER");
        user2.AddRole("ROLE_ADMIN");
        userService.save(user2);
*/
    }
}
