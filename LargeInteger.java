public class LargeInteger{
    int max=0;
    public static void main(String[] args) {
        try {
            int max=Integer.parseInt(args[0]);
            for(int i=1;i<args.length;i++){
                if(Integer.parseInt(args[i])>max)
                    max=Integer.parseInt(args[i]);
            }
            System.out.println("Largest number is "+max);
        } catch (Exception e) {
            System.out.println("Invalid Input"+e.getMessage());
        }
    }
}