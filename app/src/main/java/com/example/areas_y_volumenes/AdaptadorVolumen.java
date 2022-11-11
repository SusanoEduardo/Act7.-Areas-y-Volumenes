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

public class AdaptadorVolumen extends RecyclerView.Adapter<AdaptadorVolumen.ViewHolder> {

    private List<ListaElementosVolumenes> nData;
    private LayoutInflater nInflater;
    private Context context;
    final AdaptadorVolumen.OnItemClickListener listener;


    public interface OnItemClickListener{
        void OnItemClick(ListaElementosVolumenes item);
    }

    public AdaptadorVolumen(List<ListaElementosVolumenes> itemList, Context context, AdaptadorVolumen.OnItemClickListener listener){
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
        View view = nInflater.inflate(R.layout.activity_volumenes, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.binData(nData.get(position));
    }

    public void  setItems (List<ListaElementosVolumenes>items){
        nData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView titulo;
        CardView cv;
        TextView formulaV;

        ViewHolder(View itemView){
            super(itemView);
            cv = itemView.findViewById(R.id.cvA);
            img = itemView.findViewById((R.id.imgVolumenes));
            titulo = itemView.findViewById(R.id.tituloCardVolumenes);
            formulaV = itemView.findViewById(R.id.formulaVolumen);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (getPosition()){
                        case 0:
                            Intent cubo = new Intent(context, Cubo.class);
                            context.startActivity(cubo);
                            break;
                        case 1:
                            Intent cilindro = new Intent(context, Cilindro.class);
                            context.startActivity(cilindro);
                            break;
                        case 2:
                            Intent esfera = new Intent(context, Esfera.class);
                            context.startActivity(esfera);
                            break;
                        case 3:
                            Intent piramide = new Intent(context, Piramide.class);
                            context.startActivity(piramide);
                            break;
                        case 4:
                            Intent prisma = new Intent(context, Prisma.class);
                            context.startActivity(prisma);
                            break;

                    }
                    //listener.OnItemClick(item);
                }
            });
        }

        void binData(final ListaElementosVolumenes item){
            img.setImageResource(item.getImgv());
            titulo.setText(item.getTituloV());
            formulaV.setText(item.getFormulaV());

        }
    }


}
