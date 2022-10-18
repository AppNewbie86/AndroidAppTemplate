package de.syntaxinstitut.dogcrounding.ui.three

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.databinding.FragmentDogFriendBinding
import de.syntaxinstitut.dogcrounding.databinding.FragmentTwoBinding
import de.syntaxinstitut.dogcrounding.ui.two.TwoFragmentDirections


/**
 * Fragment 3
 */
class DogFriendFragment : Fragment() {

    /* -------------------- Klassen Variablen -------------------- */

    /** Bindet das XML-View mit der Klasse um auf die Elemente zugreifen zu können */
    private lateinit var binding: FragmentDogFriendBinding

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
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogFriendBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* -------------------- UI-Interaktionen -------------------- */

        binding.menuBtn.setOnClickListener {
            viewModel.navigateToFragmentDogFriend()
        }

        /* -------------------- Observer -------------------- */

       
    }
}
