/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framecontrollerfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Fasiha Asim
 */
public class FrameControllerFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn[] = null;
        btn=new Button[4];
        for(int i=0;i<4;i++)
            btn[i]=new Button();
        btn[0].setText("Up");
        btn[1].setText("Down");
        btn[2].setText("Right");
        btn[3].setText("Left");
        
        
        

        
        
        FlowPane root = new FlowPane();
      for(int i=0;i<4;i++)
        root.getChildren().add(btn[i]);
       
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
        btn[0].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               double x= primaryStage.getX();
               double y= primaryStage.getY();
              
               primaryStage.setY(y-10);
               
               
            }
        });
        btn[1].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               double x= primaryStage.getX();
               double y= primaryStage.getY();
              
               primaryStage.setY(y+10);
            }
        });
        btn[2].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               double x= primaryStage.getX();
               double y= primaryStage.getY();
              
               primaryStage.setX(x+10);
            }
        });
        btn[3].setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
               double x= primaryStage.getX();
               double y= primaryStage.getY();
              
               primaryStage.setX(x-10);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
