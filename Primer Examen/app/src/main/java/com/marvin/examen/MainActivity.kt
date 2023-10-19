package com.marvin.examen
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var textCode: EditText
    private lateinit var textCategori: EditText
    private lateinit var numMin: EditText
    private lateinit var numtMax: EditText
    private lateinit var rdb: RadioButton
    private lateinit var btnAceptar: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        textCode = findViewById(R.id.codigo)
        textCategori = findViewById(R.id.categoria)
        numMin = findViewById(R.id.minimo)
        numtMax = findViewById(R.id.maximo)
        btnAceptar = findViewById(R.id.buttonACCEPTAR)

        btnAceptar.setOnClickListener {

            val codigo = textCode.text.toString()
            val textCategori = textCategori.text.toString()
            val numMin = numMin.text.toString()
            val numMax = numtMax.text.toString()



            if (codigo.isEmpty() || textCategori.isEmpty() || numMin.isEmpty() || numMax.isEmpty() ) {
                // Muestra un mensaje de error si alguno de los campos está vacío
                Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this, SegundaPagina::class.java)
                startActivity(intent)
            }
        }
        */
    }
    }