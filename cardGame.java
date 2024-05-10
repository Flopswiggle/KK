import java.util.*;
class cardGame {// creates the file card game
  
  public static void main(String[] args) {
  int player1sPoint=0;// sets player1s points to 0 
  int player2sPoint=0;// sets player2s points to 0 
  int player3sPoint=0;// sets player3s points to 0  
  int player4sPoint=0;// sets player4s points to 0 
  int player5sPoint=0;// sets player5s points to 0
    
    
  ArrayList<card> deck=new ArrayList();// creates cards arraylist along with the whole deck
  ArrayList<card> player1=new ArrayList();// creates the cards for player1 along with creating player1
  ArrayList<card> player2=new ArrayList();// creates the cards for player2 along with creating player2
  ArrayList<card> player3=new ArrayList();// creates the cards for player3 along with creating player3
  ArrayList<card> player4=new ArrayList();// creates the cards for player4 along with creating player4
  ArrayList<card> player5=new ArrayList(); // creates the cards for player5 along with creating player5
    card temp;
  for(int x=2;x<15;x++){
    temp=new card("Spades ",x);// creates the suite along with the amount of cards it has this one is Spades
    deck.add(temp);
  }
   for(int x=2;x<15;x++){
    temp=new card("Diamonds ",x);// creates the suite along with the amount of cards it has this one is Diamonds
    deck.add(temp);
  }for(int x=2;x<15;x++){
    temp=new card("Hearts ",x);// creates the suite along with the amount of cards it has this one is Hearts
    deck.add(temp);
  }
    for(int x=2;x<15;x++){
    temp=new card("Clubs ",x);// creates the suite along with the amount of cards it has this one it Clubs
    deck.add(temp);
  }
 for (int x=0;x<deck.size();x++){
   System.out.println(deck.get(x));// sets the deck amount to 0 
 }
  Collections.shuffle(deck);
    for (int x=0;x<deck.size();x++){// shuffles the deck at random
   System.out.println(deck.get(x));
 }
   for (int x=0;x<5;x++){
     player1.add(deck.get(0));
     player1sPoint+=player1.get(x).getValue();
     deck.remove(0);// gives Player1s cards and set them to 0
   player2.add(deck.get(0));
    player2sPoint+=player2.get(x).getValue();
     deck.remove(0);// gives Player2s cards and sets them to 0
   player3.add(deck.get(0));
   player3sPoint+=player3.get(x).getValue();
     deck.remove(0);// gives Player3s cards and sets them to 0
   player4.add(deck.get(0));
     player4sPoint+=player4.get(x).getValue();
     deck.remove(0);// gives Player4s cards and sets them to 0
  player5.add(deck.get(0));
     player5sPoint+=player5.get(x).getValue();
     deck.remove(0);// gives Player5s cards and sets them to 0
   } 
    System.out.println();
   System.out.println("player1 hand's value is "+player1sPoint);
    for (int x=0;x<player1.size();x++){
     System.out.println(player1.get(x));// this will count up player1s points and tell their hand value of cards
   } 
    System.out.println();
       System.out.println("player2 hand's value is "+player2sPoint);
    for (int x=0;x<player2.size();x++){
     System.out.println(player2.get(x));// this will count up player2s points and tell their hand value of cards
   
   } 
    System.out.println();
       System.out.println("player3 hand's value is "+player3sPoint);
    for (int x=0;x<player3.size();x++){
     System.out.println(player3.get(x));// this will count up player3s points and tell their hand value of cards
   } 
    System.out.println();
       System.out.println("player4 hand's value is "+player4sPoint);
    for (int x=0;x<player4.size();x++){
     System.out.println(player4.get(x));// this will count up player4s points and tell their hand value of cards
   } 
    System.out.println();
     System.out.println("player5 hand's value is "+player5sPoint);
    for (int x=0;x<player5.size();x++){
     System.out.println(player5.get(x));// this will count up player5s points and tell their hand value of cards
   } 
 int numberOfWinners=0;// sets the winners to 0
    
    if((player1sPoint>=player2sPoint)&(player1sPoint>=player3sPoint)&(player1sPoint>=player4sPoint)&(player1sPoint>=player5sPoint)) {
   System.out.println("Player one wins with "+player1sPoint+" points");
 	numberOfWinners++;// creates the probability of Player1 to win 
    }
   
 if((player2sPoint>=player1sPoint)&(player2sPoint>=player3sPoint)&(player2sPoint>=player4sPoint)&(player2sPoint>=player5sPoint)) {
   System.out.println("Player two wins with "+player2sPoint+" points");
	 numberOfWinners++;// creates the probability of Player2 to win 
 }
   
 if((player3sPoint>=player1sPoint)&(player3sPoint>=player2sPoint)&(player3sPoint>=player4sPoint)&(player3sPoint>=player5sPoint)) {
   System.out.println("Player three wins with "+player3sPoint+" points");
 	numberOfWinners++;// creates the probability of Player3 to win 
 }
  if((player4sPoint>=player1sPoint)&(player4sPoint>=player2sPoint)&(player4sPoint>=player3sPoint)&(player4sPoint>=player5sPoint)) {
   System.out.println("Player four wins with "+player4sPoint+" points");
 	numberOfWinners++;// creates the probability of Player4 to win 
  } 
  if((player5sPoint>=player1sPoint)&(player5sPoint>=player2sPoint)&(player5sPoint>=player3sPoint)&(player5sPoint>=player4sPoint)) {
   System.out.println("Player five wins with "+player5sPoint+" points");
 	numberOfWinners++;// creates the probability of Player5 to win 
  } 
  if (numberOfWinners>1){
    System.out.println(" It's a tie! "+numberOfWinners+" players tied");// creates the message of any players ending up to tie
  }
  }
}
