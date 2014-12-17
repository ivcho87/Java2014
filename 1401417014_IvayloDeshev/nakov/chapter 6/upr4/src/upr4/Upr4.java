package upr4;
public class Upr4 {

     public static void main(String[] args) {
        for (int i=2; i<=14; i++) {
            String m = "";
            switch(i) {
                case 11: m="Вале "; break;
                case 12: m="Дама "; break;
                case 13: m="Поп "; break;
                case 14: m="Асo "; break;
                default: m=Integer.toString(i);
            }
            for (int r=1; r<=4; r++) {
                switch(r) {
                    case 1: System.out.print(m + " Спатия; "); break;
                    case 2: System.out.print(m + " Каро; "); break;
                    case 3: System.out.print(m + " Купа; "); break;
                    case 4: System.out.print(m + " Пика; "); break;
                } 
            }
            System.out.println();
        }
        
    }
    
}
