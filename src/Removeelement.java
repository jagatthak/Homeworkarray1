public class Removeelement {
    public static void main(String[] args) {
        int [] array={25,30,45,50,55,60,65,70};
        int elem = 45;
        //Moving all elements one space forward to remove desired 'elem'=45
        for(int i=0;i< array.length;i++){
            if (array[i]==elem){
                for(int j=i;j< array.length-1;j++){
                    array[j]=array[j+1];
                }
                break;
            }
        }
        //printing after removing one element 45
        System.out.println("Elements after deletion: ");
        for(int i =0;i<array.length-1;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
