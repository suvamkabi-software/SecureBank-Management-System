package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class firstcash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    firstcash(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);
        JLabel  label=new JLabel("SELECT WITHDRAWAL AMOUNT");
        label.setBounds(428,180,700,35);
        label.setFont(new Font("System",Font.BOLD,26));
        label.setForeground(Color.BLUE);
        l3.add(label);

        b1 =new JButton("RS. 100");
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBackground(new Color(65,125,128));
        b1.setFont(new Font("System",Font.BOLD,20));
        b1.setBounds(400,270,150,35);
        l3.add(b1);

        b2 =new JButton("RS. 500");
        b2.addActionListener(this);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setFont(new Font("System",Font.BOLD,20));
        b2.setBounds(702,270,155,35);
        l3.add(b2);

        b3 =new JButton("RS. 1000");
        b3.addActionListener(this);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setFont(new Font("System",Font.BOLD,20));
        b3.setBounds(400,316,150,35);
        l3.add(b3);

        b4 =new JButton("RS. 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setFont(new Font("System",Font.BOLD,20));
        b4.setBounds(700,318,157,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 =new JButton("RS. 5000");
        b5.addActionListener(this);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setFont(new Font("System",Font.BOLD,20));
        b5.setBounds(400,362,157,35);
        l3.add(b5);

        b6 =new JButton("RS. 10000");
        b6.addActionListener(this);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setFont(new Font("System",Font.BOLD,20));
        b6.setBounds(700,362,157,35);
        l3.add(b6);

        b7 =new JButton("BACK");
        b7.addActionListener(this);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setFont(new Font("System",Font.BOLD,20));
        b7.setBounds(700,406,157,35);
        l3.add(b7);


        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() ==b7){
         setVisible(false);
         new main_class(pin);
     }else {
         String amount=((JButton)e.getSource()).getText().substring(4);
         data_base_connect c=new data_base_connect();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
         sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
         String date = sdf.format(new Date());
         try {
             ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
             int balance=0;
             while (resultSet.next()){
                 if (resultSet.getString("type").equals("Deposit")){
                     balance += Integer.parseInt(resultSet.getString("amount"));
                 }else {
                     balance -=Integer.parseInt((resultSet.getString("amount")));

                 }
             }String num="17";

             if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
             JOptionPane.showMessageDialog(null,"Insufficient Balance");
             return;
             }
             c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
             JOptionPane.showMessageDialog(null,"RS. "+amount+" Debited Successfully");

         }catch (Exception p){
             p.printStackTrace();
         }
         setVisible(false);
         new main_class(pin);
     }
    }

    static void main(String[] args) {
        new firstcash("");
    }
}
