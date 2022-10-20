package de.syntaxinstitut.dogcrounding.ui.boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.databinding.FragmentBoardingBinding

class BoardingFragment : Fragment() {

    private lateinit var binding: FragmentBoardingBinding
    private lateinit var arrowbackbutton: ImageView
    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var descriptiontext: TextView

    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentBoardingBinding.inflate(inflater)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    /**
     * Lifecycle Methode nachdem das View erstellt wurde
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* -------------------- UI-Interaktionen -------------------- */

        //   Hier werden die Views fertig zugeordnet

        arrowbackbutton = binding.arrowbackImage
        title = binding.titleText
        description = binding.dogdescription


    }
}