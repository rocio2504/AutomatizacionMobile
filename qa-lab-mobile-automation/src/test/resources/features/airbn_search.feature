Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que me enuentro en el login de Airbnb
    When busco "Cancun Mexico"
    Then muestra el texto "Over 1,000 stays"


Feature: Búsqueda de hoteles en la App móvil de Airbnb
  @test1
  Scenario: Realizar una búsqueda de hoteles en Vichayito
    Given que ingreso a la app Airbnb y cierro cualquier ventana emergente
    When ingreso "Hoteles en Vichayito" en el formulario: Where To?
    And selecciono SKIP en el formulario :When's your trip?
    And hago clic en el botón Search
    Then la pantalla muestra resultados mayores a 1
    And se muestra el mensaje "Over 1,000 stays"