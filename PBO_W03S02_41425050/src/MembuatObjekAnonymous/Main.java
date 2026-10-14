/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatObjekAnonymous;

/**
 *
 * @author ewiss
 */
// Nama : Euis Sihombing
// NIM : 41425050
// Prodi : TRPL
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Class Main merupakan turunan dari class Application
public class Main extends Application {

    // Method main() adalah titik awal program Java
    public static void main(String[] args) {
        launch(args); // Menjalankan aplikasi JavaFX
    }

    // Method start() digunakan untuk membuat tampilan JavaFX
    @Override
    public void start(Stage stage) {

        // Membuat tombol dengan tulisan "Click Me"
        Button button = new Button("Click Me");

        // Menentukan aksi yang dilakukan ketika tombol diklik
        button.setOnAction(
            event ->
                System.out.println(
                    "Button clicked!")); // Anonymous object melalui lambda

        // Membuat StackPane dan memasukkan tombol ke dalamnya
        StackPane root = new StackPane(button);

        // Membuat Scene dengan ukuran 300 x 200
        stage.setScene(new Scene(root, 300, 200));

        // Menampilkan window/aplikasi
        stage.show();
    }
}