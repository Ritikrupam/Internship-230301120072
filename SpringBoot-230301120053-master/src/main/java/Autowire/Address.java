package Autowire;

public class Address {

    private int addId;
    private String city;
    private String dist;
    private String state;

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return "Address [addId=" + addId + ", city=" + city + ", dist=" + dist + ", state=" + state + "]";
    }
}