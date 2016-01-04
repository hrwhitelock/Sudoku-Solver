import javax.swing.*;


public class SudokuSolverMain {

	public static void main(String[] args) {
		// 
		JFrame frame = new JFrame("Sudoku Solver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SudokuAppPanel panel = new SudokuAppPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);

	}

}
