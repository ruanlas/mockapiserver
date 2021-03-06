package com.data.mockapiserver.service.router.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PathNotFoundRuntimeException extends RuntimeException {
    public PathNotFoundRuntimeException(String message) {
        super(message);
    }
}
