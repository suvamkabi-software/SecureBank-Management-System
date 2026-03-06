package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;



public class Deposit  extends JFrame implements ActionListener {
 String pin;
 TextField textField;
 JButton b1,b2;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.BLUE);
        l3.add(label1);

        textField =new TextField();
        textField.setForeground(Color.black);
        textField.setBackground(new Color(65,125,128));
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
       l3.add(textField);

       b1=new JButton("DEPOSIT");
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

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
      try {
          String amount=textField.getText();
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
          sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
          String date = sdf.format(new Date());
          if (e.getSource() == b1){
              if (textField.getText().equals("")){
                  JOptionPane.showMessageDialog(null,"please enter the Amount you want to deposite");
              }else {
                  data_base_connect c=new data_base_connect();
                  c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')");
                  JOptionPane.showMessageDialog(null,"Rs."+amount+"Deposit Successfully");
                  setVisible(false);
              }
          } else if (e.getSource()==b2) {
              setVisible(false);
              new main_class(pin);
          }
      }catch (Exception op){
          op.printStackTrace();
      }



    }

    static void main(String[] args) {
   new Deposit("");
    }
}
