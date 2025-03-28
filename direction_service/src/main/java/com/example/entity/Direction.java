package com.example.entity;

public class Direction {
    String direction;
    String state;
    String center;
    String idcard;

    @Override
    public String toString() {
        String string = "Direction "+direction+
                        "\nState: " + state+
                        "\ncenter: "+ center+
                        "\nidcard: "+ idcard;
        return string;
    }

    public String getDirection() {
	    return direction;
    }

    public String getState() {
        return state;
    }

    public String getCenter() {
        return center;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
