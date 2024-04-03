//Simple horse class created by Kim Gross
//for CTE Software Development class 2022
// Updated and New features by Keira Coughanour
public class Horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
   String trait; 
    String size;


    
    public Horse(String horseName, int year,String currentSize){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
        size= currentSize;
    };
    
    public void age (){
        // what should be in a age function?
    }; 
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    };
    public String toString (){
        return name;
    };    
public void setTrait(String trait){
this.trait=trait; 
}
public String getTrait(){
return trait; 
}
public String getSize(){
return size;
}
public void changeSize(String newSize){
    size=newSize;
}
public void changeTrait(String newTrait){
    trait=newTrait;
}


}









