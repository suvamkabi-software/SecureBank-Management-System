package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class signup extends JFrame implements ActionListener {
    JButton nextbutton;
    JRadioButton radio1,radio2,radio3,mari1,mari2;
    JTextField textname,textfname,taxtemail,textadd,cityname,pinno, statename;
    JDateChooser dateChosser;
    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L + 1000L);
    String first=" " + Math.abs(first4);


    signup(){
        super("APPLICATION FORM");
        ImageIcon ima1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ima2=ima1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ima3= new ImageIcon(ima2);
        JLabel ima4=new JLabel(ima3);
        ima4.setBounds(25,10,100,100);
        add(ima4);

        JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway",Font.BOLD,40));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setBounds(330,70,600,39);
        label2.setFont(new Font("Railway",Font.BOLD,22));
        add(label2);

        JLabel  label3=new JLabel("Personal Details") ;
        label3.setBounds(290,98,600,30);
        label3.setFont(new Font("Railway",Font.BOLD,22));
        add(label3);

        JLabel labelname=new JLabel("Name :");
        labelname.setFont(new Font("railway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textname =new JTextField();
        textname.setFont(new Font("Railway",Font.BOLD,14));
        textname.setBounds(300,190,300,30);
        add(textname);

        JLabel labelfname=new JLabel("Father's Name :");
        labelfname.setFont(new Font("railway",Font.BOLD,20));
        labelfname.setBounds(100,240,200,30);
        add(labelfname);

        textfname=new JTextField();
        textfname.setFont(new Font("Railway",Font.BOLD,14));
        textfname.setBounds(300,240,300,30);
        add(textfname);

        JLabel dob=new JLabel("Date Of Birth :");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,300,200,30);
        add( dob);

        dateChosser =new JDateChooser();
        dateChosser.setForeground(new Color(159, 10, 250));
        dateChosser.setBounds(300,300,400,30);
        add(dateChosser);

        JLabel labelg= new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,360,200,30);
        add(labelg);

        radio1 =new JRadioButton("Male");
        radio1.setFont(new Font("Raleway",Font.BOLD,14));
        radio1.setBackground(new Color(20, 116, 210));
        radio1.setBounds(300,358,60,30);
        add(radio1);

        radio2 =new JRadioButton("Female");
        radio2.setFont(new Font("Raleway",Font.BOLD,14));
        radio2.setBackground(new Color(20, 116, 210));
        radio2.setBounds(440,360,90,30);
        add(radio2);

        radio3 =new JRadioButton("Other");
        radio3.setFont(new Font("Raleway",Font.BOLD,14));
        radio3.setBackground(new Color(20, 116, 210));
        radio3.setBounds(600,360,90,30);
        add(radio3);

        ButtonGroup buttongroup =new ButtonGroup();
        buttongroup.add(radio1);
        buttongroup.add(radio2);
        buttongroup.add(radio3);

        JLabel email=new JLabel("Email Address :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,410,200,30);
        add(email);

        taxtemail = new JTextField();
        taxtemail.setFont(new Font("Raleway",Font.BOLD,14));
        taxtemail.setBounds(300,408,400,30);
        add(taxtemail);

        JLabel labelms=new JLabel("Marital Status :");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,460,200,30);
        add(labelms);

        mari1 =new JRadioButton("Single");
        mari1.setFont(new Font("Raleway",Font.BOLD,14));
        mari1.setBackground(new Color(20, 116, 210));
        mari1.setBounds(300,460,100,30);
        add(mari1);

        mari2 =new JRadioButton("Unmarried");
        mari2.setFont(new Font("Raleway",Font.BOLD,14));
        mari2.setBackground(new Color(20, 116, 210));
        mari2.setBounds(450,460,200,30);
        add(mari2);

        ButtonGroup mariedgroup =new ButtonGroup();
        mariedgroup.add(mari1);
        mariedgroup.add(mari2);

        JLabel labeladd=new JLabel("Address :");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,510,200,30);
        add(labeladd);

        textadd= new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,510,400,30);
        add(textadd);

        JLabel labelcity=new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,560,200,30);
        add( labelcity);

        cityname= new JTextField();
        cityname.setFont(new Font("Raleway",Font.BOLD,14));
        cityname.setBounds(300,560,400,30);
        add(cityname);

        JLabel pincode=new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,610,200,30);
        add( pincode);

        pinno= new JTextField();
        pinno.setFont(new Font("Raleway",Font.BOLD,14));
        pinno.setBounds(300,610,400,30);
        add(pinno);

        JLabel state=new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,660,200,30);
        add( state);

        statename= new JTextField();
        statename.setFont(new Font("Raleway",Font.BOLD,14));
        statename.setBounds(300,660,400,30);
        add(statename);

        nextbutton =new JButton("signup");
        nextbutton.setFont(new Font("Raleway",Font.BOLD,13));
        nextbutton.setBackground(new Color(45, 45, 45));
        nextbutton.setForeground(Color.WHITE);
        nextbutton.setBounds(620,720,80,30);
        nextbutton.addActionListener(this);
        add(nextbutton);

        getContentPane().setBackground(new Color(20, 116, 210));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textname.getText();
        String fname=textfname.getText();
        String dob=((JTextField)  dateChosser.getDateEditor().getUiComponent()).getText();
      String gender=null;
      if (radio1.isSelected()){
          gender ="Male";
      } else if (radio2.isSelected()) {
          gender="Female";
      }else if (radio3.isSelected()){
          gender="Other";
        }
       String email=taxtemail.getText();
      String marital=null;
      if (mari1.isSelected()){
          marital="Single";
      } else if (mari2.isSelected()) {
          marital="Unmarried";
      }
      String adress=textadd.getText();
      String city=cityname.getText();
      String pincode=pinno.getText();
      String state=statename.getText();

      try {
          if (textname.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Fill All The Fields");
          }else {
              data_base_connect con =new data_base_connect();
              String q="Insert Into Signup Values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+adress+"','"+city+"','"+pincode+"','"+state+"')";
              con.statement.executeUpdate(q);
              new signup2(formno);
              setVisible(false);
          }

      }catch (Exception op){
          op.printStackTrace();
      }
    }

    public static void main(String[] args){
       new signup();

    }
}
