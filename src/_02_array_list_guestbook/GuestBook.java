package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button = new JButton();
	ArrayList<String> names = new  ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.run();
	}
	
	void run() {
		names.add( "Guest #1: Bob Banders");
		names.add(" Guest #2: Sandy Summers");
		names.add( " Guest #3: Greg Ganders");
		names.add("Guest #4: Donny Doners");
	////////////////////////////////////////////
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button);
		button.setText("Add Name");
		button1.setText("view Names");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setTitle("GuestBook");
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttons = (JButton) e.getSource();
		
		if(button == buttons) {
			String input =	JOptionPane.showInputDialog(null, "please enter name.");
			if( (!input.equals(null)) && (!input.isEmpty()) ) {
				names.add("Guest #"+(names.size()+1)+": "+input);
			} else {
				JOptionPane.showMessageDialog(null, "name not entered");
			}
		}
			
	
		
		if(button1 == buttons) {
			JOptionPane.showMessageDialog(null, "current Guest list: "+names);
			
			}
		
	}
}
