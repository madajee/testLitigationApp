package legalDiary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Utilities { 

	public String getTodayDate () {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        String todayDate = dateFormat.format(date);
        System.out.println("Todays's Date:" + todayDate);
        return todayDate;
	}

}