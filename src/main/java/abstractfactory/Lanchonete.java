package abstractfactory;

public class Lanchonete {

    private Nota nota;
    private Historico historico;

    public Lanchonete(FabricaAbstrata fabrica) {
        this.nota = fabrica.createNota();
        this.historico = fabrica.createHistorico();
    }

    public String emitirNota() {
        return this.nota.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
