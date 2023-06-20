package fr.minibuz.demo.dvo;

public class DataDvo {

    private final String key;
    private final String value;

    public DataDvo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
