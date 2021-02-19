/*
CSE017 Fall 2019
@Bratislav Petkovic 
Homework # 2
Program: Team
*/
import java.util.* ;
import java.util.ArrayList;
import java.lang.String ;
public class TestDraft{ 

private String locationName ;
private String teamName ;
private int[] weeksPlayed = new int[17] ; //the week the team plays 1,0
private String[] dateList = new String [17]; //mm/dd format , if team doesnt play 00/00

//Constructor 1
public TestDraft( String locationName, String teamName, String[] dateList){
    this.locationName = locationName;
    this.teamName = teamName ;
    this.dateList = dateList;
    weeksPlayed = weekPlayed(dateList) ;
}
//Constructor 2
public TestDraft(String locationName, String[] dateList){
    this.locationName = locationName;
    this.teamName = "N/A" ;
    this.dateList = dateList;
    weeksPlayed = weekPlayed(dateList) ;    
}
//Constructor 3
public TestDraft( String[] dateList){
    this.locationName =  "N/A";
    this.teamName =  "N/A" ;
    this.dateList = dateList;
    weeksPlayed = weekPlayed(dateList) ;
}

//builds integer array of containing weeks played
public int[] weekPlayed(String[] dateList){
    for(int i = 0; i< dateList.length; i++){
        String currentDate = dateList[i];
        if(currentDate == "00/00"){
            weeksPlayed[i]=0;
        }
        else if (currentDate != "00/00"){
            weeksPlayed[i]=1;
        }
    }
    return weeksPlayed ;
}


//byWeek returns the integer value of the week the team does not play
public int byWeek(){
    int byWeekCheck = -1;
    for(int i = 0; i < dateList.length;i++){
        String currentWeek = dateList[i] ;
        if(currentWeek == "00/00"){
            byWeekCheck = i + 1;
        }
    }
    return byWeekCheck; 
}

// estimates the tickets sold 
public static double estimateSales(int week,TestDraft team,double ticketPrice,int numSeats,double seatsSold){
    double estimatedSale ;
    //Team is here so that we can check that its not a byweek 
    if(team.weeksPlayed[week-1] == 0){
        estimatedSale = 0;
    }
    else {
        estimatedSale = numSeats * ticketPrice * seatsSold ;
    }
    return estimatedSale ;
}
//check whether two teams play on that date
public static boolean checkSchedule(TestDraft[] team, int week){
    boolean statusChecked = false ;
    String team1date = team[0].dateList[week-1];
    String team2date = team[1].dateList[week-1];
    //do play on the same date
    if(team1date == team2date){
        statusChecked = true ;
    }
    //do not play on same date 
    else if(team1date != team2date){ 
        statusChecked = false ;
    }
    return statusChecked ;

}
//if two teams play on same day, ticket sales dont multiply 

public static void printSales(TestDraft[] team, double ticketPrice, int numSeats, int week ){
    double[] seatsSoldPerc = new double[]{0.70,0.75,0.80,0.85,0.90,0.95,1.0} ;
    double generatedRev ;
    int multiplier = 0;
    //Seats, Percent, Sales.
    //3 team possibility
    if (team.length == 3){
        TestDraft [] matchup1 = new TestDraft[]{team[0],team[1]} ;
        TestDraft [] matchup2 = new TestDraft[]{team[0],team[2]} ; 
        TestDraft [] matchup3 = new TestDraft[]{team[1],team[2]} ;
        // should return boolean, true if teams play on same date 
        boolean overlappingGame1 = checkSchedule(matchup1, week) ; 
        boolean overlappingGame2 = checkSchedule(matchup2, week) ;       // should return boolean
        boolean overlappingGame3 = checkSchedule(matchup3, week) ;       // should return boolean
        System.out.println("            Seats         Sold           Revenue") ;
        System.out.println("            -----         ----           -------") ;
        if(overlappingGame1==true & overlappingGame2==true ){
            //they all play on the same date, if 2 combos play on same day all 3 play on same day
            //multiplier is 1
            multiplier = 1;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i]) * multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
            }
        }
        else if(overlappingGame1==false & (overlappingGame2==false & overlappingGame3==false)){
            // all three play on different days 
            //multiplier is 3
            multiplier = 3;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i]) * multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
            }
        }
        else if(overlappingGame1==true & (overlappingGame2==false & overlappingGame3==false)){
            // 2 teams play on same day, 1 team plays on different day
            //multiplier is 2
            multiplier = 2 ;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i]) * multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
            }
        }

        else if(overlappingGame1==false & (overlappingGame2==true & overlappingGame3==false)){
            // 2 teams play on same day, 1 team plays on different day
            //multiplier is 2
            multiplier = 2 ;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i])* multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
            }
        }

        else if(overlappingGame1==false & (overlappingGame2==false & overlappingGame3==true)){
            // 2 teams play on same day, 1 team plays on different day
            //multiplier is 2
            multiplier = 2 ;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i])* multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
        }
        
    }
}
    else if (team.length == 2) {
        boolean Game1 = checkSchedule(team, week) ;   // should return boolean
        if (Game1 = true){
            multiplier=1;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i])* multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
        }
        }
        else if (Game1 = false){
            multiplier = 2;
            for(int i = 0; i< seatsSoldPerc.length;i++){
                generatedRev = estimateSales(week, team[0], ticketPrice, numSeats, seatsSoldPerc[i])* multiplier ;
                System.out.println("          "+numSeats+"         "+seatsSoldPerc[i]+"           "+generatedRev+ " ");
        }
        }
    }
 
    
}
}