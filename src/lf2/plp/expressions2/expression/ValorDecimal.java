package lf2.plp.expressions2.expression;

import lf2.plp.expressions1.util.Tipo;
import lf2.plp.expressions1.util.TipoPrimitivo;
import lf2.plp.expressions2.memory.AmbienteCompilacao;
import lf2.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf2.plp.expressions2.memory.VariavelNaoDeclaradaException;

public class ValorDecimal extends ValorConcreto<Double>{


    public ValorDecimal(Double valor){ super(valor); }

    @Override
    public Tipo getTipo(AmbienteCompilacao amb) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        return TipoPrimitivo.DECIMAL;
    }

    @Override
    public ValorConcreto<Double> clone() {
        return new ValorDecimal(this.valor());
    }
}
