/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.TaxeBoisson;
import java.util.ArrayList;
import service.TaxeBoissonService;

/**
 *
 * @author mouna
 */
public class TaxeBoissonTest {

    private TaxeBoissonService tb = new TaxeBoissonService();
    private ArrayList<TaxeBoisson> taxeboissons = new ArrayList<>();

    private void init() {
        taxeboissons.add(new TaxeBoisson("c11111", 2012, 50000, "123"));
        taxeboissons.add(new TaxeBoisson("c21111", 2014, 60000, "1234"));
        taxeboissons.add(new TaxeBoisson("c31111", 2015, 60000, "12345"));
        taxeboissons.add(new TaxeBoisson("c41111", 2014, 40000, "123456"));

    }

    public void findByIdTest() {
        String id = "c11111";
        TaxeBoisson b = tb.findById(id, taxeboissons);

        System.out.println(b.toString());

    }

    public void findByAnneeTest() {
        double annee = 2014;
        TaxeBoisson b = tb.findByAnnee(annee, taxeboissons);
        System.out.println(b.toString());

    }

    public void findByIdLocaleTest() {
        String idLocale = "c21111";
        TaxeBoisson b = tb.findByIdLocale(idLocale, taxeboissons);
        System.out.println(b.toString());

    }

    public void payerTest() {
        String id = "c11111";
        double paiement = 50000;
        int res = tb.payer(id, paiement, taxeboissons);
        System.out.println("apres paiement :" + tb.findById(id, taxeboissons));
    }

    public static void main(String[] args) {
        TaxeBoissonTest tbt = new TaxeBoissonTest();
        tbt.init();
        tbt.findByAnneeTest();
        tbt.findByIdLocaleTest();
        tbt.findByIdTest();
        tbt.payerTest();
    }

}
