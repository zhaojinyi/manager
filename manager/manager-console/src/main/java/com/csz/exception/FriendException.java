package com.csz.exception;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.exception
 */
public class FriendException extends RuntimeException{

    private Integer code = -1;
    private String message;

    public FriendException(String message) {
        super(message);
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
