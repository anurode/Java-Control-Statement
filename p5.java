//Pythagoran triplet

class Demo {

    public static void main (String args[]){

        int a=3,b=4,c=5;

        if(a*a == b*b+c*c ||b*b == c*c+a*a ||c*c ==a*a+b*b){
            System.out.println("It's a pythagoran triplet");
        }else{
            System.out.println("Not a pythagoran triplet");
        }
    }
}