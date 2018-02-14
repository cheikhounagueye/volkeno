package info.androidhive.floatinglabels;

import java.util.Date;

/**
 * Created by user on 17/01/2018.
 */

public class Compte
{
    private double solde;
    private String mateCreation;
    private int numero;
    private int _montant;
    private String action;



    public Compte(double solde, String mateCreation, int numero, int _montant, String action)
    {
        this.solde = solde;
        this.mateCreation = mateCreation;
        this.numero = numero;
        this._montant = _montant;
        this.action = action;
    }

    public int get_montant() {
        return _montant;
    }

    public void set_montant(int _montant) {
        this._montant = _montant;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getMateCreation() {
        return mateCreation;
    }

    public void setMateCreation(String mateCreation) {
        this.mateCreation = mateCreation;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void deposer(double mtn){}

    public void retirer(double mtn){}

    public void transferer(double mtn, String num){}

}
