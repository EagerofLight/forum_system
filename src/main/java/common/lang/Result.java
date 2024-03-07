package common.lang;

import common.exception.AppExceptionCodeMsg;

/**
 * @author kordegi
 * @date 2024.03.06 11:02
 * @Description
 */
public class Result<T> {
    private int code;

    private String message;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result succ(T data) {
        Result r = new Result(200, "success", data);
        return r;
    }

    public static <T> Result succ(String message, T data) {
        Result r = new Result(200, message, data);
        return r;
    }

    public static <T> Result fail(AppExceptionCodeMsg appExceptionCodeMsg) {
        Result r = new Result(appExceptionCodeMsg.getCode(), appExceptionCodeMsg.getMessage(), null);
        return r;
    }

    public static <T> Result fail(int code, String message) {
        Result r = new Result(code, message, null);
        return r;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
