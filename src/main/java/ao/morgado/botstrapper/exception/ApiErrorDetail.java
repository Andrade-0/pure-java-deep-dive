package ao.morgado.botstrapper.exception;

public record ApiErrorDetail(
        String code,
        String type,
        String description
) {
    @Override
    public String toString() {
        return code + " (" + type + "): " + description;
    }
}