package com.example.mariohernandeztext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class ActivityRecepcionData : AppCompatActivity() {

    private lateinit var Nombres : TextView
    private lateinit var Apellidos : TextView
    private lateinit var Email : TextView
    private lateinit var Salir : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recepcion_data)

        Nombres = findViewById(R.id.lbl_Nombre_result)
        Apellidos = findViewById(R.id.lbl_apellido_result)
        Email = findViewById(R.id.lbl_email_result)
        Salir = findViewById(R.id.btn_Salir)

        val intent = intent
        val nombres = intent.getStringExtra("nombres")
        val apellidos = intent.getStringExtra("apellidos")
        val email = intent.getStringExtra("email")

        Nombres.text = nombres
        Apellidos.text = apellidos
        Email.text = email

        Salir.setOnClickListener{
            finish()
        }

    }

    fun mensaje(titulo:String,mensaje:String){
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder
            .setMessage(mensaje)
            .setTitle(titulo)
            .setPositiveButton("Aceptar") { _, _ ->
                // Do something.
            }
        /*.setNegativeButton("Cancelar") { _, _ ->
            // Do something else.
        }*/

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}