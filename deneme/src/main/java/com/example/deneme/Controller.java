package com.example.deneme;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import static java.lang.String.valueOf;


public class Controller implements Initializable {

    @FXML
    ImageView yellow,grey,sil,petek;
    @FXML
    private Label kelime,uzun;
    @FXML
    private TextField out;
    @FXML
    private Button A_tus,clean,yazdir,degisim,K_tus,L_tus,I_tus,M_tus,S_tus,E_tus,first;
    private double x,y;

    @FXML
    private ImageView petek1,but,but2,p;

    @FXML
    private TableColumn<User, Integer> puan;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<User, String> kelimeler;

    ObservableList<User> list =FXCollections.observableArrayList();
    @FXML
    public void display() {
        String set = A_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    public void displayK() {
        String set = K_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    void displayL(MouseEvent event) {
        String set = L_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    void displayM(MouseEvent event) {
        String set = M_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    void displayE(MouseEvent event) {
        String set = E_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    void displayS(MouseEvent event) {
        String set = S_tus.getText();
        out.setText(out.getText()+set);
    }
    @FXML
    void displayI(MouseEvent event) {
        String set = I_tus.getText();
        out.setText(out.getText()+set);

    }

    @FXML
    void Bas (ActionEvent event) {

        int length = out.getText().length();
        if (length < 2) {
            kelime.setText("3 harften fazla girmelisiniz!");
        } else
            kelime.setText(out.getText());

        System.out.println(length);

        File file = new File("C:\\Users\\Zahide Düşgün\\IdeaProjects\\deneme\\src\\main\\resources\\com\\example\\deneme\\metin.txt");
        try {
            Scanner reader = new Scanner(file);
            String[] veriler = new String[8];
            int i = 0;
            while (reader.hasNextLine()) {
                veriler[i] = reader.nextLine();
                System.out.println(veriler[i]);
                if (veriler[i].equals(out.getText())) {

                    list.add(new User(veriler[i],12));
                    System.out.println("Dogru");
                    String sonuclar = veriler[i];
                    System.out.println(sonuclar);
                    i++;}
            }}

        catch (FileNotFoundException e) {
            e.printStackTrace(); }}

    @FXML
    void Clear(MouseEvent event) {
        String set = " ";
        out.setText(set);
    }

    @FXML
    public void Replace(MouseEvent event) {
        Random random = new Random();
        String set_a = "İLSEM";
        int ran1=random.nextInt(set_a.length());
        char ranchar = set_a.charAt(ran1);
        A_tus.setText(valueOf(ranchar));


        Random random3= new Random();
        String set_l = "AİSEM";
        int ran3=random3.nextInt(set_l.length());
        char ranchar3 = set_l.charAt(ran3);
        L_tus.setText(valueOf(ranchar3));


        Random random4= new Random();
        String set_m = "AESİL";
        int ran4=random4.nextInt(set_m.length());
        char ranchar4 = set_l.charAt(ran4);
        M_tus.setText(valueOf(ranchar4));

        Random random5 = new Random();
        String set_e = "MAİLS";
        int ran5=random5.nextInt(set_e.length());
        char ranchar5 = set_e.charAt(ran5);
        E_tus.setText(valueOf(ranchar5));


        Random random6 = new Random();
        String set_s = "EMAİL";
        int ran6=random6.nextInt(set_s.length());
        char ranchar6 = set_s.charAt(ran6);
        S_tus.setText(valueOf(ranchar6));

        Random random2 = new Random();
        String set_i = "AMESL";
        int ran2=random2.nextInt(set_i.length());
        char ranchar2 = set_i.charAt(ran2);
        I_tus.setText(valueOf(ranchar2));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        kelimeler.setCellValueFactory(new PropertyValueFactory<>("kelimeler"));
        puan.setCellValueFactory(new PropertyValueFactory<>("puan"));

        Random random = new Random();
        String set_a = "EMAİLS";
        int ran1=random.nextInt(set_a.length());
        char ranchar = set_a.charAt(ran1);
        A_tus.setText(valueOf(ranchar));

        Random random3= new Random();
        String set_l = "EMAİLS";
        int ran3=random3.nextInt(set_l.length());
        char ranchar3 = set_l.charAt(ran3);
        L_tus.setText(valueOf(ranchar3));


        Random random4= new Random();
        String set_m = "MAESİL";
        int ran4=random4.nextInt(set_m.length());
        char ranchar4 = set_m.charAt(ran4);
        M_tus.setText(valueOf(ranchar4));

        Random random5 = new Random();
        String set_e = "EMAİLS";
        int ran5=random5.nextInt(set_e.length());
        char ranchar5 = set_e.charAt(ran5);
        E_tus.setText(valueOf(ranchar5));


        Random random6 = new Random();
        String set_s = "EMAİLS";
        int ran6=random6.nextInt(set_s.length());
        char ranchar6 = set_s.charAt(ran6);
        S_tus.setText(valueOf(ranchar6));

        Random random2 = new Random();
        String set_i = "EMAİLS";
        int ran2=random2.nextInt(set_i.length());
        char ranchar2 = set_i.charAt(ran2);
        I_tus.setText(valueOf(ranchar2));


    }

    @FXML
    public void Score(MouseEvent event){

    }
}




















