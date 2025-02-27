package com.mycompany.lap6;
import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.scene.layout.*;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Circle;
 import javafx.scene.text.*;
 import javafx.scene.control.*;
 import javafx.stage.Stage;
 public class App extends Application {
   @Override
   public void start(Stage primaryStage) {    
   Pane pane = new StackPane();
   Circle circle = new Circle(); 
   circle.setRadius(50);
   circle.setStroke(Color.BLACK);
   circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
   pane.getChildren().add(circle);
   Label label = new Label("JavaFX"); 
   label.setFont(Font.font("Times New Roman",
   FontWeight.BOLD, 20));
   pane.getChildren().add(label);
   Scene scene = new Scene(pane);
   primaryStage.setTitle("FontDemo"); 
   primaryStage.setScene(scene); 
 
   primaryStage.show();
 }
   public static void main(String[] args) {
       launch();
   }
 }
