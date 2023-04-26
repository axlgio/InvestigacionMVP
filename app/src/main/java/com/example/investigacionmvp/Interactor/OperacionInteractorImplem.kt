package com.example.investigacionmvp.Interactor

import com.example.investigacionmvp.Interfaces.OperacionInteractor
import com.example.investigacionmvp.Interfaces.OperacionPresentador


class OperacionInteractorImplem(operationPresenter: OperacionPresentador) : OperacionInteractor {
    private var resultado = 0
    private val presentador: OperacionPresentador

    init {
        presentador = operationPresenter
    }

    //Funcion que realiza la operacion Suma
    override fun suma(num1: Int, num2: Int) {
        resultado = num1 + num2
        presentador.mostrarResultado(Integer.toString(resultado))
    }

    //Funcion que realiza la operacion Resta
    override fun resta(num1: Int, num2: Int) {
        resultado = num1 - num2
        presentador.mostrarResultado(Integer.toString(resultado))
    }

    //Funcion que realiza la operacion Multiplicacion
    override fun multiplicacion(num1: Int, num2: Int) {
        resultado = num1 * num2
        presentador.mostrarResultado(Integer.toString(resultado))
    }

    //Funcion que realiza la operacion Division
    override fun division(num1: Int, num2: Int) {
        //La division, no puede ser identificado que el numero 1 sea mayor que numero 2 del contrario aparece la alerta Operacion Invalida
        if (num1 >= num2) {
            resultado = num1 / num2
            presentador.mostrarResultado(Integer.toString(resultado))
        } else {
            presentador.operacionInvalida()
        }
    }
}