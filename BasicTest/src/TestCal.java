import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestCal {
	public static void main(String[] args) {
		String oldDateStr = "10-Aug-2016";
		
		Calendar expectEndDate = getTrialEndDate(oldDateStr);
		
        HashMap<Integer, String> monthIntStrMap = new HashMap();
        monthIntStrMap.put(0, "January");
        monthIntStrMap.put(1, "February");
        monthIntStrMap.put(2, "March");
        monthIntStrMap.put(3, "April");
        monthIntStrMap.put(4, "May");
        monthIntStrMap.put(5, "June");
        monthIntStrMap.put(6, "July");
        monthIntStrMap.put(7, "August");
        monthIntStrMap.put(8, "September");
        monthIntStrMap.put(9, "October");
        monthIntStrMap.put(10, "November");
        monthIntStrMap.put(11, "December");
        String newDateStr = monthIntStrMap.get(expectEndDate.get(Calendar.MONTH)) + " " 
        + expectEndDate.get(Calendar.DATE) + ", " + expectEndDate.get(Calendar.YEAR);
        System.out.println(newDateStr);
    }
	
	static private Calendar getTrialEndDate(String endDateStr){
		Calendar endDate = Calendar.getInstance();
    	
        int day = Integer.parseInt(endDateStr.substring(0,2));
        int year = Integer.parseInt(endDateStr.substring(7,11));
        HashMap<String, Integer> monthStrIntMap = new HashMap();
        monthStrIntMap.put("Jan", 0);
        monthStrIntMap.put("Feb", 1);
        monthStrIntMap.put("Mar", 2);
        monthStrIntMap.put("Apr", 3);
        monthStrIntMap.put("May", 4);
        monthStrIntMap.put("Jun", 5);
        monthStrIntMap.put("Jul", 6);
        monthStrIntMap.put("Aug", 7);
        monthStrIntMap.put("Sep", 8);
        monthStrIntMap.put("Oct", 9);
        monthStrIntMap.put("Nov", 10);
        monthStrIntMap.put("Dec", 11);
   
        int month = monthStrIntMap.get(endDateStr.substring(3,6));
       
        endDate.set(year,month,day);
    	return endDate;
    }
}
