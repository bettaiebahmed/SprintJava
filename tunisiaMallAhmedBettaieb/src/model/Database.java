/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Lenovo
 */
public class Database {

    private ArrayList<Produit> produit;
    private ArrayList<Image> image;
    public Produit product;
    private Image pics;
    private Connection con;
    private PreparedStatement pst;
    private float somme;
    private Achat achat;

    public Database() {
        produit = new ArrayList<Produit>();
        image = new ArrayList<Image>();

    }

    public void connect() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }

    }

    public void addProduct(Achat achat) throws Exception {
        String req = "insert into achat (bought, totale,iduser,adress,ccv) values (?,?,?,?,?)";
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/tunsiamall";
            Connection con = DriverManager.getConnection(connectionUrl, "root", "");
            pst = con.prepareStatement(req);

            pst.setString(1, achat.getBought());
            pst.setFloat(2, achat.getTotale());
            pst.setString(3, achat.getIduser());
            pst.setString(4, achat.getAdress());
            pst.setString(5, achat.getCcv());

            pst.executeUpdate();
        } catch (SQLException ex) {
            throw new Exception(ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }

    }

    public float getPrix(String nom) throws SQLException, Exception {
        String req = "Select * from article where nomArticle=?";
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/tunsiamall";
            Connection con = DriverManager.getConnection(connectionUrl, "root", "");
            pst = con.prepareStatement(req);
            pst.setString(1, nom);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                somme = rs.getFloat(4);
            }

        } catch (SQLException ex) {
            throw new Exception(ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return somme;
    }

    public ArrayList<Produit> getProduit() throws Exception {
        String req = "Select * from article ";
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/tunsiamall";
            Connection con = DriverManager.getConnection(connectionUrl, "root", "");
            pst = con.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nomArticle = rs.getString(3);
                float prixAchat = rs.getFloat(4);
                float prixVenteDetail = rs.getFloat(5);
                float prixVenteGros = rs.getFloat(6);
                String typeArticle = rs.getString(7);
                String genreArticle = rs.getString(8);
                Produit product = new Produit(id, 0, nomArticle, prixAchat, prixVenteDetail, prixVenteGros, typeArticle, genreArticle);
                produit.add(product);
            }

        } catch (SQLException ex) {
            throw new Exception(ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return produit;
    }

    public ArrayList<Image> getImages() throws Exception {
        String req = "Select a.prixachat,a.NomArticle,a.TypeArticle,a.genreArticle,m.path,a.id from article a,media"
                + " m where a.image=m.id Group By a.GenreArticle ";
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/tunsiamall";
            Connection con = DriverManager.getConnection(connectionUrl, "root", "");
            pst = con.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                float prixAchat = rs.getFloat(1);
                String nomArticle = rs.getString(2);
                String TypeArticle = rs.getString(3);
                String genreArticle = rs.getString(4);
                String path = rs.getString(5);
                int id = rs.getInt(6);

                Image pics = new Image(id, path, prixAchat, nomArticle, TypeArticle, genreArticle);
                image.add(pics);

            }

        } catch (SQLException ex) {
            throw new Exception(ex);
        } finally {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return image;
    }
}
