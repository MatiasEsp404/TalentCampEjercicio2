package edu.curso.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.curso.java.spring.configuration.SpringConfiguration;
import edu.curso.java.spring.model.Persona;
import edu.curso.java.spring.util.GeneradorDeDocumento;

/*
 * Se solicita: Configurar la APP para que la configuración de Spring solo use annotations.
 */
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringConfiguration.class);
		context.refresh();

		Persona persona = context.getBean(Persona.class, "persona");
		GeneradorDeDocumento generadorDeDocumento = context
				.getBean(GeneradorDeDocumento.class, "generadorDeDocumento");
		
		generadorDeDocumento.exportarDatos(persona);
	}
}
