@muriel

Feature: Crud

  Background:
    Given abrirAgapito

  Scenario: Criar novo processo
    When Inserir um novo processo
    When Selecionar salvar
    Then As informações serão salvas com sucesso

  Scenario: Consultar processo
    When Selecionar um processo para consulta
    Then As informações serão apresentadas com sucesso

  Scenario Outline: Alterar processo
    When Selecionar um processo para alteração
    And Clicar em editar
    And Realizar a <alteracao> desejada
    And Clicar em salvar
    Then O processo será atualizado com sucesso

    Examples:
      |alteracao|
      |alteracao1|
      |alteracao2|

  Scenario: Excluir processo
    When Selecionar um processo para exclusão
    And Clicar em apagar
    And Confirmar a exclusão
    Then O processo será excluído da lista