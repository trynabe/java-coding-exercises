public class ButterBall extends Sphere implements Comparable<Object3D>, Meltable {

    public ButterBall(String _name, double _radius) {
        super(_name, Material.Butter, _radius);
    }

    public int compareTo(Object3D o) {
        int cmp = Double.compare(this.getSurface(), o.getSurface());
        if (cmp != 0) return cmp;
        return this.getName().compareTo(o.getName());
    }

    public Object3D convertToOtherShape() {
        // หา edge จาก volume = edge^3  =>  edge = cbrt(volume)
        double edge = Math.cbrt(this.getVolume());
        return new Cube(this.getName(), this.getMaterial(), edge);
    }
}