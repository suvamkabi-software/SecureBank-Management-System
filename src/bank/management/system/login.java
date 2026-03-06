package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login  extends JFrame implements ActionListener {
     JLabel label1,label2,label3;
     JTextField textField2;
     JPasswordField passwordfield3;
     JButton button1,button2,button3;

     login(){
        super("Bank Management System");

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image image2=image.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel image4=new JLabel(image3);
        image4.setBounds(350,10,100,100);
        add(image4);

        ImageIcon secondimage=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image secondimage2=secondimage.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon secondimage3=new ImageIcon(secondimage2);
        JLabel secondimage4=new JLabel(secondimage3);
        secondimage4.setBounds(630,350,100,100);
        add(secondimage4);

        label1 =new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setForeground(new Color(25, 25, 112));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 =new JLabel("CARD NO:");
        label2.setFont(new Font("Railway",Font.BOLD,28));
        label2.setForeground(new Color(64, 224, 208));
       label2.setBounds(125,190,375,30);
       add(label2);

       textField2 =new JTextField(20);
       textField2.setBounds(325,190,230,30);
       textField2.setFont(new Font("Arial",Font.BOLD,14));
       add(textField2);


       label3 =new JLabel("PIN NO:");
       label3.setFont(new Font("Railway",Font.BOLD,28));
       label3.setForeground(new Color(64, 224, 208 ));
       label3.setBounds(155,240,375,30);
       add(label3);

       passwordfield3 =new JPasswordField(15);
       passwordfield3.setBounds(325,240,230,30);
       passwordfield3.setFont(new Font("Arial",Font.BOLD,14));
       add(passwordfield3);


       button1 = new JButton("SIGN IN");
       button1.setBounds(335,300,100,30);
       button1.setFont(new Font("Arial",Font.BOLD,14));
       button1.setForeground(Color.white);
       button1.setBackground(new Color(33, 150, 243));
       button1.addActionListener(this);
       add(button1);

       button2 =new JButton("CLEAR");
       button2.setFont(new Font("Arial",Font.BOLD,14));
       button2.setBounds(450,300,100,30);
       button2.setForeground(Color.white);
       button2.setBackground(new Color(33, 150, 243));
       button2.addActionListener(this);
       add(button2);

       button3=new JButton("SIGN UP");
       button3.setFont(new Font("Arial",Font.BOLD,14));
       button3.setBounds(330,350,230,30);
       button3.setForeground(Color.white);
       button3.setBackground(new Color(33, 150, 243));
       button3.addActionListener(this);
       add(button3);

       ImageIcon thirdimage=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image thirdimage2=thirdimage.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon thirdimage3=new ImageIcon(thirdimage2);
        JLabel thirdimage4=new JLabel(thirdimage3);
        thirdimage4.setBounds(0,0,850,480);
        add(thirdimage4);

        setLayout(null);
        setSize(850,480);
        setLocation(400,200);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent click) {
        try {
            if (click.getSource() == button1)
            {
                data_base_connect connect1=new data_base_connect();
                String cardno=textField2.getText();
                String pin=passwordfield3.getText();
                String query = "select * from login where card_number='"+cardno+"' and pin ='" + pin + "'";
                ResultSet resultset= connect1.statement.executeQuery(query);
                if (resultset.next()){
                    setVisible(false);
                    new main_class(pin);

                } else if (cardno.isEmpty()  && pin.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"FILL THE BLANKS ");
                } else if (textField2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"ENTER YOUR CARD NUMBER ");
                } else if (pin.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"ENTER YOUR  PIN");
                } else {
                    JOptionPane.showMessageDialog(null,"INCORRECT CARD NUMBER OR PIN");
                }
            }
            else if (click.getSource() == button2)
            {
              textField2.setText("");
              passwordfield3.setText("");
            } else if (click.getSource() == button3) {
                new signup();
                setVisible(false);
            }

        }
        catch (Exception n){
            n.printStackTrace();

        }
    }

    public static void main(String[] args) {
     new login();
    }

}