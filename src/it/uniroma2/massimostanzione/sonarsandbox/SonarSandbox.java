package it.uniroma2.massimostanzione.sonarsandbox;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SonarSandbox {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("global");
		logger.log(Level.INFO, "Hello SonarCloud! Da Debian!");
		logger.log(Level.INFO, "... e pure da Windows!");
		logger.log(Level.INFO, "Ma senza il ghost?");
	}
}
