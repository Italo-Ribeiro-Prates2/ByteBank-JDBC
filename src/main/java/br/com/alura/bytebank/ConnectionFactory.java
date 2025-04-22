package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ConnectionFactory {
    // JDBC URL padrão para o MySQL
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bytebank", "root", "sua_senha");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
