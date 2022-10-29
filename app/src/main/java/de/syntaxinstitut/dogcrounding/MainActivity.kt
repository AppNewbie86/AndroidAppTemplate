package de.syntaxinstitut.dogcrounding

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.syntaxinstitut.dogcrounding.adapter.MessageAdapter
import de.syntaxinstitut.dogcrounding.data.Message
import de.syntaxinstitut.dogcrounding.databinding.ActivityMainBinding
import de.syntaxinstitut.dogcrounding.utils.BotResponse
import de.syntaxinstitut.dogcrounding.utils.Constants.OPEN_GOOGLE
import de.syntaxinstitut.dogcrounding.utils.Constants.OPEN_SEARCH
import de.syntaxinstitut.dogcrounding.utils.Constants.RECEIVE_ID
import de.syntaxinstitut.dogcrounding.utils.Constants.SEND_ID
import de.syntaxinstitut.dogcrounding.utils.Time
import kotlinx.coroutines.*

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



}}

