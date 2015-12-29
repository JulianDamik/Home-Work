package flightSchedule;

import java.util.ArrayList;
public class FlightScheduleRunner {
   public static void main(String[] args) {
      ArrayList<String> scheduleTimes = null;
      FlightSchedule flightSchedule = null;
      int i = 0;

      scheduleTimes = new ArrayList<String>();
      scheduleTimes.add("8:00"); 
      scheduleTimes.add("10:00");
      scheduleTimes.add("12:00");
         
      flightSchedule = new FlightSchedule(scheduleTimes);
          
      flightSchedule.delayedFlight(1);
      flightSchedule.earlyFlight(0, 1);
      for (i = 0; i < flightSchedule.scheduleList.size(); ++i) {
         System.out.println(flightSchedule.scheduleList.get(i) + " ");
      }

      return;
   }
}
