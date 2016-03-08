package module3.task3;

import java.util.List;

public class MusicStore {

    protected List<Instrument> instruments;

    protected List accessories; // accessories for musical instruments

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List getAccessories() {
        return accessories;
    }

    public void setAccessories(List accessories) {
        this.accessories = accessories;
    }
}
