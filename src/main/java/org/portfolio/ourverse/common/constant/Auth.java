package org.portfolio.ourverse.common.constant;

import lombok.Data;

/*
    회원가입 및 로그인 시 사용하는 DTO
 */
public class Auth {
    @Data
    public static class SignUp{
        private String username;
        private String email;
        private String phone;
        private String password;
        private String name;
        private String nickname;
        private Authority role;
    }
}
