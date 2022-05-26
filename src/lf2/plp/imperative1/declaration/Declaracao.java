package lf2.plp.imperative1.declaration;

import lf2.plp.expressions2.memory.IdentificadorJaDeclaradoException;
import lf2.plp.expressions2.memory.IdentificadorNaoDeclaradoException;
import lf2.plp.imperative1.memory.AmbienteCompilacaoImperativa;
import lf2.plp.imperative1.memory.AmbienteExecucaoImperativa;
import lf2.plp.imperative1.memory.EntradaVaziaException;

public abstract class Declaracao {

	public abstract AmbienteExecucaoImperativa elabora(
			AmbienteExecucaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException;

	public abstract boolean checaTipo(AmbienteCompilacaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException;
}
