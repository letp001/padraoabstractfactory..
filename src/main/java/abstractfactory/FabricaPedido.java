package abstractfactory;

public class FabricaPedido implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaPedido();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoPedido();
    }
}
