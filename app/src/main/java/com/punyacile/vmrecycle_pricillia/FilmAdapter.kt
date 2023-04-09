package com.punyacile.vmrecycle_pricillia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(var listFilm : ArrayList<DataFilm>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>(){

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var gambar = view.findViewById<ImageView>(R.id.imagePoster)
        var filmJudul = view.findViewById<TextView>(R.id.text_film)
        var rilisTgl = view.findViewById<TextView>(R.id.tgl_rilis)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_data_film, parent , false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data  = listFilm[position]
        holder.gambar.setImageResource(data.img)
        holder.filmJudul.text = data.judul
        holder.rilisTgl.text = data.tanggal

    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setListDataFilm(listFilm: ArrayList<DataFilm>){
        this.listFilm =listFilm
    }

}