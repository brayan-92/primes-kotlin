package com.example.finalgrades

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nota1 = findViewById<EditText>(R.id.nota_1)
        val nota2 = findViewById<EditText>(R.id.nota_2)
        val nota3 = findViewById<EditText>(R.id.nota_3)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)

        btnCalcular.setOnClickListener {
            val n1 = nota1.text.toString().toDoubleOrNull()?: 0.0
            val n2 = nota2.text.toString().toDoubleOrNull()?: 0.0
            val n3 = nota3.text.toString().toDoubleOrNull()?: 0.0

            val promedio = (n1 + n2 + n3) / 3

            val mensaje = if (promedio >= 3.0) {
                "promedio:  %.2f ✅ Aprobado".format(promedio)
            } else {
                "promedio: %2.f  ❌ Reprobado".format(promedio)
            }

            txtResultado.text= mensaje
        }

        btnLimpiar.setOnClickListener {
            val n1 = nota1.text.clear()
            val n2 = nota2.text.clear()
            val n3 = nota3.text.clear()

            txtResultado.text = ""
        }

    }
}
