package abstractfactory;

public class FabricaEntrega implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaEntrega();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoEntrega();
    }
}