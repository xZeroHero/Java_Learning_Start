package aufgaben.objektorientierung.a41_nerds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private static boolean[] topRowStates = new boolean[4];  // 4 buttons for the top row
    private static boolean[] bottomRowStates = new boolean[6];  // 6 buttons for the bottom row

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Binary Button GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel for the upper row (4 buttons)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 4)); // 1 row, 4 columns

        // Create a panel for the lower row (6 buttons)
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 6)); // 1 row, 6 columns

        // Add 4 buttons to the top panel
        for (int i = 0; i < 4; i++) {
            JButton button = createButton(i, true);  // top row buttons
            topPanel.add(button);
        }

        // Add 6 buttons to the bottom panel
        for (int i = 0; i < 6; i++) {
            JButton button = createButton(i, false);  // bottom row buttons
            bottomPanel.add(button);
        }

        // Create a main panel to combine the two rows and center them
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20)); // Centered layout

        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

        // Create a confirm button
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Print the binary number for the top row
                StringBuilder topBinary = new StringBuilder();
                for (boolean state : topRowStates) {
                    topBinary.append(state ? "1" : "0");
                }
                System.out.println("Top row binary: " + topBinary.toString());

                // Print the binary number for the bottom row
                StringBuilder bottomBinary = new StringBuilder();
                for (boolean state : bottomRowStates) {
                    bottomBinary.append(state ? "1" : "0");
                }
                System.out.println("Bottom row binary: " + bottomBinary.toString());

                // Show a dialog with the binary numbers
                JOptionPane.showMessageDialog(frame,
                        "Top row binary: " + topBinary.toString() + "\nBottom row binary: " + bottomBinary.toString(),
                        "Binary Numbers",
                        JOptionPane.INFORMATION_MESSAGE);

                System.out.println(Watch.binaryTime(topBinary.toString(), bottomBinary.toString()));
            }
        });

        // Add the confirm button to the main panel
        mainPanel.add(confirmButton);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Show the frame
        frame.setVisible(true);
    }

    // Helper method to create buttons for either top or bottom row
    private static JButton createButton(int index, boolean isTopRow) {
        JButton button = new JButton("0");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle button state between 0 and 1
                if (button.getText().equals("0")) {
                    button.setText("1");
                    if (isTopRow) {
                        topRowStates[index] = true;  // Set the top row button state to true (1)
                    } else {
                        bottomRowStates[index] = true; // Set the bottom row button state to true (1)
                    }
                } else {
                    button.setText("0");
                    if (isTopRow) {
                        topRowStates[index] = false; // Set the top row button state to false (0)
                    } else {
                        bottomRowStates[index] = false; // Set the bottom row button state to false (0)
                    }
                }
            }
        });
        return button;
    }
}
