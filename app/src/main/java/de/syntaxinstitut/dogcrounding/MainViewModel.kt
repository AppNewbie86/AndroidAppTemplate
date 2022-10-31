package de.syntaxinstitut.dogcrounding

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.syntaxinstitut.dogcrounding.data.AppRepository
import de.syntaxinstitut.dogcrounding.data.remote.DogApi
import kotlinx.coroutines.launch

const val TAG = "MainViewModel"

enum class ApiStatus { LOADING, ERROR, DONE }

class MainViewModel : ViewModel() {


    private val repository = AppRepository(DogApi)

    private val _loading = MutableLiveData<ApiStatus>()
    val loading: LiveData<ApiStatus>
        get() = _loading

    val dogImages: LiveData<List<String>> = repository.imageList

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _loading.value = ApiStatus.LOADING
            try {
                repository.getImages()

                // landet nur hier wenns funktioniert
                _loading.value = ApiStatus.DONE

            } catch (e: Exception) {
                // Exeption mit Infotext
                Log.e(TAG, "Error loading Data from API: $e")
                _loading.value = ApiStatus.ERROR
            }
        }
    }


    private val _chat = MutableLiveData<MutableList<String>>()
    val chat: LiveData<MutableList<String>>
        get() = _chat




    fun sendMessage(text : String) {
        _chat.value?.add(0,text)

        /***
         *  dient nur dazu den Observer zu benachrichtigen
         *  hier nimmt der Observer die Ändferung wahr und zeigt sie an
         */
        _chat.value = chat.value
    }

    /* -------------------- Klassen Variablen -------------------- */

    /** Signal um zu signalisieren, dass zum zweiten Fragment gewechselt werden soll */
    var navigateToFragmentTwo = MutableLiveData(false)
    var navigateToFragmentChatBotFragment = MutableLiveData(false)
    var navigateToFragmentBoardingFragment = MutableLiveData(false)
    var navigateToFragmentDayCareFragment = MutableLiveData(false)

    /* -------------------- Öffentliche Funktionen -------------------- */

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum zweiten Fragment zu wechseln
     */
    fun navigateToFragmentTwo() {
        navigateToFragmentTwo.value = true
    }

    /**
     * Setzt alle Werte der Variablen auf ihren "Werkszustand" zurück
     */
    fun resetAllValues() {
        navigateToFragmentTwo.value = false
    }
    var navigateToFragmentDogFriendFragment = MutableLiveData(false)

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum dritten Fragment zu wechseln
     */
    fun navigateToFragmentDogFriend() {
        navigateToFragmentDogFriendFragment.value = true

    }

    fun resetAllValues3() {
        navigateToFragmentDogFriendFragment.value = false
    }
    var navigateToFragmentMenuFragment = MutableLiveData(false)

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum dritten Fragment zu wechseln
     */
    fun navigateToFragmentMenu() {
        navigateToFragmentMenuFragment.value = true

    }





}
