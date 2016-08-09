package week2example;

public class MazeApp {
	public static void main(String[] args){
		Maze maze = new Maze();
		MazeLoader.loadMaze("data/mazes/maze1.maze", maze);
		
		maze.printMaze();
	}
}