package com.example.investigacionmvp.Presentador

import com.example.investigacionmvp.Interactor.OperacionInteractorImplem
import com.example.investigacionmvp.Interfaces.OperacionInteractor
import com.example.investigacionmvp.Interfaces.OperacionPresentador
import com.example.investigacionmvp.Interfaces.OperacionVista

class OperacionPresentadorImplem(view: OperacionVista?) : OperacionPresentador {
    private val vista: OperacionVista?
    private val interactor: OperacionInteractor?

    init {
        this.vista = view
        interactor = OperacionInteractorImplem(this)
    }

    override fun mostrarResultado(result: String?) {
        if (vista != null) {
            vista.mostrarResultado(result)
        }
    }

    override fun operacionInvalida() {
        if (vista != null) {
            vista.operacionInvalida()
        }
    }

    override fun suma(num1: Int, num2: Int) {
        if (interactor != null) {
            interactor.suma(num1, num2)
        }
    }

    override fun resta(num1: Int, num2: Int) {
        if (interactor != null) {
            interactor.resta(num1, num2)
        }
    }

    override fun multiplicacion(num1: Int, num2: Int) {
        if (interactor != null) {
            interactor.multiplicacion(num1, num2)
        }
    }

    override fun division(num1: Int, num2: Int) {
        if (interactor != null) {
            interactor.division(num1, num2)
        }
    }
}