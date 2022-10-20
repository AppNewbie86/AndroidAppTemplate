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
    var navigateToFragmentVisitFragment = MutableLiveData(false)
    var navigateToFragmentChatBotFragment = MutableLiveData(false)
    var navigateToFragmentBoardingFragment = MutableLiveData(false)
    var navigateToFragmentDayCareFragment = MutableLiveData(false)
    var navigateToFragmentVideoFragment = MutableLiveData(false)

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

    fun resetAllValues3() {
        navigateToFragmentDogFriendFragment.value = false
    }

    /**
     * Mit dieser Funktion wird der Trigger ausgelöst um zum dritten Fragment zu wechseln
     */
    fun navigateToFragmentMenu() {
        navigateToFragmentMenuFragment.value = true

    }

    fun navigateToFragmentVisit() {
        navigateToFragmentVisitFragment.value = true

    }

    fun navigateToFragmentChatBot() {
        navigateToFragmentChatBotFragment.value = true

    }

    fun navigateToFragmentBoarding() {
        navigateToFragmentBoardingFragment.value = true

    }

    fun navigateToFragmentDayCare() {
        navigateToFragmentDayCareFragment.value = true

    }

    fun navigateToFragmentVideo() {
        navigateToFragmentVideoFragment.value = true

    }




}
