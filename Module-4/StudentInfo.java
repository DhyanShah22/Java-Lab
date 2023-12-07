import javax.swing.*;

public class StudentInfo {
    public static void main(String args[]){
        JFrame frame = new JFrame("Student Information");

        JLabel namLabel = new JLabel("Name");
        JLabel rollnoLabel = new JLabel("Roll Number");
        JLabel cpiLabel = new JLabel("CPI");
        JLabel emaiLabel = new JLabel("E-mail");

        JTextField nameField = new JTextField(20);
        JTextField rollnoField = new JTextField( 20);
        JTextField cpiField = new JTextField( 20);
        JTextField emailField = new JTextField( 20);

        JPanel panel = new JPanel();

        panel.add(namLabel);
        panel.add(nameField);
        panel.add(rollnoLabel);
        panel.add(rollnoField);
        panel.add(cpiLabel);
        panel.add(cpiField);
        panel.add(emaiLabel);
        panel.add(emailField);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
