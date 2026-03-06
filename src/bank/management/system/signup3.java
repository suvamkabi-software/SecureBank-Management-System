package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3  extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    signup3( String formno){
        this.formno=formno;

        super("APPLICATION FORM no.3");
        ImageIcon ima1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ima2=ima1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ima3= new ImageIcon(ima2);
        JLabel ima4=new JLabel(ima3);
        ima4.setBounds(150,5,100,100);
        add(ima4);


        JLabel l1=new JLabel("Page3.");
        l1.setFont(new Font("Raliway",Font.BOLD,22));
        l1.setForeground(Color.white);
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("Raliway",Font.BOLD,22));
        l2.setForeground(Color.white);
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Raliway",Font.BOLD,20));
        l3.setForeground(Color.white);
        l3.setBounds(100,140,200,40);
        add(l3);
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raliway",Font.BOLD,16));
        r1.setForeground(Color.BLACK);
        r1.setBackground(new Color(189, 158, 31));
        r1.setBounds(100,180,150,40);
        add(r1);
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raliway",Font.BOLD,16));
        r2.setForeground(Color.BLACK);
        r2.setBackground(new Color(189, 158, 31));
        r2.setBounds(350,180,300,30);
        add(r2);
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raliway",Font.BOLD,16));
        r3.setForeground(Color.BLACK);
        r3.setBackground(new Color(189, 158, 31));
        r3.setBounds(100,220,250,30);
        add(r3);
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raliway",Font.BOLD,16));
        r4.setForeground(Color.BLACK);
        r4.setBackground(new Color(189, 158, 31));
        r4.setBounds(350,210,250,30);
        add(r4);

        ButtonGroup buttongroup=new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);
        buttongroup.add(r3);
        buttongroup.add(r4);


        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Raliway",Font.BOLD,20));
        l4.setForeground(Color.white);
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your  16-digit Card Number)");
        l5.setFont(new Font("Raliway",Font.BOLD,10));
        l5.setForeground(Color.BLACK);
        l5.setBounds(100,325,220,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raliway",Font.BOLD,18));
        l6.setForeground(Color.white);
        l6.setBounds(330,295,200,40);
        add(l6);
        JLabel l7=new JLabel("(IT Would appear on atmcard/cheque and statements)");
        l7.setFont(new Font("Raliway",Font.BOLD,12));
        l7.setForeground(Color.black);
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8=new JLabel("PIN ");
        l8.setFont(new Font("Raliway",Font.BOLD,18));
        l8.setForeground(Color.white);
        l8.setBounds(110,370,200,30);
        add(l8);
        JLabel l9=new JLabel("XXXX ");
        l9.setFont(new Font("Raliway",Font.BOLD,18));
        l9.setForeground(Color.white);
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-digit password) ");
        l10.setFont(new Font("Raliway",Font.BOLD,12));
        l10.setForeground(Color.black);
        l10.setBounds(100,390,200,30);
        add(l10);

        JLabel l11=new JLabel("Service Required ");
        l11.setFont(new Font("Raliway",Font.BOLD,18));
        l11.setForeground(Color.white);
        l11.setBounds(100,450,200,30);
        add(l11);
        c1=new JCheckBox("Atm Card");
        c1.setBackground(new Color(189, 158, 31));
        c1.setFont(new Font("Raliway",Font.BOLD,16));
        c1.setBounds(100,490,200,30);
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(189, 158, 31));
        c2.setFont(new Font("Raliway",Font.BOLD,16));
        c2.setBounds(320,490,200,30);
        add(c2);
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(189, 158, 31));
        c3.setFont(new Font("Raliway",Font.BOLD,16));
        c3.setBounds(100,515,200,30);
        add(c3);
        c4=new JCheckBox("Email Alert");
        c4.setBackground(new Color(189, 158, 31));
        c4.setFont(new Font("Raliway",Font.BOLD,16));
        c4.setBounds(320,520,200,30);
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(189, 158, 31));
        c5.setFont(new Font("Raliway",Font.BOLD,16));
        c5.setBounds(100,540,200,30);
        add(c5);
        c6=new JCheckBox("E-statement");
        c6.setBackground(new Color(189, 158, 31));
        c6.setFont(new Font("Raliway",Font.BOLD,16));
        c6.setBounds(320,545,200,30);
        add(c6);
        JCheckBox c7=new JCheckBox("I here by declare that the above entered details correct to the best of knowledge.");
        c7.setFont(new Font("Raliway",Font.BOLD,12));
        c7.setBounds(100,600,600,20);
        c7.setBackground(new Color(189, 158, 31));
        add(c7);

        JLabel l12=new JLabel("Form NO: ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setForeground(Color.white);
        l12.setBounds(600,10,110,30);
        add(l12);
        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setForeground(Color.white);
        l13.setBounds(760,10,60,30);
        add(l13);
        s=new JButton("  Summit");
        s.setFont(new Font("Arial",Font.BOLD,14));
        s.setBackground(Color.black);
        s.setForeground(Color.white);
        s.addActionListener(this);
        s.setBounds(200,670,100,30);
        add(s);
        c=new JButton("Cancel");
        c.setFont(new Font("Arial",Font.BOLD,14));
        c.setBackground(Color.black);
        c.setForeground(Color.white);
        c.addActionListener(this);
        c.setBounds(400,670,100,30);
        add(c);

        getContentPane().setBackground(new Color(189, 158, 31));
        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String actype= "";
      if (r1.isSelected()){
          actype="Saving Account";
        } else if (r2.isSelected()) {
          actype="Fixed Deposit Account";
      } else if (r3.isSelected()) {
          actype="Current Account";
      }else if (r4.isSelected()) {
          actype="Recurring Deposit Account";
      }
        Random ran=new Random();
      long first7=(ran.nextLong() % 90000000L)  + 1409963000000000L;
      String cardno=""+Math.abs(first7);

      long first3=(ran.nextLong() % 9000L)+ 1000L;
      String pin=""+Math.abs(first3);
      String fac="";
        if (c1.isSelected()){
             fac = fac +"Atm card";
        } else if (c2.isSelected()) {
           fac =fac +"Internet Banking";
        } else if (c3.isSelected()) {
            fac =fac+"Mobile Banking";
        }else if (c4.isSelected()) {
            fac =fac+"Email Alert";
        } else if (c5.isSelected()) {
            fac =fac +"Cheque Book";
        }else if (c6.isSelected()) {
            fac =fac + "E-statement";
        }
        try {
            if (e.getSource() ==s){
                if (actype.equals((""))) {
                    JOptionPane.showMessageDialog(null, "FILL the Blanks");
                }else {
                    data_base_connect c1=new data_base_connect();
                    String q1="insert into Signupthree values ('"+formno+"','"+actype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values ('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"CARD NUMBER :"+cardno+"\n PIN:"+ pin);
                    new  Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() ==c) {
                System.exit(0);
            }
        }catch (Exception erorr){
            erorr.printStackTrace();
        }

    }

    static void main(String[] args) {
        new signup3("");

    }
}
