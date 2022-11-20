public class GUI {
    public static int calculate (int j,int p,int z) {
        for (int i=0; i < z; i++){
            if (j<=p) {
                j++;
            }
            else {
                p++;
            }
        }
        System.out.println("Ilość jabłek: " + j);
        System.out.println("Ilość pomarańczy: "+ p);
        System.out.print("Minimalna różnica: ");
        return Math.abs(j-p);
    }
}
