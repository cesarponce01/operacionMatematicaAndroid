package com.example.operacionMatematicaAndroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.holamundo.R

class MainActivity : AppCompatActivity() {

    //Para inicializar o ponerle lateinit
    lateinit var tvEtiqueta:TextView
    lateinit var etNombre :EditText
    var nombre=""

    //Ejercicio poner dos valores
    //Y cuando le da dos botones la suma de los dos valores
//Tarea


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* tvEtiqueta=findViewById(R.id.tvEtiqueta) as TextView

        etNombre =findViewById<EditText>(R.id.etNombre)
*/
    }

    //Onxxxxx los elementos que empiezan con on reaccionan en un elemento.
/*
    fun onCambiarTexto(view: View) {

        nombre=etNombre.text.toString()
        //Cambiamos el contenido del texto
        tvEtiqueta.text="Hola "+nombre


    }*/



    @SuppressLint("WrongViewCast")
    fun onOperacion(vie:View){

        var etNumero1: EditText=findViewById(R.id.etDecimal1)
        var etNumero2: EditText=findViewById(R.id.etDecimal2)

        var numero1: Int =Integer.parseInt(etNumero1.text.toString())
        var numero2: Int =Integer.parseInt(etNumero2.text.toString())



        var resultado=numero1+numero2

        var tvResultado:TextView=findViewById(R.id.tvResultado)

        tvResultado.text=resultado.toString()


    }


}