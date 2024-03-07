package common.exception;

/**
 * @author kordegi
 * @date 2024.03.06 22:37
 * @Description
 */
public class AppException extends RuntimeException {
    private int code = 500;
    private String message = "Server Error";

    public AppException(AppExceptionCodeMsg appExceptionCodeMsg) {
        super();
        this.code = appExceptionCodeMsg.getCode();
        this.message = appExceptionCodeMsg.getMessage();
    }

    public AppException(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
