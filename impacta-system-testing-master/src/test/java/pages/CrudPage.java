package pages;

import support.DriverQA;

public class CrudPage extends BasePage {

    public CrudPage(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void abrirAgapito() {
        driver.openURL("http://agapito-server.herokuapp.com/processos");
    }

    public void click(String botao) {
        driver.click(botao);
    }

    public void inserir(String value) {
        driver.sendKeys(value,"processo_vara", "id");
        driver.sendKeys(value,"processo_numero_processo", "id");
        driver.sendKeys(value,"processo_natureza", "id");
        driver.sendKeys(value,"processo_partes", "id");
        driver.selectByText("Não","processo_urgente", "id");
        driver.click("Sim", "processo_arbitramento_s");
        driver.sendKeys(value,"processo_assistente_social", "id");
        driver.sendKeys(value,"processo_data_entrada", "id");
        driver.sendKeys(value,"processo_data_saida", "id");
        driver.sendKeys(value,"processo_data_agendamento", "id");
        driver.sendKeys(value,"processo_status", "id");
        driver.sendKeys(value,"processo_observacao", "id");

    }

    public void validarMensagem() {
        driver.getText("ls-alert-success", "css");
    }

    public void validarInformacoesConsulta() {
        driver.getElements("container-fluid", "css");
    }

    public void realizarAlteracao() {
        driver.sendKeys("Vara Dois", "processo_vara", "id");
    }

    public void validarAtualizacao() {
        driver.getText("Processo atualizado com sucesso.", "id");
    }





}

