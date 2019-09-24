package fi.utu.tech;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Ohjelma joka laskee 2. asteen yhtälön ratkaisun
 * tai ratkaisut, graafisesti.
 * 
 * Käytin tässä lukiossa opittua ratkaisukaavaa:
 * https://fi.wikipedia.org/wiki/Toisen_asteen_yht%C3%A4l%C3%B6#Toisen_asteen_yht%C3%A4l%C3%B6n_ratkaisukaava
 * 
 * @author 1. vuoden opiskelija
 */
public class CalculatorApp extends Application {
	
	// ensimmäinen Java-yritelmäni
	// joskus toimii, joskus ei
	//
	// t. 1. vuoden opiskelija
	
	
	/*
	 *  @.pre input == double a + ' ' + double b + ' ' + double c && b*b - 4*a*c > 0
	 *  
	 *  @.post r1 == (-b+Math.sqrt(b*b - 4*a*c))/(2*a), r2 == (-b-Math.sqrt(b*b - 4*a*c))/(2*a)
	 */
	
	String calculate(String input) {
		
		String[] i = input.split(" ");
		
		double a, b, c;
		
		try {

		a = Double.parseDouble(i[0]);
		b = Double.parseDouble(i[1]);
		c = Double.parseDouble(i[2]);
		
		} catch (Exception e) {
			return "kelvoton syöte";
		}
				
		if (b*b - 4*a*c < 0) {
			return "kelvoton syöte (b*b - 4*a*c < 0)";
		}

		double r1, r2;
		
		r1 = (-b+Math.sqrt(b*b - 4*a*c))/(2*a);
		r2 = (-b-Math.sqrt(b*b - 4*a*c))/(2*a);
		
		if (r1 == r2)
			return "Ratkaisu on: x = " + r1;
		else
			return "Ratkaisut ovat: x = " + r1 + " ja x = " + r2;
	}
	
	// tämä vaikuttaa valmiilta
	// tätä ei tarvitse muuttaa
	@Override
	public void start(Stage window) {
		window.setTitle("2. asteen yhtälön ratkaisin");

		VBox root = new VBox();
		root.setSpacing(12);
		root.getChildren().add(new Label("Ratkaistaan yhtälö ax^2 + bx + c."));
		root.getChildren().add(new Label("Syötä alle muodossa: a väli b väli c"));

		TextField input = new TextField();
		root.getChildren().add(input);

		Button btn = new Button("Laske");
		root.getChildren().add(btn);
		
		root.getChildren().add(new Label("Tulos:"));
		
		Label output = new Label("");
		root.getChildren().add(output);

		btn.setOnAction(e -> output.setText(calculate(input.getText())));
		
		window.setScene(new Scene(root, 400, 300));
		window.show();
	}
}