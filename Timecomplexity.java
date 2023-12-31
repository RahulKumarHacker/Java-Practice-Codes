package EclipseJavaCodes;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Timecomplexity {
	public static void someFunction()
    {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < Integer.MAX_VALUE; j++) {
                // Here for example purpose
                // we run an empty loop
            }
        }
    }
    public static void main(String[] args)
    {
        // Get the current system time in
        // both nano and milli-seconds before
        // calling the function.
        long nano_startTime = System.nanoTime();
        long millis_startTime = System.currentTimeMillis();
        
  
        // Perform the work whose time is to be measured
        someFunction();
  
        // Get the current system time in both
        // nano and milli-seconds after
        // the function returns.
        long nano_endTime = System.nanoTime();
        long millis_endTime = System.currentTimeMillis();
  
        // Print the time taken by subtracting
        // the end-time from the start-time
        System.out.println("Time taken in nano seconds: "
                           + (nano_endTime - nano_startTime));
        System.out.println("Time taken in milli seconds: "
                           + (millis_endTime - millis_startTime));
        
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
        System.out.println(time.format(formatter));
        
    }
  
    // The function whose execution
    // time is to be measured
    
}
