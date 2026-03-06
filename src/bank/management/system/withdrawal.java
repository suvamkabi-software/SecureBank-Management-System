package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class withdrawal extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;


    withdrawal(String pin){
    this.pin=pin;
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
    Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l3=new JLabel(i3);
    l3.setBounds(0,0,1550,830);
    add(l3);

    JLabel label1=new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.BLUE);
        l3.add(label1);


        JLabel label2=new JLabel(" PLZ  ENTER A AMOUNT");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(520,220,400,35);
        label2.setForeground(Color.BLUE);
        l3.add(label2);

        textField =new TextField();
        textField.setForeground(Color.black);
        textField.setBackground(new Color(65,125,128));
        textField.setBounds(465,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
       l3.add(textField);

    b1=new JButton("WITHDRAWAL");
       b1.setBounds(700,362,150,35);
       b1.setBackground(Color.white);
       b1.setFont(new Font("Raleway",Font.BOLD,15));
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

    setLayout(null);
    setSize(1550,1080);
    setLocation(0,0);
    setVisible(true);


}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formatted = indiaTime.format(formatter);

                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawal");
                } else {
                    data_base_connect con = new data_base_connect();
                    ResultSet statement = con.statement.executeQuery("select  * from bank  where pin='" + pin + "'");
                    int balance = 0;
                    while (statement.next()) {
                        if (statement.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(statement.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(statement.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }
                    con.statement.executeUpdate("insert into bank values ('" + pin + "','" + formatted + "','withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "RS," + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception not) {
                not.printStackTrace();
            }
        } else if (e.getSource() ==b2) {
           setVisible(false);
           new main_class(pin);
        }
    }

    static void main(String[] args) {
      new withdrawal("");
    }
}

