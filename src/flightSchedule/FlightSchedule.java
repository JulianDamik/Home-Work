package flightSchedule;

import java.util.ArrayList;
public class FlightSchedule {
   public ArrayList<String> scheduleList;

   public FlightSchedule(ArrayList<String> flightScheduleList) {
      scheduleList = flightScheduleList;
   }

   public void delayedFlight(int delayedIndex) {
      String delayedFlight;
      delayedFlight = scheduleList.get(delayedIndex);
      scheduleList.remove(delayedIndex);
      scheduleList.add(delayedFlight + " DELAYED");
   }

   public void earlyFlight(int earlyIndex, int newPos) {
	   String earlyFlight;    
	   earlyFlight = scheduleList.get(earlyIndex);
	   scheduleList.remove(earlyIndex);
	   scheduleList.add(newPos, earlyFlight + " EARLY");
   }
}
