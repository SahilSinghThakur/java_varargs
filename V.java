class V{
    static void pro(int[]... c){ // it is treated as a 2D array so it requires single 2D array 

    }
    public static void main(String[] args) {
        int[][] x = {{12},{2}};
        int[][] y = {{12},{2}};
        pro(x,y);
    }
}