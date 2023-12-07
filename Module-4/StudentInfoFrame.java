import javax.swing.*;
public class StudentInfoFrame {
public static void main(String[] args) {
// Create a JFrame (window)
JFrame frame = new JFrame("Student Information");
// Create labels for student information
JLabel nameLabel = new JLabel("Name:");
JLabel rollNoLabel = new JLabel("Roll No:");
JLabel cpiLabel = new JLabel("CPI:");
JLabel emailLabel = new JLabel("E-mail:");
// Create text fields for entering student information
JTextField nameField = new JTextField(20);
JTextField rollNoField = new JTextField(20);
JTextField cpiField = new JTextField(20);
JTextField emailField = new JTextField(20);
// Create a panel to hold the components
JPanel panel = new JPanel();
// Add components to the panel
panel.add(nameLabel);
panel.add(nameField);
panel.add(rollNoLabel);
panel.add(rollNoField);
panel.add(cpiLabel);
panel.add(cpiField);
panel.add(emailLabel);
panel.add(emailField);
// Set the layout manager for the panel
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
// Add the panel to the frame
frame.add(panel);
// Set frame properties
frame.setSize(300, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}