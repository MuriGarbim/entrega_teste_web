package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CrudPage;
import support.BaseSteps;

public class CrudSteps extends BaseSteps {

    private static CrudPage crud = new CrudPage(driver);


    @Given("^abrirAgapito$")
    public void abrirAgapito() {
        crud.abrirAgapito();
    }

    @When("^Inserir um novo processo$")
    public void inserir_um_novo_processo(String value) throws Throwable {
        crud.click("btn-novo");
        crud.inserir("555");
        crud.inserir("101010");
        crud.inserir("civil");
        crud.inserir("reu");
        crud.inserir("Sara");
        crud.inserir("21/05/2014");
        crud.inserir("20/09/2016");
        crud.inserir("20/10/2017");
        crud.inserir("01789465");
        crud.inserir("Observações");

    }


    @When("^Selecionar salvar$")
    public void selecionar_salvar() throws Throwable {
        crud.click("btn-save");
    }

    @Then("^As informações serão salvas com sucesso$")
    public void as_informações_serão_salvas_com_sucesso() throws Throwable {
      crud.validarMensagem();
    }

    @When("^Selecionar um processo para consulta$")
    public void selecionar_um_processo_para_consulta() throws Throwable {
        crud.click("btn-show_827");
    }

    @Then("^As informações serão apresentadas com sucesso$")
    public void as_informações_serão_apresentadas_com_sucesso() throws Throwable {
        crud.validarInformacoesConsulta();
    }

    @When("^Selecionar um processo para alteração$")
    public void selecionar_um_processo_para_alteração() throws Throwable {
    }

    @When("^Clicar em editar$")
    public void clicar_em_editar() throws Throwable {
        crud.click("btn-edit_829");
    }

    @When("^Realizar a alteracao(\\d+) desejada$")
    public void realizar_a_alteracao_desejada() throws Throwable {
        crud.realizarAlteracao();
    }

    @When("^Clicar em salvar$")
    public void clicar_em_salvar() throws Throwable {
        crud.click("btn-save");
    }

    @Then("^O processo será atualizado com sucesso$")
    public void o_processo_será_atualizado_com_sucesso() throws Throwable {
        crud.validarAtualizacao();
    }

    @When("^Selecionar um processo para exclusão$")
    public void selecionar_um_processo_para_exclusão() throws Throwable {


    }

    @When("^Clicar em apagar$")
    public void clicar_em_apagar() throws Throwable {
        crud.click("btn-delete_1053");
    }

    @When("^Confirmar a exclusão$")
    public void confirmar_a_exclusão() throws Throwable {
        crud.click("ok");

    }

    @Then("^O processo será excluído da lista$")
    public void o_processo_será_excluído_da_lista() throws Throwable {

    }

}