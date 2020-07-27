package C_Clases;

import java.sql.*;
import javax.swing.*;

public class Conectar {
    Connection conect = null;
    
    public Connection conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/bd_intergoodil;","root","");
	}
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error de conexion"+e);
	}
        return conect;
    }
}