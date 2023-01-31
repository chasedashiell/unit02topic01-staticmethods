public class Solutions {

    public static int max3(int a, int b, int c){
        int result;
        if (a == c && a == b){
            System.out.println("They are all equal");
            result = a;
        }else if (a > b && a > c){
            result = a;
        } else if(b > a && b > c){
            result = c;
        } else {
            result = c;
        }
        return result;
    }

    public static boolean odd(boolean a, boolean b, boolean c){
        boolean result;
        int numEvens = 0; 
        if (a){
            numEvens += 1;
        }
        if (b){
            numEvens +=1;
        }
        if (c){
            numEvens += 1;
        }
        if (numEvens % 2 == 0){
            result = false;
        } else{
            result = true;
        }

        return result;
    }    

    public static boolean majority(boolean a, boolean b, boolean c){
        int numTrue = 0;;

        if (a){
            numTrue += 1;
        }
        if (b){
            numTrue += 1;
        }
        if (c){
            numTrue += 1;
        }

        if (numTrue >= 2){
            return true;
        }else {
            return false;
        }
    }

    public static double trigIdentity(double x){
        double result = Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(Solutions.max3(-2, -2, -2));
        System.out.println(odd(true, true, true));
        System.out.println(majority(false, false, false));
        System.out.println(trigIdentity(9.99));
    }
}