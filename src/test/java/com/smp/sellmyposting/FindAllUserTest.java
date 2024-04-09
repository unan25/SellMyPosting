package com.smp.sellmyposting;

import com.smp.sellmyposting.user.domain.User;
import com.smp.sellmyposting.user.domain.enum_.Role;
import com.smp.sellmyposting.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FindAllUserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUserTest() {
        User user1 = User.builder()
                .email("test@test.com")
                .password("1234")
                .uuid("uuid")
                .active(1)
                .role(Role.USER)
                .build();

        User user2 = User.builder()
                .email("test2@test.com")
                .password("1234")
                .uuid("uuid22")
                .active(0)
                .role(Role.ADMIN)
                .build();

        userRepository.save(user1);
        userRepository.save(user2);

        final List<User> all = userRepository.findAll();
        for (User user : all) {
            System.out.println("user = " + user.getEmail());
        }
    }
}
