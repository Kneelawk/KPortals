package org.kneelawk.kportals.log;

import org.slf4j.Logger;

public class KPLog {
	private static Logger log;

	public static void init(Logger log) {
		KPLog.log = log;
	}

	public static Logger get() {
		return log;
	}

	public static void info(String msg) {
		log.info(msg);
	}

	public static void info(String msg, Throwable t) {
		log.info(msg, t);
	}

	public static void warn(String msg) {
		log.warn(msg);
	}

	public static void warn(String msg, Throwable t) {
		log.warn(msg, t);
	}

	public static void error(String msg) {
		log.error(msg);
	}

	public static void error(String msg, Throwable t) {
		log.error(msg, t);
	}
}
