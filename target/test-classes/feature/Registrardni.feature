#language: es
@registrardni
Característica: Yo usuario quiero registrarme con carnet de extranjeria o dni
 Escenario: Registro en la pagina web prestamype con carnet de extranjeria o dni
   Dado ingreso al navegador
   Cuando ingreso web prestamype en la seccion registro
   Entonces ingresar "<documentnacional>" y "<fono>" y "<mail>" y "<contra>" y  "<recontra>"
    Y acepto terminos condiciones
     * realizar click boton registrarme
#    * recepcion de correo registrado
#    * ingreso a la seccion de inversionista
#    * solicitan completar mis datos de perfil de inversionista
    Ejemplos:
      | documentnacional | fono | mail | contra | recontra |
  #//  | 43545655         | 986564673 | cramos+tstinv05@prestamype.com | 781783cerhC | 781783cerhC |
  #     | 41325643         | 986564673 | cramos+tstinv06@prestamype.com | 781783cerhC | 781783cerhC |
      #| 45505655         | 986564673 | cramos+tstinv07@prestamype.com | 781783cerhC | 781783cerhC |
     # | 45305655         | 986564673 | cramos+tstemp07@prestamype.com | 781783cerhC | 781783cerhC |
    # | 42305655         | 986564673 | cramos+tstemp08@prestamype.com | 781783cerhC | 781783cerhC |
      | 41325655         | 986564673 | cramos+tstemp09@prestamype.com | 781783cerhC | 781783cerhC |
