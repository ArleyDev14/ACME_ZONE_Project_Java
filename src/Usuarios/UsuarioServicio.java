package Usuarios;

import Usuarios.UsuarioDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kmayo
 */
public class UsuarioServicio {
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    public boolean autenticarUsuario(String id_usuario, String contraseña) {
         return usuarioDAO.validarCredenciales(id_usuario, contraseña);
    }
}
