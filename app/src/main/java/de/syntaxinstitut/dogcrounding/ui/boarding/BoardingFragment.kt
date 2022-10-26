package de.syntaxinstitut.dogcrounding.ui.boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.google.android.material.appbar.MaterialToolbar
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.adapter.DogAdapter
import de.syntaxinstitut.dogcrounding.databinding.FragmentBoardingBinding
import de.syntaxinstitut.dogcrounding.ui.three.DogFriendFragmentDirections

class BoardingFragment : Fragment() {

    private lateinit var binding: FragmentBoardingBinding
    private lateinit var materialToolbar: MaterialToolbar
    private lateinit var arrowbackimage: ImageView

    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var descriptiontext: TextView
    private lateinit var button: Button
    private lateinit var botText: TextView
    private lateinit var userText: TextView
    private lateinit var layout: CardView


    private val viewModel: MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentBoardingBinding.inflate(inflater)

        return binding.root
    }


    /**
     * Lifecycle Methode nachdem das View erstellt wurde
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dogAdapter = DogAdapter()
        binding.boardingrecyclerview.adapter = dogAdapter

        viewModel.dogImages.observe(
            viewLifecycleOwner,
            Observer {
                dogAdapter.submitList(it)
            }
        )

        /* -------------------- UI-Interaktionen -------------------- */

        //   Hier werden die Views fertig zugeordnet

        materialToolbar = binding.materialToolbar
        description = binding.dogdescription
        button = binding.boardingBtn

        binding.arrowbackimage.setOnClickListener {
            viewModel.navigateToFragmentMenu()
        }

        /* -------------------- Observer -------------------- */

        // Navigation zum zweiten Fragment
        viewModel.navigateToFragmentMenuFragment.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigateUp(
                )

                viewModel.resetAllValues3()
            }
        }


    }
}