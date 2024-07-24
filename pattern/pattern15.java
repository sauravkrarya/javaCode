public class pattern15 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=9;i++){
            for(j=9;j>=i;j--){
                
                System.out.print((char)(74-j)+" ");
            }
            System.out.println();
        }
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
    }
   
      
    
}
}

