package cdise;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import cdise.qualifiers.AdvancedQualifier;
import cdise.qualifiers.SimpleQualifier;

/**
 * Hello world!
 * 
 */
public class App {
	@Inject
	@AdvancedQualifier
	IGenerator generator;

	@Inject
	@AdvancedQualifier
	String generated;

	@Inject @SimpleQualifier
	String hello;
	
	public void launch(@Observes ContainerInitialized event) {
		System.out.println(generator.getValue());
		System.out.println(generated);
		System.out.println(hello);
	}
}
