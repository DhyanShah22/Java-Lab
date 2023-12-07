import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class tempCodeRunnerFile {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Student Information");

        // Create labels for student information
        JLabel nameLabel = new JLabel("Name:");
        JLabel rollNoLabel = new JLabel("Roll No:");
        JLabel cpiLabel = new JLabel("CPI:");
        JLabel emailLabel = new JLabel("E-mail:");
        JButton enterButton= new JButton("Enter");

        // Create text fields for entering student information
        JTextField nameField = new JTextField(20);
        JTextField rollNoField = new JTextField(20);
        JTextField cpiField = new JTextField(20);
        JTextField emailField = new JTextField(20);

        // Create a panel with a GridLayout
        JPanel panel = new JPanel(new GridLayout(5, 2));

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(rollNoLabel);
        panel.add(rollNoField);
        panel.add(cpiLabel);
        panel.add(cpiField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(enterButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add ActionListener to the CPI field
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the CPI value
                String cpiValue = cpiField.getText();

                // Get other student information
                String name = nameField.getText();
                String rollNo = rollNoField.getText();
                String email = emailField.getText();

                // Write data to the corresponding file
                writeToFile(cpiValue, name, rollNo, email);
            }
        });
    }

    private static void writeToFile(String cpi, String name, String rollNo, String email) {
        // Specify the file path based on the CPI value
        String filePath = cpi + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write student information to the file
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Roll No: " + rollNo);
            writer.newLine();
            writer.write("Email: " + email);
            writer.newLine();
            writer.write("CPI: " + cpi);
            writer.newLine();

            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
