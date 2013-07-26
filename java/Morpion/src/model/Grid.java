package model;

/**
 * Class Grid composed of three lines and three columns.
 * @author Folabi.
 * @date 16/07/2013-16/07/2013.
 *
 */
public class Grid {
	
	/**
	 * The grid.
	 */
	private int grid[][];
	
	/**
	 * Default constructor.
	 */
	public Grid(){
		grid = new int[3][3];
	}
	
	/**
	 * Print the grid's data.
	 */
	public String toString(){
		String print = "";
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				// player piece
				if(grid[i][j] == 1){
					print += "X  ";
				}else{
					// computer piece
					if(grid[i][j] == 2){
						print += "O  ";
					}else{
						// no one play
						print +="-  ";
					}
				}
				
			}
			print +="\n";
		}
		
		return print;
	}
}
