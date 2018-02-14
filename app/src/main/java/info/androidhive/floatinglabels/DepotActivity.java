package info.androidhive.floatinglabels;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DepotActivity extends AppCompatActivity {
    private Button mbtn_deposer;
    private TextView montantDeposer;
    private List<Compte> listeCompte = new ArrayList<>();
    private RecyclerView recyclerView;
    private CompteAdapter mAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depot);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new CompteAdapter(listeCompte);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareCompteData();

        //initialise button deposer
        mbtn_deposer = (Button) findViewById(R.id.btn_deposer);
        mbtn_deposer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                alertCustomizedLayout();
            }
        });


    }
    private void prepareCompteData()
    {
        Compte compte = new Compte(5000,"08/02/2018",001,1000,"versement");
        listeCompte.add(compte);
        compte = new Compte(15000,"09/02/2018",002,11000,"versement");
        listeCompte.add(compte);
        mAdapter.notifyDataSetChanged();
    }

    public void alertCustomizedLayout()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(DepotActivity.this);

        LayoutInflater inflater = DepotActivity.this.getLayoutInflater();
        final EditText input = new EditText(this);

        builder.setView(inflater.inflate(R.layout.dialog_form, null))
                .setIcon(R.drawable.logo_volkeno)
                .setTitle("Déposer")
                .setView(input)
                .setPositiveButton("VALIDER", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String value = input.getText().toString();
                        Toast.makeText(DepotActivity.this, "Merci de cliquer "+value , Toast.LENGTH_LONG).show();

                    }
                }).show();

    }





    }

