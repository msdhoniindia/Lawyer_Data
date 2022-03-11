
public class Main
{
	public static void main(String[] args) {

        int arr[]={17,5,13,8,16,1,2};
        int max=0;
        for(int i=arr.length-1;i>=0;i--){
           
            if(arr[i]>max){
                  max=arr[i];
                  System.out.println(max);
             }
    
        }
	}
}
