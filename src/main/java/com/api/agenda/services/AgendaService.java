package com.api.agenda.services;

import java.util.List;

import com.api.agenda.models.Contacto;

public interface AgendaService {
    boolean agregarContacto(Contacto contacto);

    List<Contacto> recuperarContactos();

    void actualizarContacto(Contacto contacto);

    // boolean eliminarContacto(int idContacto);

    Contacto buscarContacto(int idContacto);
}
