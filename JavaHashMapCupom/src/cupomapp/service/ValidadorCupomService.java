package cupomapp.service;

import cupomapp.model.Cupom;
import cupomapp.model.Venda;
import java.time.LocalDate;
import java.util.HashMap;

public class ValidadorCupomService {

    private HashMap<String, Cupom> cuponsAtivos;
    private HashMap<String, LocalDate> cuponsProcessados = new HashMap<>();

    public HashMap<String, Cupom> getCuponsAtivos() {
        return cuponsAtivos;
    }

    public void addCupom(Cupom cupom) {
        if (this.cuponsAtivos == null) {
            this.cuponsAtivos = new HashMap<>();
        }
        this.cuponsAtivos.put(cupom.getCodigo(), cupom);
    }

    public HashMap<String, LocalDate> getCuponsProcessados() {
        return cuponsProcessados;
    }
    public void setCuponsAtivos(HashMap<String, Cupom> cuponsAtivos) {
        this.cuponsAtivos = cuponsAtivos;
    }


    public boolean validarVenda(Venda venda) {
        System.out.println("----------------------------------------");
        System.out.printf("Validando Venda para Cliente ID: %d, Cupom: '%s'...\n", venda.getIdCliente(), venda.getCodigoCupom());

        // Se a venda não usa cupom, ela é válida por padrão.
        if (venda.getCodigoCupom() == null || venda.getCodigoCupom().isEmpty()) {
            System.out.println("Resultado: Venda sem cupom. Aprovada.");
            return true;
        }

        // 1. O cupom existe e está ativo no sistema? // return false se não existir



        // 2. O cupom não está expirado? return false se expirado


        // 3. O cliente já usou este cupom hoje? return false se já usado hoje


        // Se todas as validações passaram, o cupom é válido.
        // Registre o uso do cupom neste momento.
        //cuponsProcessados.put----
        return true;
    }
    



}