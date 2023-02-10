package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Loggermessage {
	
    static Logger logger = Logger.getLogger(Loggermessage.class); 

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("THis is debug message ");
		logger.info("This is Information message ");
		logger.error("This is error message ");
		logger.warn("This is warning message ");
		
		
	}

}
