import java.util.List;

public class Patient {

    public  int id;
    public String name;
    public String address;
    public String phone;


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

    public  Patient(int id, String name, String address, String phone){

        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }



}
