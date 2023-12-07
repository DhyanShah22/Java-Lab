import javax.swing.*;
import java.awt.event.*;

public class KeyEventMouseEventDemo {
    public static void main(String args[]){
        JFrame frame = new JFrame("Mouse and Key Event Demo");
        JLabel eventLabel = new JLabel("Event: ");
        JPanel panel = new JPanel();
        panel.add(eventLabel);
        frame.add(panel);
        frame.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                eventLabel.setText("Key Typed: " + keyChar);
        }
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            eventLabel.setText("Key Pressed: "+ KeyEvent.getKeyText(keyCode));
        }
        public void keyReleased(KeyEvent e){
            int keyCode = e.getKeyCode();
            eventLabel.setText("Key Released: "+ KeyEvent.getKeyText(keyCode));
        }
    });
    frame.addMouseListener(new MouseAdapter() {
       
        public void mouseClicked(MouseEvent e) {
        eventLabel.setText("Mouse Clicked: X=" + e.getX() + ", Y=" + e.getY());}
        
        public void mouseEntered(MouseEvent e) {
        eventLabel.setText("Mouse Entered: X=" + e.getX() + ", Y=" + e.getY());} 

        public void mouseExited(MouseEvent e) {
        eventLabel.setText("Mouse Exited");}});
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
    frame.setFocusable(true);
    frame.requestFocus();

}
}
