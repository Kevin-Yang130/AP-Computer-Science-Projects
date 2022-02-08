/*
Author: Kevin Yang-Li
date: 09/15/2021
purpose: create a subclass.
 */

public class WinterMountain extends Mountain{

    private int temp;

    public WinterMountain(int temp, int mountainNumber,int l,int w) {
        super(mountainNumber,l,w);
        this.temp = temp;
    }

    public String getTemp() {
        return "The temperature the Winter Mountain is: " + temp;
    }

}
