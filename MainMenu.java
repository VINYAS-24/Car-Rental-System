
package rentalsystem;

/**
 *
 * @author vinyas
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class MainMenu implements ActionListener {

    private static JLabel Image_Label;
    private static JButton CarsButton, CustomerButton, BookingButton, LogoutButton;
    private JPanel MainPanel;

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public MainMenu() {
        MainPanel = new JPanel();

        MainPanel.setLayout(new AbsoluteLayout());
        MainPanel.setMinimumSize(new Dimension(1366, 730));

        CustomerButton = new JButton("Customer");
        CarsButton = new JButton("Cars");
        BookingButton = new JButton("Booking Details");
        LogoutButton = new JButton("Logout");

        Image_Label = new JLabel();

        LogoutButton.setFont(new Font("Tahoma", 1, 14));
        CustomerButton.setFont(new Font("Tahoma", 1, 14));
        CarsButton.setFont(new Font("Tahoma", 1, 14));
        BookingButton.setFont(new Font("Tahoma", 1, 14));

        Image_Label.setIcon((new ImageIcon("C:\\Users\\vinya\\Downloads\\MainMenuImage.jpeg")));

        CustomerButton.setBackground(new Color(240,240,240));
        CarsButton.setBackground(new Color(240,240,240));
        LogoutButton.setBackground(new Color(240,240,240));
        BookingButton.setBackground(new Color(240,240,240));

        MainPanel.add(LogoutButton, new AbsoluteConstraints(800, 80, 200, 50));
        MainPanel.add(CustomerButton, new AbsoluteConstraints(70, 220, 200, 99));
        MainPanel.add(CarsButton, new AbsoluteConstraints(70, 360, 200, 99));
        MainPanel.add(BookingButton, new AbsoluteConstraints(70, 80, 200, 99));
        MainPanel.add(Image_Label, new AbsoluteConstraints(0, 0, 1370, 710));

        BookingButton.addActionListener(this);
        CustomerButton.addActionListener(this);
        LogoutButton.addActionListener(this);
        CarsButton.addActionListener(this);
//        Parent_JFrame.getMainFrame().add(MainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Cars" -> {
                Parent_JFrame.getMainFrame().getContentPane().removeAll();
                Car_Details cd = new Car_Details();
                Parent_JFrame.getMainFrame().add(cd.getMainPanel());
                Parent_JFrame.getMainFrame().getContentPane().revalidate();
            }
            case "Customer" -> {
                Parent_JFrame.getMainFrame().getContentPane().removeAll();
                Customer_Details cd = new Customer_Details();
                Parent_JFrame.getMainFrame().add(cd.getMainPanel());
                Parent_JFrame.getMainFrame().getContentPane().revalidate();
            }
           
            case "Logout" -> {
                Parent_JFrame.getMainFrame().dispose();
                Runner r = new Runner();
                JFrame frame = r.getFrame();
                Login login = new Login();
                JPanel panel = login.getMainPanel();
                frame.add(panel);
                frame.setVisible(true);
            }
            case "Booking Details" -> {
            Parent_JFrame.getMainFrame().getContentPane().removeAll();
                Booking_Details cd = new Booking_Details();
                Parent_JFrame.getMainFrame().add(cd.getMainPanel());
                Parent_JFrame.getMainFrame().getContentPane().revalidate();
            }
        }
    }
}
