package common.exception;

import common.lang.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author kordegi
 * @date 2024.03.06 11:23
 * @Description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public <T> Result<T> exceptionHandler(Exception e) {
        if (e instanceof AppException) {
            AppException appException = (AppException) e;
            return Result.fail(appException.getCode(), appException.getMessage());
        }

        return Result.fail(500, "Server Error");
    }
}
