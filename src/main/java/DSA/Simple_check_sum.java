package DSA;

import java.util.Arrays;

public static int sum(int[]ar){int sum=0;

for(int i=0;i<ar.length;i++){sum=sum+ar[i];}

if(sum==18){System.out.println(sum);}

else{System.out.println("not valid");}

return sum;}

public static void main(String[]args){

int[]ar={1,2,3,4,5,6,7,8,9,10,11,17};

sum(ar);}
