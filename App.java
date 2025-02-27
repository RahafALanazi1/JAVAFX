package com.mycompany.its3;

 import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.FlowPane;
 import javafx.stage.Stage;
 public class App extends Application {
   @Override
   public void start(Stage primaryStage) {
   FlowPane pane = new FlowPane();
   pane.setPadding(new Insets(11, 12, 13, 14));
   pane.setHgap(7); 
   pane.setVgap(7);
     pane.getChildren().addAll(new Label("first Name:"),
     new TextField(), new Label("MI:"));
   TextField tfMi = new TextField();
   tfMi.setPrefColumnCount(2);
   pane.getChildren().addAll(tfMi, new Label("last Name:"),
     new TextField());  
   Scene scene = new Scene(pane, 240, 290);
   primaryStage.setTitle("RA");
   primaryStage.setScene(scene); 
   primaryStage.show(); 
 }
 }
