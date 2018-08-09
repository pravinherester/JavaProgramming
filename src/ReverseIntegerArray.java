
public class ReverseIntegerArray {
public static void main(String[] args) {
    int a[]={5,3,2,13,3,3,1,8};
    for(int i=0;i<a.length/2;i++)
    {
        int temp=a[i];
        a[i]=a[a.length-1 -i];
        a[a.length-1-i]=temp;
    }
    for(int i =0;i <a.length;i++){
        System.out.println(a[i]);
    }
}
}
