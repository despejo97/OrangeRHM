#author: David Espejo

  Feature: Registro de vacante
    Scenario: Registro exitoso de una vacate
      Given "David" Ingresa a la URL
      And Diligencia sus datos de ingreso "usuario", "contraseña"
      When Le dé clic en la opción de registro
      Then Debe de aparecer el formulario de registro y realiza el registro de una vacante con los datos "nombre", "segundo nombre", "apellido", "correo", "teléfono", "nota", "mensaje adicional"