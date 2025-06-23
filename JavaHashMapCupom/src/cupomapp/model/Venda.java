package cupomapp.model;
import java.time.LocalDate;

public class Venda {
    private final int idCliente;
    private final String codigoCupom;
    private final LocalDate dataVenda;
    private final double valorOriginal;

    public Venda(int idCliente, double valorOriginal, String codigoCupom, LocalDate dataVenda) {
        this.idCliente = idCliente;
        this.valorOriginal = valorOriginal;
        this.codigoCupom = codigoCupom;
        this.dataVenda = dataVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getCodigoCupom() {
        return codigoCupom;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idCliente=" + idCliente +
                ", codigoCupom='" + codigoCupom + '\'' +
                ", dataVenda=" + dataVenda +
                ", valorOriginal=" + valorOriginal +
                '}';
    }
}