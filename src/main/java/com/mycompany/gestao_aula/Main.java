/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.gestao_aula;

/**
 *
 * @author guilh
 */
public class Main {

    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria");
        PessoaDAO dao = new PessoaDAO();
        dao.cadastrarPessoa(maria);
    }
}
