import java.sql.*;
public class BancoTeste { 
  
    public static void main(String args[]) {
        System.out.println("Testando acesso a banco de dado MySQL\n\n");
        Connection conn = null;
        String teste = "SELECT codigo,nome FROM Loja testeJava;";
  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection( "jdbc:mysql://localhost/test?user=root" );
            System.out.println("A conexão foi um sucesso\n");  
            Statement stm = conn.createStatement();  
            ResultSet rs = stm.executeQuery(teste);
            while (rs.next()) {
                String nome = rs.getString("nome");
                int codigo = rs.getInt("codigo");
//              String sobrenome = rs.getString("sobrenome");
                System.out.println("Codigo: " + codigo + "\nNome: " +nome ); // + "Sobrenome: " + sobrenome);
                System.out.println("---------------------------------------");
            }
            System.out.println("\n\nConsulta realizada com sucesso!!!\n"); 
        } catch(ClassNotFoundException e) {
            System.out.println("excessão Classe não encontrada");
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println("SQL Exception... Erro na consulta:");
            e.printStackTrace();
        } finally {
            try {
                conn.close();
                System.out.println("\n\nFechamendo a conexão");
            } catch(SQLException erro) {
                System.out.println("Erro no fechamento");
                erro.printStackTrace();
            }
        }
    }
} 