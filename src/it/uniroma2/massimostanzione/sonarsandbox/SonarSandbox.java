package it.uniroma2.massimostanzione.sonarsandbox;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SonarSandbox {
	private static int var = 7;

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("global");
		logger.log(Level.CONFIG, "Hello SonarCloud! Da Debian!");
		logger.log(Level.CONFIG, "... e pure da Windows!");
		logger.log(Level.WARNING, "Ma senza il ghost?");
		logger.log(Level.CONFIG, "Sì, senza il ghost e pure da Debian, ma lo scanner non gira.");
		logger.log(Level.INFO, String.format("E la variabile vale %d.", var));
	}
}
