
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertRecords {
public static void main(String args[])
{
try
{
  Connection con = null;
  Driver d = new com.mysql.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");

  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Mulesoft","geethika","root");
  
  Statement smt1 = con.createStatement();
  Statement smt2 = con.createStatement();
  Statement smt3 = con.createStatement();
  String sql1 = "insert into Movies values('Nineteen Eighty-Four','John Hurt','2.8billion','Michael Radford',1985)";
  String sql2 = "insert into Movies values('The Queen',' Helen Mirren','1.5billion','Stephen Frears',2006)";
  String sql3 = "insert into Movies values('Band of Brothers','Damian Lewis','1.6billion','David Frankel',2017)";
    smt1.executeUpdate(sql1);
    smt2.executeUpdate(sql2);
    smt3.executeUpdate(sql3);
    System.out.println("Records Inserted successfully...");
  con.close();

}
catch(Exception e)
{
	System.out.println(e);
}
}
}