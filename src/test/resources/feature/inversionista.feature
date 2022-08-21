#language: es
@inversionista
Característica: Ingreso como inversonista
  Escenario: Invertir como inversionista las subastas disponibles
    Dado  ingreso al navegador e ingresar a la web prestamype
    Cuando  que realizo login ingreso "<correos>" y "<contra>" como inversionista
    Entonces ingreso a la seccion de inversionista a invertir
    Y me solicitan completar mis datos de perfil de inversionista ingreso ocupacion "<ocupation>" y "<direc>"

    Ejemplos:
      | correos                        | contra      | ocupation | direc        |  |  |
      | cramos+tstinv07@prestamype.com | 781783cerhC | analista  | av larco 656 |  |  |
#    Ejemplos:
#      | ocupation | direc        |
#      | analista  | av larco 656|
