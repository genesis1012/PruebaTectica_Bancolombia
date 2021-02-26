
Feature: Registro de usuario
  Yo quiero registrar un usuario en la pagina https://www.utest.com/

  @tag1
  Scenario: Registro de usuario
    Given estoy en la pagina de registro
    When ingreso la informacion personal
    And ingreso la informacion de ubicacion
    Then registro exitoso
