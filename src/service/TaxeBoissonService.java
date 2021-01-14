/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TaxeBoisson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mouna
 */
public class TaxeBoissonService {

    public TaxeBoisson findById(String id, List<TaxeBoisson> taxeboissons) {
        for (int i = 0; i < taxeboissons.size(); i++) {
            TaxeBoisson tb = taxeboissons.get(i);
            if (tb.getId().equals(id)) {
                return tb;
            }
        }
        return null;

    }

    public ArrayList<TaxeBoisson> findByAnnee(double annee, List<TaxeBoisson> taxeboissons) {
        ArrayList<TaxeBoisson> resultat = new ArrayList<>();

        for (int i = 0; i < taxeboissons.size(); i++) {
            TaxeBoisson tb = taxeboissons.get(i);
            if (tb.getAnnee() == (annee)) {
                resultat.add(tb);
            }
        }
        return resultat;

    }

    public TaxeBoisson findByIdLocale(String idLocal, List<TaxeBoisson> taxeboissons) {
        for (int i = 0; i < taxeboissons.size(); i++) {
            TaxeBoisson tb = taxeboissons.get(i);
            if (tb.getIdLocale().equals(idLocal)) {
                return tb;
            }
        }
        return null;

    }

    public TaxeBoisson findByTrimAnnee(double trim, double annee, List<TaxeBoisson> taxeboissons) {
        for (int i = 0; i < taxeboissons.size(); i++) {
            TaxeBoisson tb = taxeboissons.get(i);

            if ((tb.getAnnee() == (annee)) || (tb.getTrim() == (trim)));
            return tb;
        }
        return null;

    }

    public int payer(String id, double paiement, ArrayList<TaxeBoisson> taxeboissons) {
        TaxeBoisson tb = findById(id, taxeboissons);
        if (tb == null) {
            return -1;
        } else if (tb.getMontant() != paiement) {
            return -2;
        } else if (tb.getMontant() == paiement) {
            tb.setMontant(tb.getMontant() - paiement);

        }
        return 1;

    }

    public int save(TaxeBoisson taxeBoisson, ArrayList<TaxeBoisson> taxeboissons) {
        TaxeBoisson tb = findById(taxeBoisson.getId(), taxeboissons);
        if (tb == null) {
            taxeboissons.add(tb);
            return 1;
        } else {

            return -1;
        }

    }

    public int findIndexById(String id, List<TaxeBoisson> taxeboissons) {
        for (int i = 0; i < taxeboissons.size(); i++) {
            TaxeBoisson tb = taxeboissons.get(i);
            if (tb.getId().equals(id)) {
                return i;
            }
        }
        return -1;

    }

    public int remove(String id, ArrayList<TaxeBoisson> taxeboissons) {
        int index = findIndexById(id, taxeboissons);
        if (index != -1) {
            taxeboissons.remove(index);
            return 1;
        } else {
            return -1;
        }

    }

}
