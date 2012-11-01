import java.sql.*;
public class BancoTeste { 
  
    public static void main(String args[]){
    	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1", "user", "password");


    			Statement stmt = con.createStatement();
    			ResultSet rs = stmt.executeQuery("SELECT PK.Contato FROM contato");

    			System.out.printf("Contas\n=====\n");
/*
    			while (rs.next()) {
    			int x = rs.getInt("id");
    			System.out.printf("%d\n", x);
*/
    			}
    		}
//} 