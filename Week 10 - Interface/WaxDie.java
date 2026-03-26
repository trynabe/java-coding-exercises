public class WaxDie extends Cube implements Comparable<Object3D>, Meltable {

    public WaxDie(String _name, double _edge) {
        super(_name, Material.Wax, _edge);
    }

    public int compareTo(Object3D o) {
        int cmp = Double.compare(this.getVolume(), o.getVolume());
        if (cmp != 0) return cmp;
        return this.getName().compareTo(o.getName());
    }

    public Object3D convertToOtherShape() {
        // หา radius จาก volume = (4/3) * PI * r^3  =>  r = cbrt(volume * 3 / (4 * PI))
        double r = Math.cbrt(this.getVolume() * 3.0 / (4.0 * PI));
        return new Sphere(this.getName(), this.getMaterial(), r);
    }
}
