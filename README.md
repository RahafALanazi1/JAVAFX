package com.mycompany.lh; 
import javafx.application.Application; // Import the JavaFX Application class
import javafx.scene.Scene; // Import the JavaFX Scene class
import javafx.scene.layout.HBox; // Import the JavaFX HBox layout class for horizontal layout
import javafx.geometry.Insets; // Import the Insets class to set padding/margins
import javafx.stage.Stage; // Import the JavaFX Stage class for the application window
import javafx.scene.image.Image; // Import the JavaFX Image class to load images
import javafx.scene.image.ImageView; // Import the JavaFX ImageView class to display images
public class App extends Application { // Define the App class that extends the Application class

    public void start(Stage primaryStage) { // Override the start method; entry point for the JavaFX application
        // Create an HBox layout container to arrange nodes horizontally
        HBox hbox = new HBox();
        hbox.setSpacing(10); // Set spacing of 10 pixels between each child node in the HBox
        hbox.setPadding(new Insets(5, 5, 5, 5)); // Set padding of 5 pixels on all sides of the HBox
        // Load an image from a file using its path (make sure the path is correct)
        Image image = new Image("file:C:\\Users\\rahaf\\OneDrive\\سطح المكتب\\rr.jpg");
        // Create the first ImageView to display the original image
        ImageView imageView1 = new ImageView(image);
        hbox.getChildren().add(imageView1); // Add imageView1 to the HBox
        // Create the second ImageView to display a resized version of the image
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitWidth(100);  // Set the width of imageView2 to 100 pixels
        imageView2.setFitHeight(100); // Set the height of imageView2 to 100 pixels
        hbox.getChildren().add(imageView2); // Add imageView2 to the HBox 
        // Create the third ImageView to display the image rotated by 90 degrees
        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90); // Rotate imageView3 by 90 degrees
        hbox.getChildren().add(imageView3); // Add imageView3 to the HBox
        // Create a Scene with the HBox as the root node
        Scene scene = new Scene(hbox);
        primaryStage.setTitle("ShowImage"); // Set the title of the application window (Stage)
        primaryStage.setScene(scene); // Set the scene for the primary stage
        primaryStage.show(); // Display the stage (window) to the user
    }

    public static void main(String[] args) { 
        launch(args);
    }
}
