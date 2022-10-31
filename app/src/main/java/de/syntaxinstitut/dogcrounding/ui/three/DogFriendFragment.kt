package de.syntaxinstitut.dogcrounding.ui.three

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.R
import de.syntaxinstitut.dogcrounding.databinding.FragmentDogFriendBinding
import kotlin.properties.Delegates


/**
 * Fragment 3
 */
class DogFriendFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentDogFriendBinding
    private lateinit var button3: Button
    private lateinit var floatButton: FloatingActionButton
    private lateinit var imageView: ImageView
    private lateinit var cardView: CardView
    private lateinit var button: Button
    private var textinputLocation by Delegates.notNull<Int>()


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
        binding = FragmentDogFriendBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.searchbuttonDogfriend.setOnClickListener {
            Uri.parse("geo:0,0?q=" + findViewById<TextView>(R.id.textinput_location).toString())
            startActivity(Intent(Intent.ACTION_VIEW))

        }


        /* -------------------- Implimzierter Intent für Google Maps -------------------- */


        binding.button3.setOnClickListener {
            var uri = Uri.parse("geo:0,0?q=" + "Munich")
            startActivity(Intent(Intent.ACTION_VIEW, uri))

        }


        binding.chatBotButton.setOnClickListener {
            findNavController().navigate(
                DogFriendFragmentDirections.actionDogFriendFragmentToChatBotFragment()
            )

        }




        /* -------------------- Bei gedrücktem Listener soll InfoText sichtbar werden -------------------- */

        binding.infoBtn.setOnClickListener {
            binding.imageView5.alpha = 1.0f
            binding.imageView6.alpha = 0.0f
            binding.imageView7.alpha = 0.0f

        }
        /* -------------------- Bei gedrücktem Listener soll FeedBackText sichtbar werden -------------------- */


        binding.feedbackBtn.setOnClickListener {
            binding.imageView5.alpha = 0.0f
            binding.imageView6.alpha = 1.0f
            binding.imageView7.alpha = 0.0f

        }

        /* -------------------- Bei gedrücktem Listener soll ServiceText sichtbar werden -------------------- */

        binding.servicesBtn.setOnClickListener {
            binding.imageView7.alpha = 1.0f
            binding.imageView5.alpha = 0.0f
            binding.imageView6.alpha = 0.0f


        }


        /* -------------------- UI-Interaktionen -------------------- */

        binding.menuBtn.setOnClickListener {
            viewModel.navigateToFragmentMenu()
        }

        /* -------------------- Observer -------------------- */

        // Navigation zum zweiten Fragment
        viewModel.navigateToFragmentMenuFragment.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigate(
                    DogFriendFragmentDirections.actionDogFriendFragmentToMenuFragment()
                )

                viewModel.resetAllValues3()
            }
        }


    }

    private fun <T> findViewById(textinputLocation: Int) {

    }
}
