package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
 JButton b1,b2,b3,b4,b5,b6,b7;
 String pin;
    main_class(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);
        JLabel  label=new JLabel("Please Select Your Transaction");
        label.setBounds(428,180,700,35);
        label.setFont(new Font("System",Font.BOLD,26));
        label.setForeground(Color.BLUE);
        l3.add(label);

        b1 =new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBackground(new Color(65,125,128));
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.setBounds(400,270,150,35);
       l3.add(b1);

        b2 =new JButton("CASH WITHDRAWAL");
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setFont(new Font("System",Font.BOLD,12));
        b2.setBounds(700,270,155,35);
        l3.add(b2);

        b3 =new JButton("FAST CASH");
        b3.addActionListener(this);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setFont(new Font("System",Font.BOLD,18));
        b3.setBounds(400,316,150,35);
        l3.add(b3);

        b4 =new JButton("MINI STATEMENT");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBounds(700,318,157,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 =new JButton("PIN CHANGE");
        b5.addActionListener(this);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setFont(new Font("System",Font.BOLD,18));
        b5.setBounds(400,362,157,35);
        l3.add(b5);

        b6 =new JButton("BALANCE CASH");
        b6.addActionListener(this);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBounds(700,362,157,35);
        l3.add(b6);

        b7 =new JButton("EXIT");
        b7.addActionListener(this);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setFont(new Font("System",Font.BOLD,18));
        b7.setBounds(700,406,157,35);
        l3.add(b7);


        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==b1){
            new Deposit(pin);
            setVisible(false);

        } else if (e.getSource() ==b7) {
            System.exit(0);
        } else if (e.getSource() ==b7) {
            System.exit(0);
        } else if (e.getSource() ==b2) {
            new withdrawal(pin);
            setVisible(false);
        } else if (e.getSource() ==b6) {
            new balanceenquarey(pin);
            setVisible(false);
        }
        else if (e.getSource() ==b3){
         new  firstcash(pin);
         setVisible(false);
        } else if (e.getSource() ==b5) {
            new pin(pin);
            setVisible(false);

        } else if (e.getSource() ==b4) {
            new mini(pin);
        }
    }

    static void main(String[] args) {
        new main_class("");

    }
}
