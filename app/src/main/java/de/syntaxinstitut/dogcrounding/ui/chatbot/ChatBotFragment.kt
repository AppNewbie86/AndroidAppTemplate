import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import de.syntaxinstitut.dogcrounding.MainViewModel
import de.syntaxinstitut.dogcrounding.adapter.MessageAdapter
import de.syntaxinstitut.dogcrounding.databinding.FragmentChatBotBinding

class ChatBotFragment : Fragment() {

    /***
     * BindingMethode wird mit HomeFragment verbunden
     */

    private lateinit var binding: FragmentChatBotBinding

    /***
     * ViewModel teilt sich Activity mit ViewModels
     */

    private val viewModel: MainViewModel by activityViewModels()


    /***
     * Layout wird inflatet also aufgeblasen und zum darstellen vorbereitet
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentChatBotBinding.inflate(inflater)
        return binding.root
    }

    /***
     * wenn View erstellt wurde wird der contactadapter festgesetzt und als Konstante gesetzt
     * um nicht mehr manipulierbar zusein desweiteren wurde im nächsten Schritt der Recyclerview mit contactadapter verknüpft
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            binding.sendBtn.setOnClickListener {
                val input = binding.chatSendMessage.text.toString()
                viewModel.sendMessage(input)
                binding.chatSendMessage.setText("")
            }



        val messageAdapter = context?.let { MessageAdapter(it) }
        binding.recyclerView.adapter = messageAdapter



        viewModel.viewModelScope.coroutineContext.toString()


    }

}
