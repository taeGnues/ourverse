package org.portfolio.ourverse.common.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionCode {
    /*
        400 : Request, Response 오류
     */
    WRONG_SOMETHING(HttpStatus.BAD_REQUEST, "잘못된 요청을 했습니다."),
    WRONG_TYPE_ROLE(HttpStatus.BAD_REQUEST, "잘못된 타입의 role를 입력했습니다.")
    ;

    ExceptionCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    private final HttpStatus httpStatus;
    private final String message;
}
