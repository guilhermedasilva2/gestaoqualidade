/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestao_aula;

/**
 *
 * @author guilh
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    public void cadastrarPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome) VALUES (?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pessoa.getNome());
            stmt.executeUpdate();
            System.out.println("Pessoa cadastrada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar pessoa: " + e.getMessage());
        }
    }
}
