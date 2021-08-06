package Model;

public class PhongBan {
    private int maPb;
    private String tenPb;
    public PhongBan(int maPb, String tenPb) {
        this.maPb = maPb;
        this.tenPb = tenPb;
    }

    public int getMaPb() {
        return maPb;
    }

    public void setMaPb(int maPb) {
        this.maPb = maPb;
    }

    public String getTenPb() {
        return tenPb;
    }

    public void setTenPb(String tenPb) {
        this.tenPb = tenPb;
    }

    @Override
    public String toString() {
        return "phongban{" +
                "maPb=" + maPb +
                ", tenPb='" + tenPb + '\'' +
                '}';
    }

}