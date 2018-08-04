public class Entry {

    public String key;
    public String value;

    public Entry() {}

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toString() {
        return key + "::" + value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
