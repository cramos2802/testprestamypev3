#language: es
@login
Característica: Ingreso a la pagina de prestamype, realizo el login
  Escenario: Login a usuario inversionista, empresario
    Dado que ingreso a la pagina de prestamype
    Cuando realizo click en login "<email>" y "<pass>"
    Ejemplos:
      | email                          | pass        |  |
      | cramos+tstinv03@prestamype.com | 781783cerhC |  |
     # | cramos+testemp05@prestamype.com | 781783cerhC |  |
      #| cramos+testemp06@prestamype.com | 781783cerhC |  |