package com.smp.sellmyposting.user.service;

import com.smp.sellmyposting.user.domain.User;
import com.smp.sellmyposting.user.dto.request.UserRequestDTO;
import com.smp.sellmyposting.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(UserRequestDTO userRequestDTO) {
        User user = userRequestDTO.toEntity();

        return userRepository.save(user);
    }
}
