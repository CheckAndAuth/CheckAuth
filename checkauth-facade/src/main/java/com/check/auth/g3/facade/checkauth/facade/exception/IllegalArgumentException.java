package com.check.auth.g3.facade.checkauth.facade.exception;

public class IllegalArgumentException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public IllegalArgumentException() {

    }

    public IllegalArgumentException(String message) {
        super(message);
    }

    public IllegalArgumentException(Throwable cause) {
        super(cause);
    }

    public IllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

}
