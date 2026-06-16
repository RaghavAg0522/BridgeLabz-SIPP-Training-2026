public class VolumeOfEarth {
    static void main(String[] args) {
        int EarthRadius=6378;
        double RadiusMiles=6378/1.6;
        double volumeKm = (4.0/3.0) * (3.14) * Math.pow(EarthRadius,3);
        double volumeMiles= (4.0/3.0) * (3.14) * Math.pow(RadiusMiles,3);
        System.out.println(" The volume of earth in cubic kilometers is "+volumeKm+ " and cubic miles is  "+volumeMiles);
    }

}
