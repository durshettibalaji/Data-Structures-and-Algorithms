// don't change the name of this class
// you can add inner classes if needed
class permutation {
    public static void main (String[] args) {
      //  Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
       // int k=sc.nextInt();
        System.out.println(get(3,5));
    }

    static String get(int n,int k)
    {  int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;
        for (int i = 1; i < k; i++) {
            nextPerm(arr);
        }
        StringBuffer sb = new StringBuffer();
        for (int i : arr) {
            sb.append(i + "");
        }
        return sb.toString();
    }
    public static void nextPerm(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i] < arr[i - 1]) {
            i--;
        }
        int idx = i - 1;
        int j = i;
        while (j < arr.length && arr[j] > arr[idx]) {
            j++;
        }
        j--;
        int temp = arr[idx];
        arr[idx] = arr[j];
        arr[j] = temp;
        idx++;
        j = arr.length - 1;
        while (idx < j) {
            temp = arr[idx];
            arr[idx] = arr[j];
            arr[j] = temp;
            idx++;
            j--;
        }
    }
}