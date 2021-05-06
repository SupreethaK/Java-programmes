class ReverseString {
    public static void main(String[] args)
    {
        String input = "Excitment";
 
        
        char[] ref = input.toCharArray();
 
        for (int i = ref.length-1 ; i >= 0; i--){

            System.out.print(ref[i]);
        }
    }
}