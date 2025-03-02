import java.util.ArrayList;
import java.util.List;


public class BookingSystem {
    private List<Patient> patients = new ArrayList<Patient>();
    private List<Booking> bookings = new ArrayList<Booking>();
    private List<Physiotherapist> physiotherapists = new ArrayList<Physiotherapist>();

    public  void  addPatient(Patient patient){
        patients.add(patient);
    }

    public  void  removePatient(Patient patient){
        patients.remove(patient);
    }


    public  void  cancelAppointment(int bookingId){
        bookings.removeIf(b->b.getId() == bookingId);
    }

    public void bookAppointment(Booking booking) {
        if (!booking.getTreatment().isBooked()) {
//            booking.getTreatment().setBooked(true);
            bookings.add(booking);
        }
    }

    public  void  changeBooking(int bookingId, Treatment newTreatment){

    }








}
