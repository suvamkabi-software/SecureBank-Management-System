package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class data_base_connect {

     Connection connection;
     Statement statement;

     public data_base_connect(){
         try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankstatus","root","Suvam@321");
             statement = connection.createStatement();
         }catch (Exception e){
             e.printStackTrace();
         }

     }
     public static void main (String[]args){
    new data_base_connect();

    }
}
