import java.util.Stack;
class greaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long>st=new Stack<>();
        long ans[]=new long[n];
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && arr[i]>st.peek())
            {
                st.pop();
                
            }
            if (st.isEmpty()) {
                ans[i]=-1;
            }else {
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    } 
    public static void main(String[] args) {
        long a[]={6,8,0,1,3};
        long ans[]=nextLargerElement(a, 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
