package com.example.seman3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.MyViewHolder> {

    private List<Pelicula> peliculasList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView titulo, genero, año;

        public MyViewHolder(View view) {
            super(view);
            titulo = (TextView) view.findViewById(R.id.titulo);
            genero = (TextView) view.findViewById(R.id.genero);
            año = (TextView) view.findViewById(R.id.año);
        }
    }


    public PeliculasAdapter(List<Pelicula> peliculasList) {
        this.peliculasList = peliculasList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pelicula_fila, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pelicula pelicula = peliculasList.get(position);
        holder.titulo.setText(pelicula.getTitulo());
        holder.genero.setText(pelicula.getGenero());
        holder.año.setText(pelicula.getAño());
    }

    @Override
    public int getItemCount() {
        return peliculasList.size();
    }


}
