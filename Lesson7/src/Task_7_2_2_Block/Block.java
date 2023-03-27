public class Block {
//    public final int[] array;

    private int width;
    private int length;
    private int height;
    // Good Luck!
    public Block(int [] params){
            this.width = params[0];
            this.length = params[1];
            this.height = params[2];
    };
    int getWidth(){
        return width;
    }

    int getLength(){
        return length;
    }

    int getHeight(){
        return height;
    }

    int getVolume(){
        return width * length * height;
    }

    int getSurfaceArea(){
        return 2 * (width * length + width * height + length * height);
    }
}

