public class DemoArray2{

    public static void main(String[] args){
        //Contoh program pencarian

        String names[] = {"ADI","AJI","ABBI","ABDUL","HASIF"};
        String searchName = "ABBI";
        boolean foundName = false;
        for(int i=0; i<names.length; i++){
            if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }

        if (foundName) {
            System.out.println(searchName = " found !");
        
        }else {
            System.out.println(searchName + " not found.");
        }
    }
}