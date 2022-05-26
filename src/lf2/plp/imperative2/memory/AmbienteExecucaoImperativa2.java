package lf2.plp.imperative2.memory;

import lf2.plp.expressions2.expression.Id;
import lf2.plp.imperative1.memory.AmbienteExecucaoImperativa;
import lf2.plp.imperative2.declaration.DefProcedimento;

public interface AmbienteExecucaoImperativa2 extends AmbienteExecucaoImperativa {

	public void mapProcedimento(Id idArg, DefProcedimento procedimentoId)
			throws ProcedimentoJaDeclaradoException;

	public DefProcedimento getProcedimento(Id idArg)
			throws ProcedimentoNaoDeclaradoException;

}
