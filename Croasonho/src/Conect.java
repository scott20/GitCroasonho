import java.sql.*;

public class Conect
{
    public static void main (String[] args)
    {
        Connection conecsao = null;

        try
        {
            String userName = "root";
            String password = "123456";
            String url = "jdbc:mysql://127.0.0.1/croasonho";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conecsao = DriverManager.getConnection (url, userName, password);
            System.out.println ("Conexão com o BD estabelecida!");
        }
        catch (Exception e)
        {
            System.err.println ("Não foi possível estabelecer conexão com o BD");
        }
        finally
        {
            if (conecsao != null)
            {
                try
                {
                    conecsao.close ();
                    System.out.println ("Conexão finalizada");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}