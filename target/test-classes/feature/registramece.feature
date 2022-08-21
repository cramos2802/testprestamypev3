#language: es
@registramece
Característica: Yo usuario quiero registrarme con carnet de extranjeria
  Escenario: Registro en la pagina web prestamype con carnet de extranjeria
    Dado ingreso al navegador chrome
    Cuando ingreso web prestamype al registro
    Entonces ingreso "<carnetextranjeria>" y "<telefono>" y "<correo>" y "<password>" y  "<repassword>"
    Y aceptar terminos y condiciones
    * realizar click boton Registrarme
    Ejemplos:
      | carnetextranjeria | telefono  | correo                         | password    | repassword  |
      | 001258613         | 986564673 | cramos+testce01@prestamype.com | 781783cerhC | 781783cerhC |
      | 002898805         | 986564674 | cramos+testce02@prestamype.com | 781783cerhC | 781783cerhC |
      | 002682774         | 986564674 | cramos+testce03@prestamype.com | 781783cerhC | 781783cerhC |

