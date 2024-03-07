package space.kordegi.forumcore.common.exception;

public enum AppExceptionCodeMsg {
    INVALID_CODE(10000, "Invalid code"),
    USERNAME_NOT_EXIST(10001, "Username not exist"),
    SUCCESS(200, "success"),
    NO_PERMISSION(403,"NO_PERMISSION"),
    NO_AUTH(401,"NO_AUTH"),
    NOT_FOUND(404, "not found"),
    INTERNAL_SERVER_ERROR(500, "server error"),
    ;

    private int code;
    private String message;

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

    AppExceptionCodeMsg(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
