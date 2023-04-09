package com.punyacile.vmrecycle_pricillia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.punyacile.vmrecycle_pricillia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var setFmVm : SetFilmView
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initLayout()
        setFmVm = ViewModelProvider(this).get(SetFilmView::class.java)
        setFmVm.getData()
        setFmVm.getDFilm.observe(this, Observer {
            filmAdapter.setListDataFilm(it as ArrayList<DataFilm>)

        })
    }

    fun initLayout(){
        filmAdapter = FilmAdapter(ArrayList())
        binding.recylerContainer.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        binding.recylerContainer.adapter = filmAdapter

    }
}