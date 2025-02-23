import java.util.List;

public class Physiotherapist {

    public  int id;
    public String name;
    public String address;
    public String phone;
    public  List<String> expertise;

    public  Physiotherapist(int id, String name, String address, String phone, List<String> expertise){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.expertise = expertise;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getExpertise() {
        return expertise;
    }
}
