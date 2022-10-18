package de.syntaxinstitut.dogcrounding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        android.os.Handler().postDelayed({
            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}