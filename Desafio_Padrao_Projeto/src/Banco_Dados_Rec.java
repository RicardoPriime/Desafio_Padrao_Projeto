import subsitema_1.CrmService;
import subsitema_2.CepApi;

public class Banco_Dados_Rec {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
    //Facade facade = new Facade();
        //facade.migrarCliente("Venilton", "14801788");
}
