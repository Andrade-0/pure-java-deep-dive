package ao.morgado.botstrapper.exception;

import java.util.List;

public class GlobalExceptionHandler {

    public static ApiError handleValidation(ValidationException exception, String method, String path) {
        List<ApiErrorDetail> details = List.of(
                new ApiErrorDetail(exception.getField(), "NA", "NA")
        );
        return new ApiError(
                400,
                "VALIDATION_ERROR",
                "Validation failed",
                method,
                path,
                details
        );
    }
}