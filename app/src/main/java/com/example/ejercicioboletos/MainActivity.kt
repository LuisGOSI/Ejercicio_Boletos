package com.example.ejercicioboletos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvPregunta : TextView
    private lateinit var numBole : EditText
    private lateinit var rgBoletos : RadioGroup
    private lateinit var rbVIP : RadioButton
    private lateinit var rbLuneta : RadioButton
    private lateinit var rbPrefe : RadioButton
    private lateinit var rbGeneral : RadioButton
    private lateinit var btnCalcular : Button
    private lateinit var tvTotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPregunta = findViewById(R.id.tvPregunta)
        numBole = findViewById(R.id.numBole)
        rgBoletos = findViewById(R.id.rgBoletos)
        rbVIP = findViewById(R.id.rbVIP)
        rbLuneta = findViewById(R.id.rbLuneta)
        rbPrefe = findViewById(R.id.rbPrefe)
        rbGeneral = findViewById(R.id.rbGeneral)
        btnCalcular = findViewById(R.id.btnCalcular)
        tvTotal = findViewById(R.id.tvTotal)

        btnCalcular.setOnClickListener {
            if (numBole.text.isEmpty()) {
                tvTotal.text = "Debes escribir un numero entero"
            }
            else if(numBole.text.toString().toInt() == 0){
                tvTotal.text = " Ingrese una cantidad de boletos a adquirir"
            }
            else{
                var boletos: Int = numBole.text.toString().toInt()

                if (rbVIP.isChecked){
                    var total = (boletos * 900)
                    tvTotal.text = "Su total es: $total"
                }else if (rbLuneta.isChecked){
                    var total = (boletos * 600)
                    tvTotal.text = "Su total es: $total"
                }else if(rbPrefe.isChecked){
                    var total = (boletos * 400)
                    tvTotal.text = "Su total es: $total"
                }else if(rbGeneral.isChecked){
                    var total = (boletos * 200)
                    tvTotal.text = "Su total es: $total"
                }else{
                    tvTotal.text = "No se selecciono zona de boleto"
                }

            }
        }

    }
}