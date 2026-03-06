package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener{
    String pin;
        JButton buttoon1;
    mini(String pin){
        this.pin=pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2=new JLabel("WELCOME BANK");
        label2.setBounds(120,20,200,20);
        label2.setForeground(Color.red);
        label2.setFont(new Font("system",Font.BOLD,15));
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);


        try {
            data_base_connect c=new data_base_connect();
            ResultSet rs=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (rs.next()){
                label3.setText("Card Number :"+ rs.getString("card_number".substring(0,4))+"XXXXXXXXXXXX "+rs.getString("card_number".substring(12)));
            }
        }catch (Exception l){
            l.printStackTrace();
        }
        try {
            int balance=0;
            data_base_connect c=new data_base_connect();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while (resultSet.next()){
                label1.setText(label1.getText() +"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><htnl>");
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -=Integer.parseInt((resultSet.getString("amount")));

                }
            }
            label4.setText("Your Total Balance is Rs."+" "+balance);
        }catch (Exception m){
            m.printStackTrace();
        }

          buttoon1=new JButton("EXIT");
        buttoon1.setBounds(20,500,100,25);
        buttoon1.setBackground(Color.black);
        buttoon1.addActionListener(this);
        buttoon1.setForeground(Color.WHITE);
        add(buttoon1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    static void main(String[] args) {
     new mini("");
    }
}
