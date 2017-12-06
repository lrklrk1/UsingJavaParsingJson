public class JsonValue {

    JsonToken token;
    String value;
    Double number;

    public void setToken(JsonToken token) {
        this.token = token;
    }

    public JsonToken getToken() {
        return this.token;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return this.number;
    }

}
