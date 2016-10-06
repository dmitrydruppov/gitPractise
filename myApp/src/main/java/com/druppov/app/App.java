package com.druppov.app;

/**
 * Print command args!
 *
 */
public class App 
{
    public void printFromCommandsArgs(String[] args) {
		if(args.length == 0) {
			System.out.println("No attributes!");
		} else {
			for(String arg : args) {
			  System.out.println(arg);
			}
		}
    }

    public static void main( String[] args )
    {
		App app = new App();
		app.printFromCommandsArgs(args);
    }
}
