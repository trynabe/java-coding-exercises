public class WallPaperUnit {
    private String name;
    private double length;

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static void main(String[] args) {
        WallPaperUnit unit1 = new WallPaperUnit();

        unit1.setName("Sqrvn");
        unit1.setLength(172);
        
        System.out.println("Wallpaper name: " + unit1.getName());
        System.out.println("Wallpaper length: " + unit1.getLength());
    }
}