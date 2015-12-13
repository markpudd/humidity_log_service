package com.invoax.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by markpudd on 13/12/2015.
 */
public class Humidity {

    @Id
    private String _id;

    private float humidity;
    private float temperature;

    private Date timestamp;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
