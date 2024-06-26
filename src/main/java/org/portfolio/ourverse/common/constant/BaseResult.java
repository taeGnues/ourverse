package org.portfolio.ourverse.common.constant;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class BaseResult {
    private HttpStatus status;
    private String message;
}
