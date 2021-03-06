package com.pimpimmobile.librealarm.shareddata;

import java.text.DecimalFormat;

public class GlucoseData implements Comparable<GlucoseData> {

    public long realDate;
    public String sensorId;
    public long sensorTime;
    public int glucoseLevel = -1;
    public long phoneDatabaseId;

    public GlucoseData(){}

    public String mmolGlucose() {
        return new DecimalFormat("##.0").format(glucoseLevel/18f);
    }

    @Override
    public int compareTo(GlucoseData another) {
        return (int) (realDate - another.realDate);
    }
}
