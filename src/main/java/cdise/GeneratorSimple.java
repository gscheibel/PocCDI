package cdise;

import cdise.qualifiers.SimpleQualifier;

@SimpleQualifier
public class GeneratorSimple implements IGenerator {

	public String getValue() {
		return "simple generator";
	}
}
