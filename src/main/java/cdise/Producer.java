package cdise;

import javax.enterprise.inject.Produces;

import cdise.qualifiers.AdvancedQualifier;

public class Producer {

	@Produces @AdvancedQualifier
	public String getStringAdvancedGenerator(){
		return "String advanced generator";
	}
}
