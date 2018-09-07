package application;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	
	@FXML
	private Label result;
	private double number1 = 0;
	private double number2 = 2;
	private String operator = "";
	private boolean start = true;
	private Modal modal = new Modal();
	
	@FXML
	public void processNumber(ActionEvent event) {
	
		if (start) {
			result.setText("");
			start = false;
		}
		String value =((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
	}
	@FXML
	public void processOperators(ActionEvent event) {
		String value =((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if(!operator.isEmpty())
			{
				return;
			}
			operator = value;
			number1 = Double.parseDouble(result.getText());
			result.setText("");
			System.out.println("Logging ex");
		}else 
		{
			
			if (operator.isEmpty())
				return;
			number2 = Double.parseDouble(result.getText());
			double output = modal.Calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator =" ";
			start = true;
		}
		
		
	}
	public void clear() {
		
	}
	
}
