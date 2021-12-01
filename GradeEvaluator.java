public class GradeEvaluator{
    public int total = 120;
    public double score;
    //constructor for assignments
    public GradeEvaluator(int s){
        score = s;
    }
    //gives       ↓
    public void percentOfGrade(double score){
        double perc = 100*(score/total);//boring math for percent
        System.out.printf("Your percent grade is %.2f ",perc);//printf to only show first 2 decimal places of double perc
    }
    // gives     ↓
    public void grade(double score){
        double pog = score/total;//proportion of points earned to total points
        if(pog>=0.98)
        System.out.println("You got an A+");
        else if(pog>=0.95)
        System.out.println("You got an A");
        else if(pog>=0.92)
        System.out.println("You got an A-");
        else if(pog>=0.89)
        System.out.println("You got an B+");
        else if(pog>=0.86)
        System.out.println("You got an B");
        else if(pog>=0.82)
        System.out.println("You got an B-");//i didn't put any scope bc it's doing one thing per statement
        else if(pog>=0.80)
        System.out.println("You got an C+");
        else if(pog>=0.77)
        System.out.println("You got an C");
        else if(pog>=0.74)
        System.out.println("You got an C-");
        else if(pog>=0.71)
        System.out.println("You got an D+");
        else if(pog>=0.68)
        System.out.println("You got an D");
        else if(pog>=0.65)
        System.out.println("You got an D-");
        else
        System.out.println("You got an F");
    }
    public static void main(String[] args){
        GradeEvaluator assignmentA1 = new GradeEvaluator(118);//0.98333333333333333333333333333333333333333333333333333333 A+
        GradeEvaluator assignmentA2 = new GradeEvaluator(117);//0.975                                                       A
        GradeEvaluator assignmentA3 = new GradeEvaluator(112);//0.91666666666666666666666666666666666666666666666666666666 A-
        GradeEvaluator assignmentB1 = new GradeEvaluator(109);//0.90833333333333333333333333333333333333333333333333333333 B+
        GradeEvaluator assignmentB2 = new GradeEvaluator(105);//0.875                                                      B
        GradeEvaluator assignmentB3 = new GradeEvaluator(100);//0.83333333333333333333333333333333333333333333333333333333 B-
        GradeEvaluator assignmentC1 = new GradeEvaluator(98); //0.81666666666666666666666666666666666666666666666666666666 C+
        GradeEvaluator assignmentC2 = new GradeEvaluator(95); //0.79166666666666666666666666666666666666666666666666666666 C
        GradeEvaluator assignmentC3 = new GradeEvaluator(92); //0.76666666666666666666666666666666666666666666666666666666 C-
        GradeEvaluator assignmentD1 = new GradeEvaluator(87); //0.725                                                      D+
        GradeEvaluator assignmentD2 = new GradeEvaluator(85); //0.70833333333333333333333333333333333333333333333333333333 D
        GradeEvaluator assignmentD3 = new GradeEvaluator(81); //0.675                                                      D-
        GradeEvaluator assignmentF = new GradeEvaluator(75);  //0.625                                                      F
        //Testing for every possible if statement value ↑ actually evaluating those values using methods ↓
        assignmentA1.percentOfGrade(assignmentA1.score);
        assignmentA1.grade(assignmentA1.score);
        assignmentA2.percentOfGrade(assignmentA2.score);
        assignmentA2.grade(assignmentA2.score);
        assignmentA3.percentOfGrade(assignmentA3.score);
        assignmentA3.grade(assignmentA3.score);
        assignmentB1.percentOfGrade(assignmentB1.score);
        assignmentB1.grade(assignmentB1.score);
        assignmentB2.percentOfGrade(assignmentB2.score);
        assignmentB2.grade(assignmentB2.score);
        assignmentB3.percentOfGrade(assignmentB3.score);
        assignmentB3.grade(assignmentB3.score);
        assignmentC1.percentOfGrade(assignmentC1.score);
        assignmentC1.grade(assignmentC1.score);
        assignmentC2.percentOfGrade(assignmentC2.score);
        assignmentC2.grade(assignmentC2.score);
        assignmentC3.percentOfGrade(assignmentC3.score);
        assignmentC3.grade(assignmentC3.score);
        assignmentD1.percentOfGrade(assignmentD1.score);
        assignmentD1.grade(assignmentD1.score);
        assignmentD2.percentOfGrade(assignmentD2.score);
        assignmentD2.grade(assignmentD2.score);
        assignmentD3.percentOfGrade(assignmentD3.score);
        assignmentD3.grade(assignmentD3.score);
        assignmentF.percentOfGrade(assignmentF.score);
        assignmentF.grade(assignmentF.score);
    }
}