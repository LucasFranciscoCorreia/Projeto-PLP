package lf2.plp.imperative1.command;

import lf2.plp.expressions2.memory.IdentificadorJaDeclaradoException;
import lf2.plp.expressions2.memory.IdentificadorNaoDeclaradoException;
import lf2.plp.imperative1.declaration.Declaracao;
import lf2.plp.imperative1.memory.AmbienteCompilacaoImperativa;
import lf2.plp.imperative1.memory.AmbienteExecucaoImperativa;
import lf2.plp.imperative1.memory.EntradaVaziaException;
import lf2.plp.imperative1.memory.ErroTipoEntradaException;

public class ComandoDeclaracao implements Comando {

	private Declaracao declaracao;

	private Comando comando;

	public ComandoDeclaracao(Declaracao declaracao, Comando comando) {
		this.declaracao = declaracao;
		this.comando = comando;
	}

	/**
	 * Declara a(s) vari�vel(is) e executa o comando.
	 * 
	 * @param ambiente
	 *            o ambiente que contem o mapeamento entre identificadores e
	 *            valores.
	 * 
	 * @return o ambiente modificado pela execu��o da declara��o e do comando.
	 * @throws ErroTipoEntradaException 
	 * 
	 */
	public AmbienteExecucaoImperativa executar(
			AmbienteExecucaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException, ErroTipoEntradaException {
		ambiente.incrementa();
		ambiente = comando.executar(declaracao.elabora(ambiente));
		ambiente.restaura();
		return ambiente;
	}

	/**
	 * Verifica se o tipo do comando esta correto, levando em conta que o tipo
	 * de uma variavel � o tipo do valor da sua primeira atribuicao.
	 */
	public boolean checaTipo(AmbienteCompilacaoImperativa ambiente)
			throws IdentificadorJaDeclaradoException,
			IdentificadorNaoDeclaradoException, EntradaVaziaException {
		boolean resposta;
		ambiente.incrementa();
		resposta = declaracao.checaTipo(ambiente)
				&& comando.checaTipo(ambiente);
		ambiente.restaura();
		return resposta;
	}

}
