package com.elementz.gasolinaouetanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.parseDouble


class MainActivity : AppCompatActivity() {

    var pGas: Double = 0.0
    var pAlc: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_comparar.setOnClickListener {

            pAlc=parseDouble(iv_etanol.text.toString())
            pGas=parseDouble(iv_gasolina.text.toString())

                if (pAlc <= (pGas*0.7)) {
                    iv_result.setImageResource(R.drawable.abasteca_etanol)


                } else
                    iv_result.setImageResource(R.drawable.abasteca_gasolina)

            }
        }

}