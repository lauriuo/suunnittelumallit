package app;

/**
 * Data
 */
public class Data {
    String dataKey;
    String dataValue;

    public Data(String k, String v) {
        this.dataKey = k;
        this.dataValue = v;
    }
    public String getData() {
        return dataKey + " " + dataValue;
    }
}