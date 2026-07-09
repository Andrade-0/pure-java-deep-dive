package ao.morgado.features;

public enum Weekend {

    SATURDAY("SATU"),
    SUNDAY("SUND");

    private final String abbreviation;

    Weekend(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}