package common.lang;

/**
 * @author kordegi
 * @date 2024.03.06 11:02
 * @Description
 */
public class Result<T> {
    private String code;

    private String message;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public static <T> Result<T> succ(T data) {
        Result<T> r = new Result<>();
        r.setCode("200");
        r.setData(data);
        r.setMessage("Done successfully");
        return r;
    }

    public static <T> Result<T> succ(String message, T data) {
        Result<T> r = new Result<>();
        r.setCode("200");
        r.setData(data);
        r.setMessage(message);
        return r;
    }

    public static <T> Result<T> fail(String message) {
        Result<T> r = new Result<>();
        r.setCode("-1");
        r.setData(null);
        r.setMessage(message);
        return r;
    }

    public static <T> Result<T> fail(String message, T data) {
        Result<T> r = new Result<>();
        r.setCode("-1");
        r.setData(data);
        r.setMessage(message);
        return r;
    }
}
