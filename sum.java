//Linear Search 
class sum{
    static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,21,0};
        int target= 0;

        int result=linearSearch(arr,target);

        if(result==-1){
            System.out.println("Element not found");
        }
        System.out.println("Element Found at" + (result + 1));      
    }
}
