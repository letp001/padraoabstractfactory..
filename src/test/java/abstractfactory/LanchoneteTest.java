package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanchoneteTest {

    @Test
    void deveEmitirHistoricoPedido() {
        FabricaAbstrata fabrica = new FabricaPedido();
        Lanchonete usuario = new Lanchonete(fabrica);
        assertEquals("Histórico de Pedido", usuario.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoEntrega() {
        FabricaAbstrata fabrica = new FabricaEntrega();
        Lanchonete usuario = new Lanchonete(fabrica);
        assertEquals("Histórico de Entregas", usuario.emitirHistorico());
    }

    @Test
    void deveEmitirNotaPedido() {
        FabricaAbstrata fabrica = new FabricaPedido();
        Lanchonete usuario = new Lanchonete(fabrica);
        assertEquals("Nota do Pedido", usuario.emitirNota());
    }

    @Test
    void deveEmitirNotaEntrega() {
        FabricaAbstrata fabrica = new FabricaEntrega();
        Lanchonete usuario = new Lanchonete(fabrica);
        assertEquals("Nota de Entrega", usuario.emitirNota());
    }

}