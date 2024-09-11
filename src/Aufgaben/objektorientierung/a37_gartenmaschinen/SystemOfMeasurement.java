package aufgaben.objektorientierung.a37_gartenmaschinen;

public class SystemOfMeasurement {

    String system;
    String distance;
    String weight;
    String volume;
    String volumeFluids;

    public SystemOfMeasurement(String system) {
        setSystem(system);

    }


    public void setUnitsToSystem() {
        switch (system) {
            case "metric":
        }
    }



    //Getter & Setter

    public void setAllUnits(String distance, String weight, String volume, String volumeFluids){
        setDistance(distance);
        setWeight(weight);
        setVolume(volume);
        setVolumeFluids(volumeFluids);
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system.toLowerCase();
    }


    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance.toLowerCase();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight.toLowerCase();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume.toLowerCase();
    }

    public String getVolumeFluids() {
        return volumeFluids;
    }

    public void setVolumeFluids(String volumeFluids) {
        this.volumeFluids = volumeFluids.toLowerCase();
    }
}
