package com.javDev.campusFlow.usuarios.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Embeddable
public class PreferenciasUsuario {

    @Enumerated(EnumType.STRING)
    private TemaVisual tema = TemaVisual.CLARO;

    private boolean notificacionesActivas = true;

    public TemaVisual getTema() {
        return tema;
    }

    public void setTema(TemaVisual tema) {
        this.tema = tema;
    }

    public boolean isNotificacionesActivas() {
        return notificacionesActivas;
    }

    public void setNotificacionesActivas(boolean notificacionesActivas) {
        this.notificacionesActivas = notificacionesActivas;
    }
}