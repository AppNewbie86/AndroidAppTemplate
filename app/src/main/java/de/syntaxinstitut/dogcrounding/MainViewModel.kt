package de.syntaxinstitut.dogcrounding

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * Das MainViewModel
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    /* -------------------- Klassen Variablen -------------------- */
	
    /** Signal um zu signalisieren, dass zum zweiten Fragment gewechselt werden soll */
    var navigateToFragmentTwo = MutableLiveData(false)
    var navigateToFragmentDogFriendFragment = MutableLiveData(false)
    var navigateToFragmentMenuFragment = MutableLiveData(false)

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

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum dritten Fragment zu wechseln
     */
    fun navigateToFragmentDogFriend() {
        navigateToFragmentDogFriendFragment.value = true

    }

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum dritten Fragment zu wechseln
     */
    fun navigateToFragmentMenu() {
        navigateToFragmentMenuFragment.value = true

    }


}
