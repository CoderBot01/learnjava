//break and continue in for
public class breakcontinue {
    public static void main(String[] args){

        for (int i = 0; i < 10; i++){
            
            if(i==4){
                continue;//skip the 4
            }
            System.out.println(i);
        }
         for (int i = 0; i < 10; i++){
            
            if(i==4){
                break;//break the loop if 4
            }
            System.out.println(i);
        }
        
        
    }
    
}
