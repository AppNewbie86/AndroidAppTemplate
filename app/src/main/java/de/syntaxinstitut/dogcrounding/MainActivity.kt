package de.syntaxinstitut.dogcrounding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import de.syntaxinstitut.dogcrounding.databinding.ActivityMainBinding

/**
 * Main Activity, dient als Einstiegspunkt für die App
 */
class MainActivity : AppCompatActivity() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    /* -------------------- Lifecycle -------------------- */

    /**
     * Lifecycle Methode, wird aufgerufen wenn Activity erstellt wird
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Das Binding zur XML-Datei
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportActionBar?.hide()

    }
}
