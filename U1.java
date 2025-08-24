class U1{
    static void pro(String[][]... x){
        for(String[][] next : x){
            for(String name[] : next){
                for(String n:name)
                 System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        String[][] x= {{"UV","MSD","VK"},{"KK","ST"}};
        String[][] y= {{"UUV","MSSD","VSK"},{"KLLK","SSST"}};
        String[][] z= {{"UUV","MSSD","VSK"},{"KLLK","SSST"}};
        pro(x,y,z);
    }
}