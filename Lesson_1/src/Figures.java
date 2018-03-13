public class Figures {
    public void rectangle(int width, int height) {
        for (int i=0; i<height; i++){
            if ((i==0)||(i==height-1)){
                for (int j=0; j<width; j++){
                    System.out.print("* ");
                    }
                System.out.print("\n");
            } else {
                for (int j=1; j<width; j++) {
                    if (j==1) System.out.print("*");
                    if (j==width-1){
                        System.out.print(" *");
                        System.out.print("\n");
                    }
                    else System.out.print("  ");
                }
            }
        }
    }
    public void rightTriangle(int height) {
        if (height>1) System.out.println("*");
        for (int i=0; i<height; i++) {
            if (i<height-1) {
            for (int j=0; j<i; j++) {
                if (j==0) System.out.print("* ");
                if (j==i-1) System.out.println("*");
                else System.out.print("  ");
                }
            }
            else for (int j=0; j<height; j++){
                System.out.print("* "); 
            }
        }
    }
    public void equiTriangle(int width) {
        if (width%2==0) width+=1;
        int middle=width/2;
        int leftMiddle=middle;
        int rightMiddle=middle;
        for (int i=0; i<width/2+1; i++) {
            for (int j=0; j<width; j++) {
                if (j<leftMiddle) System.out.print("  ");
                if ((j>=leftMiddle)&&(j<=rightMiddle)) System.out.print("* ");
                if ((j>rightMiddle)&&(j<width-1)) System.out.print("  ");
                if ((j>=rightMiddle)&&(j==width-1)) System.out.println("  ");
            }
            leftMiddle--;
            rightMiddle++;
        }
    }
    public void rhombus(int width){
        if (width%2==0) width+=1;
                int middle=width/2;
                int leftMiddle=middle;
                int rightMiddle=middle;
                int leftBorder=1;
                int rightBorder=width-2;
                for (int k=0; k<width/2+1; k++) {
                    for (int j=0; j<width; j++) {
                        if (j<leftMiddle) System.out.print("  ");
                        if ((j>=leftMiddle)&&(j<=rightMiddle))
                            System.out.print("* ");
                        if ((j>rightMiddle)&&(j<width-1))
                            System.out.print("  ");
                        if ((j>=rightMiddle)&&(j==width-1))
                            System.out.println("  ");
                        }
                    leftMiddle--;
                    rightMiddle++;
                    }
                for (int k=0; k<width/2; k++){
                    for (int j=0; j<width; j++) {
                        if (j<leftBorder) System.out.print("  ");
                        if ((j>=leftBorder)&&(j<=rightBorder)) 
                            System.out.print("* ");
                        if ((j>rightBorder)&&(j<width-1)) 
                            System.out.print("  ");
                        if ((j>=rightBorder)&&(j==width-1)) 
                            System.out.println("  ");
                    }
                    leftBorder++;
                    rightBorder--;
                }
              
    }
}
