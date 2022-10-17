package newtoneSchool;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr={13,7,6,12};

        for(int i=0;i< arr.length;i++)
        {
            boolean flag=true;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j]) {
                    flag = false;
                    System.out.println(arr[j]);
                    break;
                }
            }
            if(flag==true)
                System.out.println(-1);
        }
    }
}
