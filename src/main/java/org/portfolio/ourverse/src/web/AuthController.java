package org.portfolio.ourverse.src.web;

import lombok.RequiredArgsConstructor;
import org.portfolio.ourverse.common.constant.Auth;
import org.portfolio.ourverse.src.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    // 회원가입 기능.
    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@RequestBody Auth.SignUp form) {
        authService.register(form);
        return ResponseEntity.ok("회원가입에 성공했습니다.");
    }

}
