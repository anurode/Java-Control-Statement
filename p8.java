//Calculate profit or loss

class Demo{

    public static void main(String args[]){

    int sp = 1200;
    int cp = 100;
    
    if(sp > cp){
        System.out.println("profit is" +(sp - cp));
    }
    else if(cp > sp){
        System.out.println("loss is" +(cp - sp));
    }
    else if(sp == cp){
        System.out.println("no profit or loss");
    }
    }
}
