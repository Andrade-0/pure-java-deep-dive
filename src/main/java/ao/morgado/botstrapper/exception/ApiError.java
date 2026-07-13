package ao.morgado.botstrapper.exception;

import java.util.List;

public record ApiError(
        int status,
        String reason,
        String message,
        String path,
        String method,
        List<ApiErrorDetail>  details
) {
    @Override
    public String toString() {
        return "ApiError{" +
            "status=" + status +
            ", reason='" + reason + '\'' +
            ", message='" + message + '\'' +
            ", method='" + method + '\'' +
            ", path='" + path + '\'' +
            ", details=" + details +
        '}';
    }
}