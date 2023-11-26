package com.api.agenda.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.agenda.models.Contacto;
import com.api.agenda.services.AgendaService;

@CrossOrigin(origins = "*")
@RestController
public class ContactoController {
    @Autowired
    AgendaService agendaService;

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String healthCheck() {
        return "Health check";
    }

    @GetMapping(value = "contactos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contacto> recuperarContactos() {
        return agendaService.recuperarContactos();
    }

    @GetMapping(value = "contactos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Contacto buscarContacto(@PathVariable("id") int id) {
        return agendaService.buscarContacto(id);
    }

    @PostMapping(value = "contactos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String crearContacto(@RequestBody Contacto contacto) {
        return String.valueOf(agendaService.agregarContacto(contacto));
    }

    @PutMapping(value = "contactos", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarContacto(@RequestBody Contacto contacto) {
        agendaService.actualizarContacto(contacto);
    }

    // @DeleteMapping(value = "contactos/{id}", produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public void eliminarPorId(@PathVariable("id") int idContacto) {
    // agendaService.eliminarContacto(idContacto);
    // }

}
