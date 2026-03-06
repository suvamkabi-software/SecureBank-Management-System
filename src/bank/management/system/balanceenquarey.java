package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.sql.ResultSet;

public class balanceenquarey extends JFrame implements ActionListener {
    JLabel label1,label2;
    JButton b1;
    String pin;

    balanceenquarey(String pin){
       this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

         label1=new JLabel(" Your Current Balance is RS");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setBounds(430,180,700,35);
        label1.setForeground(Color.white);
        l3.add(label1);


        label2=new JLabel();
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.white);
        l3.add(label2);

        b1=new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Raleway",Font.BOLD,20));
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        l3.add(b1);

        int balance=0;
        try {
            data_base_connect c=new data_base_connect();
            ResultSet resultSet1=c.statement.executeQuery("select  * from bank  where pin='"+pin+"'");
            while (resultSet1.next()) {
                if (resultSet1.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet1.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet1.getString("amount"));
                }
            }
        }catch (Exception p){
            p.printStackTrace();
        }
        label2.setText(""+balance);
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         setVisible(false);
         new main_class(pin);
    }

    static void main(String[] args) {
   new balanceenquarey("");
    }
}
