package edu.curso.java.spring.service;

import org.springframework.stereotype.Service;

import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.service.abstraction.IExportador;

@Service("exportadorCSV")
public class ExportadorCSV implements IExportador {

	@Override
	public String exportar(Persona persona) {
		return persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();
	}

}