package com.example.investigacionmvp.Interfaces

interface OperacionPresentador {

    fun mostrarResultado(result: String?)
    fun operacionInvalida()
    fun suma(num1: Int, num2: Int)
    fun resta(num1: Int, num2: Int)
    fun multiplicacion(num1: Int, num2: Int)
    fun division(num1: Int, num2: Int)
}