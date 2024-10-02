package org.launchcode;

public class CD extends  BaseDisc implements OpticalDisc {

//    private final double seqSpeed;

    public CD(String aTitle, double aStorageSize, boolean aReWritable, int aXSpeed) {
        super(aTitle, aStorageSize, aReWritable, aXSpeed);

      seqSpeed = 153.6;//Kbps

    }

    public double getSeqSpeed() {
        return seqSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public double dataTransferRate() {

        return this.getSeqSpeed() * this.getxSpeed();
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to CD using laser");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from CD using laser");
    }

    @Override
    public void reportInfo() {
        System.out.println("\n CD: \n" + this);
    }


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
