package com.example.springsecuritybasic;

import com.example.springsecuritybasic.entity.User;
import com.example.springsecuritybasic.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SpringsecurityBasicApplicationTests {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Test
//@Rollback(value = false)
void save_user() {
        User user1= User.builder()
                .name("Nguyen Hiep")
                .email("hiep@gmail.com")
                .password(passwordEncoder.encode("111"))
                .roles(List.of("USER","EDITOR","ADMIN"))
                .build();

        User user2= User.builder()
                .name("Nguyen Minh")
                .email("minh@gmail.com")
                .password(passwordEncoder.encode("111"))
                .roles(List.of("USER","EDITOR"))
                .build();

        User user3= User.builder()
                .name("Nguyen Hung")
                .email("hung@gmail.com")
                .password(passwordEncoder.encode("111"))
                .roles(List.of("USER"))
                .build();

      // userRepository.saveAll(user1,user2,user3);
    //userRepository.save(user2);
   //userRepository.save(user3);


    }

}
