package lf2.plp.expressions2.expression;

import lf2.plp.expressions1.util.Tipo;
import lf2.plp.expressions2.memory.AmbienteCompilacao;
import lf2.plp.expressions2.memory.AmbienteExecucao;
import lf2.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf2.plp.expressions2.memory.VariavelNaoDeclaradaException;

public class ExpProb<T extends ValorConcreto> extends ExpBinaria{

    private Expressao prob;

    public ExpProb(Expressao esq, Expressao dir, Expressao prob){
        super(esq, dir, "prob");
        this.prob = prob;
    }

    @Override
    protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return getEsq().getTipo(amb).eIgual(getDir().getTipo(amb));
    }

    @Override
    public Valor avaliar(AmbienteExecucao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        if (prob.avaliar(amb) instanceof ValorInteiro) {
            return Math.random() * 100 < ((ValorInteiro) this.prob.avaliar(amb)).valor() ? getEsq().avaliar(amb) : getDir().avaliar(amb);
        } else {
            return Math.random() * 100 < ((ValorDecimal) this.prob.avaliar(amb)).valor() ? getEsq().avaliar(amb) : getDir().avaliar(amb);
        }
    }

    @Override
    public Tipo getTipo(AmbienteCompilacao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return getEsq().getTipo(amb);
    }

    @Override
    public ExpBinaria clone() {
        return new ExpProb<T>(esq.clone(), dir.clone(), prob);
    }
}
