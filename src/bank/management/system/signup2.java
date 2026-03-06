package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class signup2  extends JFrame implements ActionListener {
    String formno;
    JTextField textpan,textadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6;
    signup2(String formno){
        super("APPLICATION FORM NO.2");
        ImageIcon ima1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ima2=ima1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ima3= new ImageIcon(ima2);
        JLabel ima4=new JLabel(ima3);
        ima4.setBounds(150,5,100,100);
        add(ima4);
        this.formno=formno;


        JLabel l1=new JLabel("Page 2:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        l1.setForeground(Color.white);
        add(l1);
        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setForeground(Color.white);
        l2.setBounds(300,60,600,40);
        add(l2);


        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setForeground(Color.white);
        l3.setBounds(100,120,100,30);
        add(l3);
        String religion []={"Hindu","Muslim","Sikh","ChirStian","Other"};
        comboBox1 =new JComboBox(religion);
        comboBox1.setBackground(new Color(20, 116, 210));
        comboBox1.setForeground(Color.black);
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(300,120,320,30);
        add(comboBox1);


        JLabel l4=new JLabel("Category ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setForeground(Color.white);
        l4.setBounds(100,170,100,30);
        add(l4);
        String category []={"General","OBC","SC","ST","Other"};
        comboBox2 =new JComboBox(category);
        comboBox2.setBackground(new Color(20, 116, 210));
        comboBox2.setForeground(Color.black);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income  ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setForeground(Color.white);
        l5.setBounds(100,220,100,30);
        add(l5);
        String income []={"Null","<1,50,000","5,00,000","UPto 10,00,000","Above 10,00,000"};
        comboBox3 =new JComboBox(income);
        comboBox3.setBackground(new Color(20, 116, 210));
        comboBox3.setForeground(Color.black);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,220,320,30);
        add(comboBox3);


        JLabel l6=new JLabel("Education  ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setForeground(Color.white);
        l6.setBounds(100,270,150,30);
        add(l6);
        String education []={"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate","Others"};
        comboBox4 =new JComboBox(education);
        comboBox4.setBackground(new Color(20, 116, 210));
        comboBox4.setForeground(Color.black);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,270,320,30);
        add(comboBox4);


        JLabel l7=new JLabel("Occupation  ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setForeground(Color.white);
        l7.setBounds(100,320,150,30);
        add(l7);
        String occupation[] = {"Student", "Government Employee", "Private Employee",
                "Self-Employed", "Business", "Farmer",
                "Retired", "Unemployed"};
        comboBox5 =new JComboBox(occupation);
        comboBox5.setBackground(new Color(20, 116, 210));
        comboBox5.setForeground(Color.black);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,320,320,30);
        add(comboBox5);


        JLabel l8=new JLabel("PAN number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setForeground(Color.white);
        l8.setBounds(100,380,150,30);
        add(l8);
        textpan =new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
       textpan.setBounds(320,380,150,30);
       add(textpan);


        JLabel l9=new JLabel("Aadhaar number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setForeground(Color.white);
        l9.setBounds(100,430,320,30);
        add(l9);
        textadhar =new JTextField();
        textadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textadhar.setBounds(320,430,150,30);
        add(textadhar);


        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setForeground(Color.white);
        l10.setBounds(100,480,180,30);
        add(l10);
        r1 =new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(189, 158, 31));
        r1.setBounds(320,490,100,30);
        add(r1);
        r2 =new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(189, 158, 31));
        r2.setBounds(430,490,100,30);
        add(r2);
        ButtonGroup buttongroup1 =new ButtonGroup();
        buttongroup1.add(r1);
        buttongroup1.add(r2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setForeground(Color.white);
        l11.setBounds(100,530,180,30);
        add(l11);
        r3 =new JRadioButton("YES");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(189, 158, 31));
        r3.setBounds(320,530,100,30);
        add(r3);
        r4 =new JRadioButton("NO");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(189, 158, 31));
        r4.setBounds(430,530,100,30);
        add(r4);
        ButtonGroup buttongroup2 =new ButtonGroup();
        buttongroup2.add(r3);
        buttongroup2.add(r4);


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
        next =new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.WHITE);
        next.setBounds(550,600,100,30);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);







        setLayout(null);
        getContentPane().setBackground(new Color(189, 158, 31));
        setSize(850,700);
        setLocation(450,80);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox1.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu= (String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String pan=textpan.getText();
        String addhar=textadhar.getText();

        String scitizen=" ";
        if (r1.isSelected()){
            scitizen="yes";
        } else if (r2.isSelected()) {
            scitizen="no";
        }

        String eaccount=" ";
        if (r1.isSelected()){
            eaccount="yes";
        } else if (r2.isSelected()) {
            eaccount="no";
        }

        try {
            if (textpan.getText().equals("") || textadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill All The Fields");
            }else {
                data_base_connect con1 =new data_base_connect();
                String in="Insert Into Signuptwo Values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eaccount+"')";
                con1.statement.executeUpdate(in);
                new signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
      new signup2("");

    }
}
