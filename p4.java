//Check no from 0 to 5 and print its spelling

class Demo {

    public static void main(String args[]){

        int var = 5;

        if(var > 5){
            System.out.println(var +"is greater than 5");
        }else if(var < 0){
            System.out.println(var +"is smaller than zero");
        }else if(var == 0){
            System.out.println("Zero");
        }else if(var == 1){
            System.out.println("One");
        }else if(var == 2){
            System.out.println("Two");
        }else if(var == 3){
            System.out.println("Three");
        }else if(var == 4){
            System.out.println("Four");
        }else if(var == 5){
            System.out.println("Five");
        }
    }
}