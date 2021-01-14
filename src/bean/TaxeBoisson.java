/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author mouna
 */
public class TaxeBoisson {

    private String id;
    private double annee;
    private double montant;
    private double trim;
    private String idLocale;
    private double paiement;

    public TaxeBoisson() {
    }

    public TaxeBoisson(String id, double annee, double montant, String idLocale) {
        this.id = id;
        this.annee = annee;
        this.montant = montant;
        this.idLocale = idLocale;
    }

    public double getPaiement() {
        return paiement;
    }

    public void setPaiement(double paiement) {
        this.paiement = paiement;
    }

    public TaxeBoisson(String id, double paiement) {
        this.id = id;
        this.paiement = paiement;
    }

    public TaxeBoisson(String id, double annee, double montant) {
        this.id = id;
        this.annee = annee;
        this.montant = montant;
    }

    public TaxeBoisson(String id, double annee, double montant, double trim, String idLocale) {
        this.id = id;
        this.annee = annee;
        this.montant = montant;
        this.trim = trim;
        this.idLocale = idLocale;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAnnee() {
        return annee;
    }

    public void setAnnee(double annee) {
        this.annee = annee;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getTrim() {
        return trim;
    }

    public void setTrim(double trim) {
        this.trim = trim;
    }

    public String getIdLocale() {
        return idLocale;
    }

    public void setIdLocale(String idLocale) {
        this.idLocale = idLocale;
    }

    @Override
    public String toString() {
        return "TaxeBoisson{" + "id=" + id + ", annee=" + annee + ", montant=" + montant + ", trim=" + trim + ", idLocale=" + idLocale + '}';
    }

}
