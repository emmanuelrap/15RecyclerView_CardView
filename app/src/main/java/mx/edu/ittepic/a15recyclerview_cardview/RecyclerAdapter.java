package mx.edu.ittepic.a15recyclerview_cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
Context context;
    private String[] albumes;
    private String[] cantantes;
    private String[] canciones;
    private String[] imagenes;


    public RecyclerAdapter(String[] albumes,String[] cantantes,String[] canciones,String[] imagenes) {
        this.albumes = albumes;
        this.cantantes=cantantes;
        this.canciones=canciones;
        this.imagenes=imagenes;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.campo1.setText(albumes[position]);
        holder.campo2.setText(cantantes[position]);
        holder.campo3.setText(canciones[position]);
        holder.campo4.getResources().getDrawable(R.drawable.disco1);

    }

    //retorna el mismo numero para los 3 TXT
    @Override
    public int getItemCount() {
        return albumes.length;
    }




    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView campo1,campo2,campo3;
        ImageView campo4;

        //C O N S T R U C T O R
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            campo1 = itemView.findViewById(R.id.album);
            campo2 = itemView.findViewById(R.id.cantante);
            campo3 = itemView.findViewById(R.id.canciones);
            campo4 = itemView.findViewById(R.id.imagen);
        }
    }

}
