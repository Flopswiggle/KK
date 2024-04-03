public class wrapper {
    public static void main(String[] args){
        Horse horse1 =new Horse("red",2001,"big");// this says the horse's name,birth, and size
        Horse horse2 =new Horse("Sliver",2001,"Small");// this says the horse's name,birth, and size
        Horse horse3 =new Horse("Bron",2001,"medium");// this says the horse's name,birth, and size
        System.out.println(horse1);// Prints horse
        System.out.println(horse2);// Prints horse
        System.out.println(horse3);// Prints horse
        horse1.setTrait("Grumpy ");// sets in the trait of horse
        horse2.setTrait("Fast");// sets in the trait of horse
        horse3.setTrait("Tired");// sets in the trait of horse
        System.out.println(horse1+" is "+horse1.getTrait()+" size "+horse1.getSize());// This gives the horse a trait and size
        System.out.println(horse2+" is "+horse2.getTrait()+" size "+horse2.getSize());// This gives the horse a trait and size
        System.out.println(horse3+" is "+horse3.getTrait()+" size "+horse3.getSize());// This gives the horse a trait and size
        horse3.changeSize("big");// horse3 has a new size
        horse3.changeTrait("Fast");// horse3 has a new trait
        System.out.println(horse3+" is "+horse3.getTrait()+" size "+horse3.getSize());// horse3 reciving new size and trait
    }
}











