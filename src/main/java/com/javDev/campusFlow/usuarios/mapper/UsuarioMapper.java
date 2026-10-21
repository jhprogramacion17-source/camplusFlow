package com.javDev.campusFlow.usuarios.mapper;

import com.javDev.campusFlow.usuarios.dto.UsuarioResponse;
import com.javDev.campusFlow.usuarios.model.PreferenciasUsuario;
import com.javDev.campusFlow.usuarios.model.Usuario;

public class UsuarioMapper {

    public static UsuarioResponse toResponse(Usuario usuario) {
        PreferenciasUsuario preferencias = usuario.getPreferencias();
        if (preferencias == null) {
            preferencias = new PreferenciasUsuario();
        }
        UsuarioResponse response = new UsuarioResponse();
        response.setId(usuario.getId());
        response.setNombre(usuario.getNombre());
        response.setEmail(usuario.getEmail());
        response.setRol(usuario.getRol());
        response.setTema(preferencias.getTema());
        response.setNotificacionesActivas(preferencias.isNotificacionesActivas());
        return response;
    }
}