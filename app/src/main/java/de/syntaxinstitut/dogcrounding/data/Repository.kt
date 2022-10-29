package de.syntaxinstitut.dogcrounding.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import de.syntaxinstitut.dogcrounding.R
import de.syntaxinstitut.dogcrounding.data.remote.DogApi
import kotlinx.coroutines.delay

// API kommt in den Konstruktor weil es später angehnehmer ist zu testen
class AppRepository(private val api: DogApi) {

    private val _imageList = MutableLiveData<List<String>>()
    val imageList: LiveData<List<String>>
        get() = _imageList

    suspend fun getImages() {
        // für Testzwecke
        delay(2000)
        _imageList.value = api.retrofitService.getImages().images
    }
}
