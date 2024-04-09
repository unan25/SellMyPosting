package com.smp.sellmyposting.user.controller;

import com.smp.sellmyposting.user.dto.request.UserRequestDTO;
import com.smp.sellmyposting.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("health-check")
    public String healthCheck() {
        return "User Service is available";
    }

    @PostMapping("signup")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserRequestDTO userRequestDTO) {
        userService.createUser(userRequestDTO);
        log.info("회원가입 완료");
        return new ResponseEntity<>("회원가입 완료", HttpStatus.CREATED);
    }

}
