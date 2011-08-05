package cdise;

import javax.enterprise.inject.Produces;

import cdise.qualifiers.AdvancedQualifier;
import cdise.qualifiers.SimpleQualifier;

public class HelloWorldFactory {

	
	@Produces @SimpleQualifier
	public String getHelloworld(@AdvancedQualifier String qualifier){
		return qualifier+" world";
	}
}
