// Created By Keira Coughanour with help from Kim Gross
class card {
 String suit; 
 	int value; 
  	public card(String suit,int value){ // this creates a value for the cards
      this.suit= suit;
      this.value= value;
    }
  public String toString(){// setting card value/ points for the card suite
    String cardPrint="";
    if (value<11){
      cardPrint=value+" of "+suit;
    }else{
      if (value==11){
        cardPrint="Jack of "+suit;// sets Jacks value to 11
      }
      if (value==12){
        cardPrint="Queen of "+suit;// sets Queens value to 12
      }
      if (value==13){
        cardPrint="King of "+suit;// sets Kings value to 13
      }
      if (value==14){
        cardPrint="Ace of "+suit;// sets Aces to 14 points
      }
    }
  return cardPrint;
  }
 public int getValue(){
 if (value==12){
   return -5; // changes the queens point value by making it -5
 }
   return value;
 }
}

  
  
