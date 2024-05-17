//Days in week

class Demo {

    public static void main(String[] args) {
        
        int day = 4;

        if(day <= 0 || day > 7){
            System.out.println("Invalid day");
        }
        else if(day == 1){
            System.out.println("sun");
        }
        else if(day == 2){
            System.out.println("mon");
        }
        else if(day == 3){
            System.out.println("tues");
        }
        else if(day == 4){
            System.out.println("wend");
        }
        else if(day == 5){
            System.out.println("thurs");
        }
        else if(day == 6){
            System.out.println("fri");
        }
        else if(day == 7){
            System.out.println("sat");
        }
    }
}
