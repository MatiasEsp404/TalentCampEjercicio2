package edu.curso.java.spring.util;

import org.springframework.stereotype.Component;

import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.service.abstraction.IExportador;

@Component
public class GeneradorDeDocumento {

	private IExportador exportador;

	public GeneradorDeDocumento(IExportador exportador) {
		this.exportador = exportador;
	}

	public void exportarDatos(Persona persona) {
		System.out.println(exportador.exportar(persona));
	}

	public IExportador getExportador() {
		return this.exportador;
	}

	public void setExportador(IExportador exportador) {
		this.exportador = exportador;
	}

}
