/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		head();
		body();
		box();
		feet();
		System.out.println("");
		System.out.println("This is a cat holding a box to cover its very, very, very long legs.");
	}

	public static void head() {
		System.out.println("    /\\_____/\\    ");
		System.out.println("   /  O   O  \\   ");
		System.out.println("  ( ==  ^  == )  ");
		System.out.println("   )         (   ");
	}

	public static void body() {
		System.out.println("  / ___   ___ \\  ");
		System.out.println(" ( (///) (\\\\\\) ) ");
	}

	public static void drawHoriz() {
		System.out.println("+---------------+");
	}

	public static void drawVert() {
		System.out.println("|               |");
	}

	public static void box() {
		drawHoriz();
		drawVert();
		drawVert();
		drawVert();
		drawVert();
		drawVert();
		drawVert();
		drawVert();
		drawHoriz();
	}

	public static void feet() {
		System.out.println("   (   ) (   )   ");
		System.out.println("   )   ( )   (   ");
		System.out.println("  (////) (\\\\\\\\)  ");
	}
}