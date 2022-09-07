package edu.curso.java.spring.service;

import org.springframework.stereotype.Service;

import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.service.abstraction.IExportador;

@Service("exportadorXML")
public class ExportadorXML implements IExportador {

	@Override
	public String exportar(Persona persona) {
		return generarXML(persona);
	}

	private String generarXML(Persona persona) {
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		sb.append("<Persona>\n");
		sb.append("   <nombre>" + persona.getNombre() + "</nombre>\n");
		sb.append("   <edad>" + persona.getEdad() + "</edad>\n");
		sb.append("   <direccion>" + persona.getDireccion() + "</direccion>\n");
		sb.append("</Persona>");
		return sb.toString();
	}

}
