public class Booking {


    public int id;
    public String status;
    private Patient patient;
    private  Treatment treatment;

    public Booking(int id, String status, Patient patient,Treatment treatment) {
        this.id = id;
        this.status = status;
        this.patient = patient;
        this.treatment = treatment;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Patient getPatient() {
        return patient;
    }

    public Treatment getTreatment() {
        return treatment;
    }
}
