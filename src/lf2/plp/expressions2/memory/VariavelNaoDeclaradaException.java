package lf2.plp.expressions2.memory;

import lf2.plp.expressions2.expression.Id;

public class VariavelNaoDeclaradaException extends IdentificadorNaoDeclaradoException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VariavelNaoDeclaradaException(Id id){
		super("Variavel " + id + " nao declarada.");
	}
}
