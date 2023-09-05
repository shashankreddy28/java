//*code prints sum of even numbers bw [1,10] */
class Main{
    public static void main (String[] args){
        int sum = 0;
        for (int i=0; i<11;i++){
            if (i%2==0){
                System.out.println(i);
                sum+=i;
            }
            else{
                continue;
            }

        }
        System.out.println(sum);
    }
}
