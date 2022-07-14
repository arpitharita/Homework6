package java_prectice;

//Make your 10th and 12th marksheets on your own. “BE CREATIVE”  All marks in your marksheets has to be in form of variables.

public class MarkSheet_12th {  //main method
   // harita patel

    public static void main(String args[]){
        String name = "HaritaPatel";

       //display all variable
        int Sub1 = 60;
        int Sub2 = 70;
        int Sub3 = 55;
        int Sub4 = 65;
        int Sub5 = 85;
        int t1 = 100;
        int r1 = 30;
        int Sub =Sub1+Sub2+Sub3+Sub4+Sub5;
        int t2 = +t1+t1+t1+t1+t1;

        System.out.println("    Gujrat bord of highersecondry exam");
        System.out.println("Student name "       +name );
        System.out.println("Roll number"        +r1);

        System.out.println("Subject             Totalmarks        Oreantedmarks ");
        System.out.println("English               "+t1+"           "+Sub1);
        System.out.println("Science               "+t1+"           "+Sub2);
        System.out.println("Chemistry             "+t1+"           "+Sub3);
        System.out.println("Biology               "+t1+"           "+Sub4);
        System.out.println("Physics               "+t1+"           "+Sub5);

        System.out.println(" Total                     "+Sub);
        System.out.println(" Total                     "+t2);


    }
}
