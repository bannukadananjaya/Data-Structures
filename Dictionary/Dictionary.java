package Dictionary;

public class Dictionary {
    public final int max_val = 1000;
    private int key,val;
    
    public Dictionary(int key, int val){
        this.key = key;
        this.val = val;
    }
    public void insert(int key,int val){
        if(key < 0 || key > max_val ){
            System.out.println("Entered key is invalid");
            
        }
    }

    public void search(){

    }

    public void delete(){
        
    }
    
    public static void main(String[] args) {
        
    }
}
