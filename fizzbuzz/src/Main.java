public class Main {
    //numbers which can be divided by 3 "fizz" and numbers which can be divided by 5 "buzz"
    // should be written in the output
    public static void main(String[] args) {
        solveFizzBuzz();
    }

    public static void solveFizzBuzz(){
        for (int i = 1; i<50;i++){
            if (i%3==0){
                System.out.println("fizz");
            }if(i%5==0){
                System.out.println("buzz");
            }
            if (!(i%3==0 ||i%5==0)){
                System.out.println(i);
            }
        }
    }
}
