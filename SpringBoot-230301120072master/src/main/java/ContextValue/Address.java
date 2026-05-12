package ContextValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("1")
    private int addId;

    @Value("BBSR")
    private String city;

    @Value("Khurdha")
    private String dist;

    @Value("Odisha")
    private String state;

    @Override
    public String toString() {
        return "Address [addId=" + addId +
                ", city=" + city +
                ", dist=" + dist +
                ", state=" + state + "]";
    }
}