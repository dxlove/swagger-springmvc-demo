package com.zjx.exception;

public class HttpStatus401Exception extends RuntimeException {
    public HttpStatus401Exception() {
    }

    public HttpStatus401Exception(String message) {
        super(message);
    }

    public HttpStatus401Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpStatus401Exception(Throwable cause) {
        super(cause);
    }

    public HttpStatus401Exception(String errorMsg, String errorCode, String errorCause, String suggest) {
        super(errorMsg + errorCode + errorCause + suggest);
    }
}
