package info.androidhive.floatinglabels;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 08/02/2018.
 */

public class CompteAdapter extends RecyclerView.Adapter<CompteAdapter.MyViewHolder>
{
    private List<Compte>listCompte;

    public CompteAdapter(List<Compte> listCompte) {
        this.listCompte = listCompte;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.depotcompte_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Compte cp = listCompte.get(position);
        holder.dateDepot.setText((CharSequence) cp.getMateCreation());
        holder.typeTransaction.setText(cp.getAction());
       holder.montant.setText(cp.get_montant());

    }

    @Override
    public int getItemCount() {
        return listCompte.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView dateDepot, typeTransaction, montant;

        public MyViewHolder(View view){
            super(view);
            dateDepot = (TextView) view.findViewById(R.id.dateDepotTextView);
            typeTransaction = (TextView) view.findViewById(R.id.actionLayout);
            //montant = (TextView) view.findViewById(R.id.montantTxView);

        }

    }
}
