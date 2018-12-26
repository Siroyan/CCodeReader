class Service{
    private String filePath;
    Service(String path){
        filePath = path;
    }
    public void read(){
        RawData rawdata = new RawData();
        System.out.println(rawdata.getRawData(filePath));
    }
}