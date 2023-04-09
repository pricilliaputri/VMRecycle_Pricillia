package com.punyacile.vmrecycle_pricillia

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SetFilmView: ViewModel() {
    val listData = arrayListOf(
        DataFilm("Annabelle", "Date: October 3, 2014 ", R.drawable.annabelle),
        DataFilm("Evil Dead Rise", "Date: April 21, 2023", R.drawable.evildeadrise),
        DataFilm("The Conjuring 3", "Date: June 4, 2021", R.drawable.conjuring3),
        DataFilm("The Conjuring 2", "Date: June 10, 2016", R.drawable.conjuring2),
        DataFilm("The Conjuring", "Date: July 19, 2013", R.drawable.conjuring1),
        DataFilm("The Nun", "Date: September 7, 2018 ", R.drawable.thenun),
        DataFilm("Us", "Date: March 22, 2019", R.drawable.us)

    )
    val getDFilm: MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getData(){
        getDFilm.value = listData

    }
}