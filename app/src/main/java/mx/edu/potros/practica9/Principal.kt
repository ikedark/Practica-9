package mx.edu.potros.practica9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var tv_nombre: TextView = findViewById(R.id.tv_nombre)
        var tv_email: TextView = findViewById(R.id.tv_email)
        var btnCerrar : Button = findViewById(R.id.cerrar)

        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tv_nombre.setText(name)
            tv_email.setText(email)
        }

        btnCerrar.setOnClickListener {
            finish()
        }


    }
}