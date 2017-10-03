import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


public class TestDate {
	public static void main(String[] args) {
		String oldDateStr = "10-Aug-2016";
		String newDateStr = "10-Oct-2016";
		Date oldDate = getTrialEndDate(oldDateStr);
		Date newDate = getTrialEndDate(newDateStr);
        System.out.println(TimeUnit.DAYS.convert(newDate.getTime() - oldDate.getTime(),TimeUnit.MILLISECONDS));
    }
	

	static private Date getTrialEndDate(String endDateStr){
    	Date endDate = null;
    	
        int day = Integer.parseInt(endDateStr.substring(0,2));
        int year = Integer.parseInt(endDateStr.substring(7,11));
        HashMap<String, Integer> monthMap = new HashMap();
        monthMap.put("Jan", 0);
        monthMap.put("Feb", 1);
        monthMap.put("Mar", 2);
        monthMap.put("Apr", 3);
        monthMap.put("May", 4);
        monthMap.put("Jun", 5);
        monthMap.put("Jul", 6);
        monthMap.put("Aug", 7);
        monthMap.put("Sep", 8);
        monthMap.put("Oct", 9);
        monthMap.put("Nov", 10);
        monthMap.put("Dec", 11);
   
        int month = monthMap.get(endDateStr.substring(3,6));
       
        endDate = new Date(year-1900,month,day);
    	return endDate;
    }
}
