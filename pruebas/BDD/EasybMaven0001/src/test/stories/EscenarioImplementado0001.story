import com.curso.easybmaven0001.Cuenta0001;

/**
 * Un escenario que define e implementa un comportamiento
 */
scenario "Implementación del escenario depositar dinero en una cuenta", {
    given "una cuenta nueva",{
        cuenta = new Cuenta0001()
    }

    when "se hace un depósito", {
        cantidad = 100.0
        cuenta.ingresar cantidad
    }

    then "el balance debe ser igual a la cantidad ingresada", {
        cuenta.balance.shouldBe cantidad
    }
}