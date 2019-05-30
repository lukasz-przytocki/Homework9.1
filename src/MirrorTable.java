import java.util.Random;

public class MirrorTable {
    public static void main(String[] args) {
        Random random = new Random();
        int[] table = new int[10];

        for (int i = 0; i <table.length; i++) {
            table[i] = random.nextInt(100);
            System.out.printf("%d ",table[i]);
        }
        System.out.println();
        for (int i = 0; i <2*table.length ; i++) {
            if(i<table.length){
                System.out.printf("%d ",table[i]);
            }else{
                System.out.printf("%d ", table[2*table.length-i-1]);
            }
        }
    }
}

