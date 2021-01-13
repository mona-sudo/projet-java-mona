/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;
import java.util.List;

/**
 *
 * @author mouna
 */
public class CategorieService {

    public Categorie findById(String id, List<Categorie> categories) {
        for (int i = 0; i < categories.size(); i++) {
            Categorie c = categories.get(i);
            if (c.getId().equals(id));
            return c;

        }
        return (null);

    }

}
