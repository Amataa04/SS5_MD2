package baitapRikkei.bai2;

public class point3d extends point2d{
    private float z;

    public point3d() {
        super();
        this.z = 0.0f;
    }

    public point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "point3d{" + getX() + ", " + getY() + ", " + z + "}";
    }
}
