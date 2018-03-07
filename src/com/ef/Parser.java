package com.ef;

import com.ef.model.Entry;

public class Parser {

	public static void main(String[] args) {

		try {
			Entry entry = extractEntry(args);
			System.out.println(entry.getDuration());
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Entry extractEntry(String[] args) throws IllegalArgumentException{
		String startDate = "";
		String duration = "";
		String threshold = "";

		for (String arg : args) {

			String[] params = arg.split("=");

			if (params[0].equals("--startDate")) {
				startDate = params[1];
			} else if (params[0].equals("--duration")) {
				duration = params[1];
			} else if (params[0].equals("--threshold")) {
				threshold = params[1];
			} else {
				throw new IllegalArgumentException("Invalid parameters provided.\n Use this format:"
						+ " --startDate=2017-01-01.00:00:00 --duration=daily --threshold=500");
			}

		}
		return new Entry(startDate, duration, threshold);
	}

}
