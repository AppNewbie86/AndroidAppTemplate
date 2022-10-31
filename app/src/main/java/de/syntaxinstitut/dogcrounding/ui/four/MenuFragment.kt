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
 * MenüFragment
 */
class MenuFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um
     * auf die Elemente zugreifen zu können
     * */
    private lateinit var binding: FragmentMenuBinding


    private lateinit var visitButton: Button
    private lateinit var chatBotButton: Button
    private lateinit var boardingButton: Button
    private lateinit var dayCareButton: Button
    private lateinit var dogTrainingButton: Button
    private lateinit var backButton: Button


    private lateinit var daycareImage: ImageView
    private lateinit var dogTrainingImage: ImageView


    /** Das ViewModel zu diesem Fragment */
    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentMenuBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* -------------------- Interaktion auf letztes Fragment -------------------- */

        binding.backButton.setOnClickListener()
        {

            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToDogFriendFragment()
            )
        }



        /* -------------------- UI-Interaktionen -------------------- */



        //navigation auf VisitFragment


        binding.visitBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToVisitFragment()
            )

        }


        binding.videoBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToVideoFragment()
            )

        }








        //navigation auf ChatBotFragment


        binding.chatBotBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToChatBotFragment()
            )

        }

        //navigation auf BoardingFragment


        binding.boardingBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToBoardingFragment()
            )

        }

        //navigation auf DayCareFragment

        binding.dayCareBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToDayCareFragment()
            )

        }


        binding.AppSettingsBtn.setOnClickListener()
        {
            findNavController().navigate(
                MenuFragmentDirections.actionMenuFragmentToAppSettingsFragment()
            )

        }

        //Indent auf FaceBook

        binding.facebookIcon.setOnClickListener {
            val url = "https://www.facebook.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }

        //Indent auf Instagram


        binding.instagramIcon.setOnClickListener {
            val url = "https://www.instagram.com/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }


        //Indent auf Telegram


        binding.telegramBtn.setOnClickListener {
            val url = "https://www.telegram.org/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }



    }

}

















