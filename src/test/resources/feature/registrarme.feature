#language: es
#@registrame
#Característica: Yo como usuario deseo registrarme en la web de prestamype
#  Escenario: Registro del usuario en la web
#    Dado ingreso al navegador e ingreso a la pagina
#    Cuando ingreso al registro de la web prestamype
#    Entonces ingreso tipo de documento dni, numero de documento, telefono, correo electronico, contraseña,confirmar contraseña
#    Y aceptar terminos y condiciones
#    * realizar click en el boton Registrame
#    * recepcion a correo registrado

##language: es
#@registrame
#Característica: Yo como usuario requiero registrarme en la web de prestamype
#  Antecedentes:
#    Dado ingreso al navegador e ingreso a la pagina de prestamype
#    Esquema del escenario: Registro del usuario en la web
#    Dado ingreso al registro de la web prestamype
#    Entonces ingreso "<numeroDocumento>" y "<phone>" y "<email>" y "<pass>" y "<repass>" y "<check>" y "<button>"
#    Y aceptar terminos y condiciones
#      Ejemplos:
#        | numeroDocumento | phone     | email                          | pass        | repass      | check | button |
#        | 49605678        | 984345561 | cramos+tstinv03@prestamype.com | 781783cerhC | 781783cerhC | true  | true   |
