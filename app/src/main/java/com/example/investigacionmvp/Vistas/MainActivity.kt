package com.example.investigacionmvp.Vistas

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.investigacionmvp.Interfaces.OperacionPresentador
import com.example.investigacionmvp.Interfaces.OperacionVista
import com.example.investigacionmvp.Presentador.OperacionPresentadorImplem
import com.example.investigacionmvp.R

class MainActivity : AppCompatActivity(), OperacionVista {
    private var numero1: EditText? = null
    private var numero2: EditText? = null
    private var tvResultado: TextView? = null
    private var presentador: OperacionPresentador? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById<EditText>(R.id.et_numero1)//Edit Text de Numero 1 en el formulario
        numero2 = findViewById<EditText>(R.id.et_numero2)//Edit Text de Numero 2 en el formulario
        tvResultado = findViewById<TextView>(R.id.tv_result) //Text View donde mostrarmos el resultado

        // LLamamos a la clase que se encarga de comunicar entre la vista y el Modelo(OperacionesInteractorImplem)
        presentador = OperacionPresentadorImplem(this)
    }

    //Tenemos la vista, al darle en el Onclick de sumar
    fun Suma(view: View?) {
        try {
            val num1 = numero1!!.text.toString().toInt()
            val num2 = numero2!!.text.toString().toInt()
            //manda los datos a nuestra Interafz de Operaciones Presentador, para el OperacionInteractorImple obtenerlo y realizar el proceso
            presentador?.suma(num1, num2)
        } catch (e: NumberFormatException) {
            operacionInvalida()
        }
    }

    //Tenemos la vista, al darle en el Onclick de Restar
    fun Resta(view: View?) {
        try {
            val num1 = numero1!!.text.toString().toInt()
            val num2 = numero2!!.text.toString().toInt()
            //manda los datos a nuestra Interafz de Operaciones Presentador, para el OperacionInteractorImple obtenerlo y realizar el proceso
            presentador?.resta(num1, num2)
        } catch (e: NumberFormatException) {
            operacionInvalida()
        }
    }

    //Tenemos la vista, al darle en el Onclick de Multiplicar
    fun Multiplicacion(view: View?) {
        try {
            val num1 = numero1!!.text.toString().toInt()
            val num2 = numero2!!.text.toString().toInt()
            //manda los datos a nuestra Interafz de Operaciones Presentador, para el OperacionInteractorImple obtenerlo y realizar el proceso
            presentador?.multiplicacion(num1, num2)
        } catch (e: NumberFormatException) {
            operacionInvalida()
        }
    }
    //Tenemos la vista, al darle en el Onclick de Dividision
    fun Division(view: View?) {
        try {
            val num1 = numero1!!.text.toString().toInt()
            val num2 = numero2!!.text.toString().toInt()
            //manda los datos a nuestra Interafz de Operaciones Presentador, para el OperacionInteractorImple obtenerlo y realizar el proceso
            presentador?.division(num1, num2)

            println(num1)
            println(num2)
        } catch (e: NumberFormatException) {
            operacionInvalida()
        }
    }

    //Funcion para mostrar el resultado en el TextView de tvResultado en vista
    override fun mostrarResultado(result: String?) {
        tvResultado!!.text = result
    }

    //Mostrar alerta de Operacion Invalidad en las operaciones que no es posible realizarlas
    override fun operacionInvalida() {
        Toast.makeText(this, "Operacion Invalidad", Toast.LENGTH_SHORT).show()
    }
}