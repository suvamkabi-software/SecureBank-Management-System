package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    pin( String Pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("Change Your Pin");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.BLUE);
        l3.add(label1);

        JLabel label2=new JLabel("New Pin");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(430,220,150,35);
        label2.setForeground(Color.white);
        l3.add(label2);

        p1 =new JPasswordField();
        p1.setForeground(Color.black);
        p1.setBackground(new Color(65,125,128));
        p1.setBounds(610,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3=new JLabel("Re-Enter New Pin ");
        label3.setFont(new Font("System",Font.BOLD,20));
        label3.setBounds(430,260,400,35);
        label3.setForeground(Color.white);
        l3.add(label3);

        p2 =new JPasswordField();
        p2.setForeground(Color.black);
        p2.setBackground(new Color(65,125,128));
        p2.setBounds(610,260,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p2);


        b1=new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(700,410,150,35);
        b2.setBackground(Color.white);
        b2.setFont(new Font("Raleway",Font.BOLD,20));
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        l3.add(b2);
        setLocation(0,0);
        setLayout(null);
        setSize(1550,1080);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try {
           String pin1=p1.getText();
           String pin2=p2.getText();
           if (!pin1.equals(pin2)){
               JOptionPane.showMessageDialog(null,"Entered Pin Does not Match");
               return;
           }
           if (e.getSource() ==b1){
               if (p1.getText().equals("")){
                   JOptionPane.showMessageDialog(null,"Enter New Pin");
                   return;
               }if (p2.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
               return;
               }
               data_base_connect c=new data_base_connect();
               String q1="Update bank set pin ='"+pin1+"' where pin='"+pin+"'";
               String q2="Update login set pin ='"+pin1+"' where pin='"+pin+"'";
               String q3="Update signupthree set pin ='"+pin1+"' where pin='"+pin+"'";
c.statement.executeUpdate(q1);
c.statement.executeUpdate(q2);
c.statement.executeUpdate(q3);
JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
          setVisible(false);
          new main_class(pin);
           } else if (e.getSource() ==b2) {
               new main_class(pin);
               setVisible(false);
           }
       }catch (Exception i){
           i.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new pin("");
    }
}
