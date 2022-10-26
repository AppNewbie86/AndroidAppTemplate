package de.syntaxinstitut.dogcrounding.ui.four

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.databinding.FragmentMenuBinding


/**
 * Fragment 2
 */
class MenuFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentMenuBinding


    private lateinit var visitButton: Button
    private lateinit var chatBotButton: Button
    private lateinit var boardingButton: Button
    private lateinit var dayCareButton: Button
    private lateinit var dogTrainingButton: Button


    private lateinit var daycareImage: ImageView
    private lateinit var dogTrainingImage: ImageView


    /** Das ViewModel zu diesem Fragment */
    private val viewModel: MainViewModel by activityViewModels()

    /* -------------------- Lifecycle -------------------- */
    /**
     * Lifecycle Methode wenn das View erstellt wird
     *
     * @param inflater                Layout Inflater
     * @param container               View Gruppe
     * @param savedInstanceState      Eventuelle saveStates
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMenuBinding.inflate(inflater)

        return binding.root
    }

    /**
     * Lifecycle Methode nachdem das View erstellt wurde
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* -------------------- UI-Interaktionen -------------------- */

        binding.backButton.setOnClickListener()
        {
            viewModel.navigateToFragmentMenuFragment.observe(viewLifecycleOwner) {
                if (it) {
                    findNavController().navigate(
                        MenuFragmentDirections.actionMenuFragmentToDayCareFragment()
                    )

                    viewModel.resetAllValues3()
                }
            }
        }


        binding.visitBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToVisitFragment()
            )

        }

        binding.chatBotBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToChatBotFragment()
            )

        }

        binding.boardingBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToBoardingFragment()
            )

        }

        binding.dayCareBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToDayCareFragment()
            )

        }

        binding.facebookIcon.setOnClickListener {
            val url = "https://www.facebook.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        binding.instagramIcon.setOnClickListener {
            val url = "https://www.instagram.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }


    }

}














