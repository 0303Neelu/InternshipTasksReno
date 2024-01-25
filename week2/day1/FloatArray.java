public class FloatArray{
    public static void main(String[] args) {
        float[] nums = {3.1f,4.5f,6.4f,7.3f,9.2f};
        float sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        System.out.println("The sum is = "+sum);
    }
}