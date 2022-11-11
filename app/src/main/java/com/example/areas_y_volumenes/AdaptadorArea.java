package com.example.areas_y_volumenes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorArea extends RecyclerView.Adapter<AdaptadorArea.ViewHolder> {
    private List<ListaElementosAreas> nData;
    private LayoutInflater nInflater;
    private Context context;
    final AdaptadorArea.OnItemClickListener listener;

    public interface OnItemClickListener{
        void OnItemClick(ListaElementosAreas item);
    }

    public AdaptadorArea(List<ListaElementosAreas> itemList, Context context, AdaptadorArea.OnItemClickListener listener){
        this.nInflater = LayoutInflater.from(context);
        this.context = context;
        this.nData = itemList;
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return nData.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = nInflater.inflate(R.layout.activity_areas, null);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.binData(nData.get(position));
    }

    public void  setItems (List<ListaElementosAreas>items){
        nData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView titulo;
        CardView cv;
        TextView formulaA;

        ViewHolder(View itemView){
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            img = itemView.findViewById((R.id.imgAreas));
            titulo = itemView.findViewById(R.id.tituloCardAreas);
            formulaA = itemView.findViewById(R.id.formulaArea);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (getPosition()){
                        case 0:
                            Intent circulo = new Intent(context, Circulo.class);
                            context.startActivity(circulo);
                            break;
                        case 1:
                            Intent rombo = new Intent(context, Rombo.class);
                            context.startActivity(rombo);
                            break;
                        case 2:
                            Intent triangulo = new Intent(context, Triangulo.class);
                            context.startActivity(triangulo);
                            break;
                        case 3:
                            Intent rectangulo = new Intent(context, Rectangulo.class);
                            context.startActivity(rectangulo);
                            break;
                        case 4:
                            Intent pentagono = new Intent(context, Pentagono.class);
                            context.startActivity(pentagono);
                            break;
                    }
                    //listener.OnItemClick(item);
                }
            });
        }

        void binData(final ListaElementosAreas item){
            img.setImageResource(item.getImg());
            titulo.setText(item.getTitulo());
            formulaA.setText(item.getFormulaA());

        }
    }
}

