package timeConverter;

public class TimeConverter {

	public static String convertTime(String inputTime) {

		String returnTime = "";
		String returnTimeSuffix = "";
		String[] deconstructedTime = inputTime.split(":");
		
		// Detection of 12-hour time via the presence of "a" or "p" (as in "am" or "pm") in the input String. If there's an "a" or a "p", enter this if
		if ((inputTime.contains("a")) || (inputTime.contains("p"))) {
			
			// 1a) If the second to last substring is "a" and the hour section of time is 12...
			if ((inputTime.substring((inputTime.length() - 2), (inputTime.length() - 1)).equals("a")) && (Integer.valueOf(deconstructedTime[0]) == 12)) {
				
				// 1a1) Then make the hour section of time 0, since 24-hour time goes from 23:59 to 0:00
				// This ensures time goes from 23:59 to 0:00 and 0:59 to 1:00
				deconstructedTime[0] = Integer.toString(0);
				
			// 1b) If the second to last substring is "p" and the hour section is any time OTHER THAN 12...
			} else if ((inputTime.substring((inputTime.length() - 2), (inputTime.length() - 1)).equals("p")) && (Integer.valueOf(deconstructedTime[0]) != 12)) {
				// 1b1) Add 12 and set the hour section of time to itself plus 12
				// Thus, 12:11 pm (12-hour) stays 12:11 (24-hour) while 1:11 pm (12-hour) becomes 13:11 (24-hour)  	
				deconstructedTime[0] = Integer.toString(Integer.valueOf(deconstructedTime[0]) + 12);
			}
			
			// Then, we strip the time suffix from deconstructedTime[1], which is :XX am or :XX pm and initialize timeWithoutSuffix with that minute value
			String[] timeWithoutSuffix = deconstructedTime[1].split(" ");
			
			// Then, we set the String returnTime as the evaluated deconstructedTime[0] with a String colon and the processed timeWithoutSuffix[0]
			returnTime = deconstructedTime[0] + ":" + timeWithoutSuffix[0];
			
		// If there is no "a" or "p", then treat the input as 24-hour time and begin to convert from 24- to 12-hour time
		} else {
			
			// 2a) If the hour section of inputTime is greater than 12...
			if (Integer.valueOf(deconstructedTime[0]) > 12) {
				// 2a1) Then we reduce its value by 12 and set returnTimeSuffix to "pm"
				// So, 17:51 become 5:51 pm
				deconstructedTime[0] = Integer.toString(Integer.valueOf(deconstructedTime[0]) - 12);
				returnTimeSuffix = " pm";
				
			// 2b) If it's not greater than 12, but exactly 12 then we do no value mutation and just set returnTimeSuffix to "pm"
			} else if (Integer.valueOf(deconstructedTime[0]) == 12) {
				returnTimeSuffix = " pm";
				
			// 2c) In all other cases, we don't manipulate the hour value and merely set returnTimeSuffix to "am", so 10:53 becomes 10:53 am
			} else {
				returnTimeSuffix = " am";
			}
			
			// Then, we set returnTime to the following values
			returnTime = deconstructedTime[0] + ":" + deconstructedTime[1] + returnTimeSuffix;
		}

		// And return the resulting String
		return returnTime;
	}
}
