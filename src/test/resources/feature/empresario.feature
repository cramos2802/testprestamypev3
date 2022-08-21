#language: es
  @empresario
Característica: Ingreso como empresario
  Escenario: Ingreso a la web como empresario
    Dado realizar click en login "<corr>" y "<contr>"
    Cuando ingreso a la seccion de factoring a vender facturas
    Entonces me solicitan completar mis datos de perfil

    Ejemplos:
      | corr                           | contr       |
     # | cramos+tstemp07@prestamype.com | 781783cerhC |
      | cramos+tstemp08@prestamype.com | 781783cerhC |
     # |