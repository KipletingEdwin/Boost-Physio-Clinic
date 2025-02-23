import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Boost Physio Clinic Booking System");
        setSize(600, 400);
        setVisible(true);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        JButton bookingBtn = new JButton("Book Appointment");
        JButton managePatientsBtn = new JButton("Manage Patients");
        JButton reportsBtn = new JButton("Generate Reports");
        JButton exitBtn = new JButton("Exit");

        bookingBtn.addActionListener(e -> new BookingPanel());
        managePatientsBtn.addActionListener(e -> new PatientPanel());
        reportsBtn.addActionListener(e -> new ReportPanel());
        exitBtn.addActionListener(e -> System.exit(0));

        panel.add(bookingBtn);
        panel.add(managePatientsBtn);
        panel.add(reportsBtn);
        panel.add(exitBtn);

        add(panel,BorderLayout.CENTER);
    }
}
