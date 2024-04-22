import java.util.ArrayList;
public class StepTracker
{
 private int minSteps;
 private int totalSteps;
 private int actDays;
 private int totalDays;

 public StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  actDays = 0;
  totalDays = 0;
 }

 public void addDailySteps(int steps){
  totalSteps += steps;
  totalDays ++;
  if(steps >= minSteps)
   actDays ++;
 }

 public int activeDays(){
  return actDays;
 }

 public double averageSteps(){
  if(totalSteps == 0)
   return 0.0;
  else
   return (double) totalSteps/totalDays;
 }
} 
