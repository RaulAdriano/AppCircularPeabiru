package ramos.adriano.raul.circularpeabiru

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val valorPassagem = 3.70


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_valor_passagem.text = "R$ " + valorPassagem+"0"

        SaS.setOnClickListener({
            var activityDestino = SaSActivity::class.java

            var intent = Intent(this,activityDestino)
            startActivity(intent)

        })
    }
}
