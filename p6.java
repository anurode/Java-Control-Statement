//Number of days in month

class Demo {

    public static void main(String args[]) {

        int month = 12;

        if(month <= 0 || month > 12){
            System.out.println("Invalid days");
        }
        else if(month == 1){
           System.out.println("jan has 31 days");
        }
        else if(month ==2){
            System.out.println("feb has 30 days");
        }
        else if(month ==3){
            System.out.println("march has 30 days");
        }
        else if(month ==4){
            System.out.println("april has 30 days");
        }
        else if(month ==5){
            System.out.println("may has 30 days");
        }
        else if(month ==6){
            System.out.println("jun has 30 days");
        }
        else if(month ==7){
            System.out.println("july has 30 days");
        }
        else if(month ==8){
            System.out.println("augast has 30 days");
        }
        else if(month ==9){
            System.out.println("september has 30 days");
        }
        else if(month ==10){
            System.out.println("october has 30 days");
        }
        else if(month ==11){
            System.out.println("november has 30 days");
        }
        else if(month ==12){
            System.out.println("december has 30 days");
        }
    }
}