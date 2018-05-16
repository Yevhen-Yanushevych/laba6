package ua.lviv.iot;


import java.util.*;

public class Photographer {
    private String name = " no name";
    private String lastname;
    private List<Devices> devicesList;


    public Photographer() {

        this.devicesList = new LinkedList<>();
    }

    public void addDevices(final Devices addDevices) {
        devicesList.add(addDevices);
    }

    public List<Devices> sortDevicesByWeight(final List<Devices> devicesList) {
        devicesList
                .sort(Comparator.comparingInt(Devices::getWeight));
        return devicesList;

    }

    public List<Devices> findByGroup(final Kindjob kindjob) {
        List<Devices> result = new LinkedList<>();
        devicesList.stream().filter((devicesList) ->
                ((devicesList.getKindjob() == kindjob)))
                .forEachOrdered((devicesList) -> {
                    result.add(devicesList);
                });
        return result;
    }


    public final List<Devices> getDevicesList() {
        return devicesList;
    }


}
