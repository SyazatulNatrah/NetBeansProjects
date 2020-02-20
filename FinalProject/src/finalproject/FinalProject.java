/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.*;
public class FinalProject {

    static Scanner scan = new Scanner(System.in);
    private static int chooseList;
    private static int[] boughtPNumber;
    private static int totalBought;
    public static void main(String[] args) {
        int [] lists = { 1, 2, 3, 4, 5, 6, 7, 8};
     double[] price = {50.00,12.00,10.00,5.00,19.90,55.00,5.00,9.00};
     int [] boughtLists = new int [lists.length];
     double[] listsPrice = new double[price.length];
    
    // store data order no, detail
   int choice; // add/edit/…
   int count=0; //delete/add kalau delete dia akan hilang 1
   do { // is a loop selagi choice xjadi 0
   menu();
   System.out.print("Your choice:"); 
   choice=scan.nextInt();
   if (choice==6){ //kalau choice 0 dia exit
    	System.out.println("Thank you, please come again."); 
                 break;
    }
   else
   count=processChoice(lists,choice,count);
   } while (choice!=0);
    }

static void menu(){
  System.out.println("******************************");
             System.out.println("WELCOME TO BOOKSELLERS ONLINE");
             System.out.println("Grap it now with the best offers !");
             System.out.println("******************************");
             System.out.println("1. Add Order");
             System.out.println("2. Delete Order");
             System.out.println("3. Search Order");
             System.out.println("4. Display Order");
             System.out.println("5. Edit Order");
             System.out.println("6. Exit");
             System.out.print("Choose operation do you want : ");
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
    System.out.print("Search value?:");
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

static void display(int lists[],int count){
     if (count==0)
          System.out.println("Sorry list is empty.");
     else
      for (int i= 0; i<count;i++)
        System.out.println(" Item "+(i+1)+":"+lists[i]);  
}

static void editOrder(int [] lists,int count){
  int nom;
  boolean found =false;
  if (count==0)
         System.out.println("Sorry list is empty.");
     else {
    System.out.print("Edit value?:");
    nom=scan.nextInt();
    for (int i=0; i<count;i++){
     if (lists[i]==nom){
          System.out.print("New value?:");
          nom=scan.nextInt();
          lists[i]=nom;
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
      
            System.out.println("1. Oxford Dictionary: RM50.00");
            System.out.println("2. Children - Books: RM12.00");
            System.out.println("3. Cookbook: RM10.00");
            System.out.println("4. Comics: RM5.00");
            System.out.println("5. Novel: RM19.90");
            System.out.println("6. Calculator: RM55.00");
            System.out.println("7. Set of Stationery: RM5.00");
            System.out.println("8. Type of paper (A2/A3/A4/A5): RM9.00");
            
            System.out.println("Please choose your preferred things you want to buy: ");
            lists[count++]= scan.nextInt();
  }
  else
    System.out.println("Items that you ordered out of stock.");
  return count; 
}

static int deleteOrder(int [] lists,int count){
   int i,j,nom;
   int bil=count;
   boolean delete=false; // sebb dia false so dia boolean
   if (bil==0)
     System.out.println("Sorry list is empty.");
  else {
  System.out.print("Ordered that you want to be deleted?:");
  nom=scan.nextInt();
  for ( i=0; i<bil;i++)
     if (lists[i]==nom){
        for(j=i;j<count-1;j++)
           lists[j]=lists[j+1];
         --bil;
         delete=true;
      break;
      }
    }
   if (delete==false)
   System.out.println("Sorry the number is not in the list.");
   return bil;
   
    }
   public static void star(int x)
   {
      for (int i=0; i<50; i++)
      {
       System.out.print(x);
      }
       System.out.println();
       
   }
       public static void outputPrice(int[] boughtLists, double[] listsPrice)
   {
       double totalPrice=0, pay;
      for (int i=0; i<totalBought; i++){
        totalPrice = totalPrice + listsPrice[i];
      }
        Object[] price = {50.00,12.00,10.00,5.00,19.90,55.00,5.00,9.00};
			System.out.printf("%nGrand total: %.2f%n", price);
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
 
  }//end removeItem
 }//end class

