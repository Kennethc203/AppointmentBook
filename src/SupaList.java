public class SupaList {
    public boolean[][] notSupaList = new boolean[8][60];
    public boolean[][] getList(){
        return notSupaList;
    }
    public void setList(int hour, int minute, boolean value) {
        notSupaList[hour][minute] = value;
    }
    public SupaList(){
        System.out.println("hi");
    }
}

