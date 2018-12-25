class Service{
    Service(){

    }
    public void read(){
        RawData rawdata = new RawData();
        System.out.println(rawdata.getRawData("../sample.png"));
    }
}