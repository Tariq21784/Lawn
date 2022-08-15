//Write an application for a lawn-mowing service. 
//The lawn-mowing season lasts 20 weeks. 
//The weekly fee for mowing a lot under 4,000 square feet is R25. 
//The fee for a lot that is 4,000 square feet or more, but under 6,000 square feet, is R35 per week. 
//The fee for a lot that is 6,000 square feet or over is R50 per week. 
//Prompt the user for the length and width of a lawn USING JOPTIONPANE, 
//and then display the weekly mowing fee USING JOPTIONPANE , 
//as well as the 20-week seasonal fee. 
//Save the file as Lawn.java.


// using JOptionPane to display output to user 
import javax.swing.JOptionPane;

public class Lawn {
    public static void main(String[] args) {
        
		// initialising and allowing the JOptionPane to read user input
		double length,width,area,seasonalFee,weeklyFee;
        
        String l = JOptionPane.showInputDialog(null,"Input the length of a lawn:");
        length = Double.parseDouble(l);
        String w = JOptionPane.showInputDialog(null,"Input the width of a lawn:");
        width = Double.parseDouble(w);
        area = length*width;

        // if statements to determine area and corresponding fees and display them to user
		if(area < 4000){            
            weeklyFee = 25;
            seasonalFee = 25*20;
            JOptionPane.showMessageDialog(null,"Square feet: " + area + "\nWeekly fee: R" + weeklyFee + "\nAnd your seasonal fee is: R" + seasonalFee);
        }
            else if(area >= 4000 && area < 6000){
                weeklyFee = 35;
                seasonalFee = 35*20;
                JOptionPane.showMessageDialog(null,"Square feet: " + area + "\nWeekly fee: R" + weeklyFee + "\nAnd your seasonal fee is: R" + seasonalFee);
            }
            else if(area >= 6000){
                weeklyFee = 50;
                seasonalFee = 50*20;
                JOptionPane.showMessageDialog(null,"Square feet: " + area + "\nWeekly fee: R" + weeklyFee + "\nAnd your seasonal fee is: R" + seasonalFee);
            }
        else{
            JOptionPane.showMessageDialog(null,"Error: Invalid input!");
        }
    }
}

