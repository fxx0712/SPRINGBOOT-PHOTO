package com.example.fxx_consumer.util;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;


    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> Result<T> respOK() {
        return respOK(null);
    }

    public static <T> Result<T> respOK(T data) {
        return new Result(200, "success", data);
    }
    public static <T> Result<T> respOK(String message,T data) {
        return new Result(200, message, data);
    }
    public static <T> Result<T> respFail() {
        return respFail("Failure");
    }

    public static <T> Result<T> respFail(String message) {
        return new Result(500, message, null);
    }
    public static <T> Result<T> respFail(String message,T data) {
        return new Result(500, message, data);
    }
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
