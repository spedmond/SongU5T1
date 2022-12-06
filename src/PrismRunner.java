public class PrismRunner {
    public static void main(String[] args) {
        Prism prism = new Prism(5, 6, 10);
        System.out.println(prism.dimensions());


// test volume and surfaceArea methods
        int vol = prism.volume();
        int surfaceArea = prism.surfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);


// test setter methods
        prism.setLength(8);
        prism.setWidth(15);
        prism.setHeight(20);
        System.out.println(prism.dimensions());


// retest volume and surfaceArea methods after setting new dimensions
        vol = prism.volume();
        surfaceArea = prism.surfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);

    }
}
