package com.green_station_20.problem3.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.green_station_20.problem3.Activities.DetailsActivity;
import com.green_station_20.problem3.Model.Medicine;
import com.green_station_20.problem3.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Medicine> medicines;

    public RecyclerViewAdapter(Context context, List list) {

        this.context = context;
        this.medicines = list;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.medicine_list_item, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(view);


        viewHolder.medicineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("indications", medicines.get(viewHolder.getAdapterPosition()).getIndications());
                intent.putExtra("therapeutic_class", medicines.get(viewHolder.getAdapterPosition()).getTherapeutic_class());
                intent.putExtra("pharmacology", medicines.get(viewHolder.getAdapterPosition()).getPharmacology());
                intent.putExtra("dosage", medicines.get(viewHolder.getAdapterPosition()).getDosage());
                intent.putExtra("interaction", medicines.get(viewHolder.getAdapterPosition()).getInteraction());
                intent.putExtra("contraindications", medicines.get(viewHolder.getAdapterPosition()).getContraindications());
                intent.putExtra("side_effects", medicines.get(viewHolder.getAdapterPosition()).getSide_effects());
                intent.putExtra("pregnancy", medicines.get(viewHolder.getAdapterPosition()).getPregnancy());
                intent.putExtra("precautions", medicines.get(viewHolder.getAdapterPosition()).getPrecautions());
                intent.putExtra("storage", medicines.get(viewHolder.getAdapterPosition()).getStorage());


                context.startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.medicineName.setText(medicines.get(position).getDrugs());
    }

    @Override
    public int getItemCount() {
        return medicines.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView medicineName;

        TextView indications, therapeutic_class, pharmacology, dosage, interaction,
                contraindications, side_effects, pregnancy, precautions, storage;

        LinearLayout medicineView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            medicineName = itemView.findViewById(R.id.medicineNameId);


            indications = itemView.findViewById(R.id.indicationsId);
            therapeutic_class = itemView.findViewById(R.id.therapeutic_classId);
            pharmacology = itemView.findViewById(R.id.pharmacologyId);
            dosage = itemView.findViewById(R.id.dosageId);
            interaction = itemView.findViewById(R.id.interactionId);
            contraindications = itemView.findViewById(R.id.contraindicationsId);
            side_effects = itemView.findViewById(R.id.side_effectsId);
            pregnancy = itemView.findViewById(R.id.pregnancyId);
            precautions = itemView.findViewById(R.id.precautionsId);
            storage = itemView.findViewById(R.id.storageId);

            medicineView = itemView.findViewById(R.id.medicineViewId);
        }
    }
}
