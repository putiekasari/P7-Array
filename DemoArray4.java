import java.text.NumberFormat;

public class DemoArray4 {

    public static void main(String args[]) {
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        int nilai[][]=new int[2][3];
        nilai[0][0]=85;
        nilai[0][1]=82;
        nilai[0][2]=78;
        nilai[1][0]=65;
        nilai[1][1]=73;
        nilai[1][2]=71;

        String MK[]={"[Pemrograman 2\t", "Konsep basis data"};
        double ratarataMK[]=new double[nilai.length];

        for(int i=0; i<nilai.length; i++) {    
             for(int j=0; j<nilai[0].length; j++) {
        }
             ratarataMK[1]/=nilai[0].length;
        }
        System.out.println("Nilai matakuliah\n");
        System.out.println("Mata Kuliah\t\tMinggu1\tMinggu2\tMinggu3\tratarata");

        for(int i=0; i<nilai.length; i++) { 
            System.out.println(MK[i] + "\t");
            for(int j=0; j<nilai[0].length; j++) {
                System.out.println(nilai[i][j] + "\t");
            }
            System.out.println(nf.format(ratarataMK[i])+"\n");
        }

    }
}