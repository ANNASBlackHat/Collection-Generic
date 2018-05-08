package model;

public class Media {
    private String token;
    private String device_id;
    private MediaData data;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public MediaData getData() {
        return data;
    }

    public void setData(MediaData data) {
        this.data = data;
    }
}
