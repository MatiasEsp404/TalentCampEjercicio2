package edu.curso.java.spring.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.service.abstraction.IExportador;
import edu.curso.java.spring.util.GeneradorDeDocumento;

@Configuration
@ComponentScan("edu.curso.java.spring")
public class SpringConfiguration {

	@Bean
	public Persona getPersona() {
		return new Persona("Matias", 31, "Av. Rivadavia 620");
	}
	
	// exportadorXML - exportadorCSV - exportadorTAB
	@Bean("generadorDeDocumento") 
	public GeneradorDeDocumento getGeneradorDeDocumento(
			@Qualifier("exportadorCSV") IExportador exportador) {
		return new GeneradorDeDocumento(exportador);
	}

}
