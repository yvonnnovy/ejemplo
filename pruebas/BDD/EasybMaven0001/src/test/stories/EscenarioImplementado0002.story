import com.curso.easybmaven0001.Cuenta0002;

/**
 * Un escenario que define e implementa un comportamiento
 */
scenario "depositar dinero en una cuenta con fondos", {
    given "una cuenta con fondos",{
        cuenta = new Cuenta0002()
        cantidadInicial = 100.0
        cuenta.ingresar cantidadInicial
    }

    when "se hace un depósito", {
        cantidad = 100.0
        cuenta.ingresar cantidad
    }

    then "el balance debe ser igual a la cantidad ingresada más los fondos existentes", {
        cuenta.balance.shouldBe cantidad + cantidadInicial
    }
}