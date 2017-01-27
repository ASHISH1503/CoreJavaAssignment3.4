import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Student {


	int Roll,hindi,eng; 
    String NameID; 
     Student(int p, String q, int r, int s) 
        { 
           Roll = p; 
           NameID=q; 
           hindi=r; 
           eng=s; 
        } 
            void ShowData() 
             { 
                System.out.println("Roll Number : "+Roll); 
                System.out.println("Students Name : "+NameID); 
                System.out.println("Hindi Marks : "+hindi); 
                System.out.println("English Marks : "+eng); 
             } 
 } 
        class StudentParameterizedConstructor 
          { 
             public static void main(String args[]) throws IOException 
                 { 
            	 System.out.println("Enter the details of 1st Student :");
                     BufferedReader Br =new BufferedReader(new InputStreamReader(System.in)); 
                     String read,Name; 
                     int RollNumber,Hindi,English; 
                     System.out.println("Enter Class Roll Number : "); 
                     read=Br.readLine(); 
                     RollNumber = Integer.parseInt(read); 
                     System.out.println("Enter Name of the Student : "); 
                     Name=Br.readLine(); 
                     System.out.println("Enter Hindi Marks : "); 
                     read=Br.readLine(); 
                     Hindi=Integer.parseInt(read); 
                     System.out.println("Enter English Marks : "); 
                     read=Br.readLine(); 
                     English=Integer.parseInt(read);
                     
                   System.out.println("Enter the details of 2nd Student :");   
                     BufferedReader Br2 =new BufferedReader(new InputStreamReader(System.in)); 
                     String read2,Name2; 
                     int RollNumber2,Hindi2,English2; 
                     System.out.println("Enter Class Roll Number : "); 
                     read2=Br2.readLine(); 
                     RollNumber2 = Integer.parseInt(read2); 
                     System.out.println("Enter Name of the Student : "); 
                     Name2=Br2.readLine(); 
                     System.out.println("Enter Hindi Marks : "); 
                     read2=Br2.readLine(); 
                     Hindi2=Integer.parseInt(read2); 
                     System.out.println("Enter English Marks : "); 
                     read2=Br2.readLine(); 
                     English2=Integer.parseInt(read2);
                     
                  System.out.println("Enter the details of 3rd Student :"); 
                     BufferedReader Br3 =new BufferedReader(new InputStreamReader(System.in)); 
                     String read3,Name3; 
                     int RollNumber3,Hindi3,English3; 
                     System.out.println("Enter Class Roll Number : "); 
                     read3=Br3.readLine(); 
                     RollNumber3 = Integer.parseInt(read3); 
                     System.out.println("Enter Name of the Student : "); 
                     Name3=Br3.readLine(); 
                     System.out.println("Enter Hindi Marks : "); 
                     read3=Br3.readLine(); 
                     Hindi3=Integer.parseInt(read3); 
                     System.out.println("Enter English Marks : "); 
                     read3=Br3.readLine(); 
                     English3=Integer.parseInt(read3);
                                          
                     Student std1= new Student(RollNumber,Name,Hindi,English); 
                     Student std2= new Student(RollNumber2,Name2,Hindi2,English2); 
                     Student std3= new Student(RollNumber3,Name3,Hindi3,English3);
                     System.out.println();
                     System.out.println("Details of the Student Entered are :");
                     System.out.println("Details of 1st Student :"); 
                     std1.ShowData();
                     System.out.println();
                     System.out.println("Details of 2nd Student :"); 
                     std2.ShowData();
                     System.out.println();
                     System.out.println("Details of 3nd Student :"); 
                     std3.ShowData();
                } 
         } 
