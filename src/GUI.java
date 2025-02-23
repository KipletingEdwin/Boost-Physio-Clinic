import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Boost Physio Clinic Booking System");
        setSize(600, 400);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        JButton bookingBtn = new JButton("Book Appointment");
        JButton managePatientsBtn = new JButton("Manage Patients");


        panel.add(bookingBtn);
        panel.add(managePatientsBtn);

        add(panel);
    }
}
