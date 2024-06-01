package com.example.demo5;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {

    private Circle currentPiece;
    private double mouseX, mouseY;


    private double oldTranslateX, oldTranslateY;
    private int newTranslateX, newTranslateY;

    public void start(Stage stage) throws Exception {


        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 800, 800);
        stage.setTitle("Checkers");

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {

                Rectangle rectangle = new Rectangle(100, 100);

                if ((r + c) % 2 == 0) {
                    rectangle.setFill(Color.FIREBRICK);
                } else {
                    rectangle.setFill(Color.BLACK);
                }
                grid.add(rectangle, c, r);
            }
        }

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Rectangle rectangle = (Rectangle) grid.getChildren().get(r * 8 + c);
                if (rectangle.getFill().equals(Color.BLACK)) {
                    Circle piece;
                    if (r <= 2) {
                        piece = new Circle(40, Color.YELLOW);
                        GridPane.setHalignment(piece, HPos.CENTER);
                    } else if (r >= 5) {
                        piece = new Circle(40, Color.SADDLEBROWN);
                        GridPane.setHalignment(piece, HPos.CENTER);
                    } else {
                        piece = null;
                    }

                    if (piece != null) {
                        piece.setOnMousePressed(event -> {
                            currentPiece = (Circle) event.getSource();
                            mouseX = event.getSceneX();
                            mouseY = event.getSceneY();
                            oldTranslateX = currentPiece.getTranslateX();
                            oldTranslateY = currentPiece.getTranslateY();
                        });

                        piece.setOnMouseDragged(event -> {
                            double diffX = event.getSceneX() - mouseX;
                            double diffY = event.getSceneY() - mouseY;

                            currentPiece.setTranslateX(oldTranslateX + diffX);
                            currentPiece.setTranslateY(oldTranslateY + diffY);
                            System.out.println(currentPiece.getTranslateX());
                            System.out.println(currentPiece.getTranslateY());
                        });

                        piece.setOnMouseReleased(event -> {

                            newTranslateX = (int) currentPiece.getTranslateX();
                            newTranslateY = (int) currentPiece.getTranslateY();

                            if (newTranslateX >= 0) {
                                if (newTranslateX >= 100) {
                                    currentPiece.setTranslateX(newTranslateX - newTranslateX % 100);
                                } else if (newTranslateX >= 50) {
                                    currentPiece.setTranslateX(100);
                                } else {
                                    currentPiece.setTranslateX(0);
                                }
                            } else {
                                if (Math.abs(newTranslateX) >= 100) {
                                    currentPiece.setTranslateX(newTranslateX - newTranslateX % 100);
                                } else if (Math.abs(newTranslateX) >= 50) {
                                    currentPiece.setTranslateX(-100);
                                } else {
                                    currentPiece.setTranslateX(0);
                                }
                            }


                            if (newTranslateY >= 0) {
                                if (newTranslateY >= 100) {
                                    currentPiece.setTranslateY(newTranslateY - newTranslateY % 100);
                                } else if (newTranslateY >= 50) {
                                    currentPiece.setTranslateY(100);
                                } else {
                                    currentPiece.setTranslateY(0);
                                }
                            } else {
                                if (Math.abs(newTranslateY) >= 100) {
                                    currentPiece.setTranslateY(newTranslateY - newTranslateY % 100);
                                } else if (Math.abs(newTranslateY) >= 50) {
                                    currentPiece.setTranslateY(-100);
                                } else {
                                    currentPiece.setTranslateY(0);
                                }
                            }


                            System.out.println(newTranslateX + " " + newTranslateY);
                            System.out.println(newTranslateX - newTranslateX % 100);
                            System.out.println(newTranslateY - newTranslateY % 100);
                        });


                        grid.add(piece, c, r);

                        stage.setScene(scene);
                        stage.show();
                        stage.setMaxHeight(stage.getHeight());
                        stage.setMaxWidth(stage.getWidth());


                    }
                }
            }
        }
    }
}









