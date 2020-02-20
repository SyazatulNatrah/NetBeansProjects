/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.*;
public class Project1 {

  static Scanner scan = new Scanner(System.in);
    private static int chooseList;
    public static int [] lists = new int[10];

    private static void display(int[] lists, int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   //public static String[] Name = new String[10];
     String[] Name = {"Oxford Dictionary: RM54.90","Children - Books: RM12.90","Cookbook: RM10.00","Comics: RM5.00","Novel: RM19.90","Calculator: RM55.00","Set of Stationery: RM5.00","Type of paper (A2/A3/A4/A5): RM9.00","Religion (180 Prayers): RM 15.00","100 Essays: RM6.90"};
     String[] listName = new String[Name.length];
     
    public static void main(String[] args) {
        
   int count=0; 
    int choice;
    
   do { 
   menu();
   System.out.print("Choose operation do you want : ");
   choice = scan.nextInt();
   if (choice==6){ 
    	System.out.println("Thank you, please come again."); 
                 break;
    }
   
      else
   count=processChoice(lists,choice,count);

   } while (choice!=0);
   
  price();
  //naming();
  outputPrice(lists);
      
    }
static void menu(){
  System.out.println("**");
             System.out.println("WELCOME TO BOOKSELLERS ONLINE");
             System.out.println("Grap it now with the best offers !");
             System.out.println("**");
             System.out.println("1. Add Order");
             System.out.println("2. Delete Order");
             System.out.println("3. Search Order");
             System.out.println("4. Display Order");
             System.out.println("5. Edit Order");
             System.out.println("6. Exit");
                 
}


static int processChoice(int [] lists,int choice,int count){
 switch(choice){
  case 1: count=addOrder(lists,count); break;
  case 2: count=deleteOrder(lists,count); break;
  case 3: search(lists,count); break;
  case 4: display(lists,count); break;  
  case 5: editOrder(lists,count); break;
  default: System.out.println("Sorry your choice is not in the list. Please choose again.");
  }
  return count;
}

static void search(int [] lists,int count){
  int nom;
  boolean found=false;
  if (count==0)
    System.out.println("Sorry list is empty.");
  else {
    System.out.print("What value you want to search? :");
    nom=scan.nextInt();
    for (int i=0; i<count;i++){
     if (lists[i]==nom){
      found=true;
      System.out.println("Your search value is at index "+i+" in the list.");
      break;
     }
    }
    if (found==false)
     System.out.println("Sorry, invalid");
   }    
  }

static void display(int lists[],int count, String[] listName){
     if (count==0)
          System.out.println("Sorry list is empty.");
     else
      for (int i= 0; i<count;i++)
        System.out.println(" Item "+(i+1)+":"+ listName[i]);  
}

static void editOrder(int [] lists,int count){
  int num;
  boolean found =false;
  if (count==0)
         System.out.println("Sorry list is empty.");
     else {
    System.out.print("What value you want to edit?:");
    num=scan.nextInt();
    for (int i=0; i<count;i++){
     if (lists[i]==num){
          System.out.print("What is your new value?:");
          num=scan.nextInt();
          lists[i]=num;
          found=true;
          break;
          }
        }
        if (found==false)
         System.out.println("Sorry, item you are looking for is not in the list.");
   }    
  }

static int addOrder(int[] lists, int count){
    double price = 0;
     double oxford = 50.00, children = 12.00, cookbook = 10.00, comics = 5.00, novel = 19.90, calculator = 55.00, stationery = 5.00, paper = 9.00;
        int typeBook = 0;
    if (typeBook == 1){
        System.out.println("Oxford Dictionary: RM50.00");
        price = price + oxford;
    }
    else if (typeBook == 2){
         System.out.println("Children - Books: RM12.00");
         price = price + children;
    }
    else if (typeBook == 3){
         System.out.println("Cookbook: RM10.00");
         price = price + cookbook;
    }
    else if (typeBook == 4){
        System.out.println("Comics: RM5.00");
        price = price + comics;
    }
    else if (typeBook == 5){
         System.out.println("Novel: RM19.90");
         price = price + novel;
    }
    else if (typeBook == 6){
        System.out.println("Calculator: RM55.00");
        price = price + calculator;
    }
    else if (typeBook == 7){
        System.out.println("Set of Stationery: RM5.00");
        price = price + stationery;
    }
    else if (typeBook == 8){
         System.out.println("Type of paper (A2/A3/A4/A5): RM9.00");
         price = price + paper;
    }
    else{
        System.out.println("Your order is not in the list");
    }
     
  if (count < lists.length){ 
      
            System.out.println("1. Oxford Dictionary: RM50");
            System.out.println("2. Children - Books: RM12");
            System.out.println("3. Cookbook: RM10");
            System.out.println("4. Comics: RM5");
            System.out.println("5. Novel: RM19");
            System.out.println("6. Calculator: RM55");
            System.out.println("7. Set of Stationery: RM5");
            System.out.println("8. Type of paper (A2/A3/A4/A5): RM9");
            System.out.println("Please choose your preferred things you want to buy: ");
            lists[count++]= scan.nextInt();
            
  }
  else
    System.out.println("Items that you ordered out of stock.");
  return count; 
}

static int deleteOrder(int [] lists,int count){
   int i,boughtList,num;
   int total=count;
   boolean delete=false; // sebb dia false so dia boolean
   if (total==0)
     System.out.println("Sorry list is empty.");
  else {
  System.out.print("Ordered that you want to be deleted?:");
  num=scan.nextInt();
  for ( i=0; i<total;i++)
     if (lists[i]==num){
        for(boughtList=i;boughtList<count-1;boughtList++)
           lists[boughtList]=lists[boughtList+1];
         --total;
         delete=true;
      break;
      }
    }
   if (delete==false)
   System.out.println("Sorry the number is not in the list.");
   return total;

}
   public static void price(){ //Method to allocate all price to array
		lists[0]= 50; //Oxford Dictionary
		lists[1]= 12; //Children - Books
		lists[2]= 10; //Cookbook
		lists[3]= 5; //Comics
		lists[4]= 19; //Novel
		lists[5]= 55; //Calculator
		lists[6]= 5; //Set of Stationery
		lists[7]= 9; //Type of paper (A2/A3/A4/A5)
		lists[8]= 15; //Religion (180 Prayers)
		lists[9]= 7; //100 Essays
                
   /*}
   public static void naming(){ //Method to allocate all name to array
		Name[0]= "Oxford Dictionary: RM54.90";
		Name[1]= "Children - Books: RM12.90";
		Name[2]= "Cookbook: RM10.00";
		Name[3]= "Comics: RM5.00";
		Name[4]= "Novel: RM19.90";
		Name[5]= "Calculator: RM55.00";
		Name[6]= "Set of Stationery: RM5.00";
		Name[7]= "Type of paper (A2/A3/A4/A5): RM9.00";
		Name[8]= "Religion (180 Prayers): RM 15.00";
		Name[9]= "100 Essays: RM6.90";*/
                
   }           
    public static void outputPrice(int [] lists )
   {
    
                double totalPrice=0,pay;
                
        Object[] price = {50.00,12.00,10.00,5.00,19.90,55.00,5.00,9.00};
                
			System.out.printf("%nGrand total: %.2f%n",price);
                        System.out.print("Please enter amount tendered: RM ");
			pay=scan.nextDouble();
			while(pay<totalPrice){ //Correction if payment not enough
			System.out.println("Not enough payment");
			System.out.print("Please enter amount tendered: RM ");
			pay=scan.nextDouble();
			}
			System.out.printf("%n Your Bill:%n****%n"); //Display summary of bills
			System.out.printf("%-25s%-3s%.2f%n","Total price ","RM",totalPrice);
			System.out.printf("%-25s%-3s%.2f%n","Amount tendered ","RM",pay);
			System.out.printf("%-25s%-3s%.2f","Balance ","RM",pay-totalPrice);
                                                   System.out.println("END OF ITEM LIST");
                                                   System.out.println("**");
                                                   
   }
}