
package timeclockinh;

public class PunchOutWindow {

    // Declare variables
    private String code;

    public void setCode(String code) {
        this.code = code;
    }
    
    public void getCode() {
        // declare return variable
        //String retVar = "";
        
        // instantiate all sector objects to retrieve info
        Photo tPhoto = new Photo();
        Video tVideo = new Video();
        Programming tProgramming = new Programming();
        SelfDev tSelfDev = new SelfDev();
        
        // if statement for code
        if (code.equals(tPhoto.firePlacecode())) {
            // instantiate the object
            poStructure poBuild = new poStructure();
            poBuild.setKey(tPhoto.fireButton(), tPhoto.firePlacecode());
            poBuild.getKey();
        } else if (code.equals(tVideo.firePlacecode())) {
            poStructure poBuild = new poStructure();
            poBuild.setKey(tVideo.fireButton(), tVideo.firePlacecode());
            poBuild.getKey();
        } else if (code.equals(tProgramming.firePlacecode())) {
            poStructure poBuild = new poStructure();
            poBuild.setKey(tProgramming.fireButton(), tProgramming.firePlacecode());
            poBuild.getKey();
        } else if (code.equals(tSelfDev.firePlacecode())) {
            poStructure poBuild = new poStructure();
            poBuild.setKey(tSelfDev.fireButton(),tSelfDev.firePlacecode());
            poBuild.getKey();
        }
        //return retVar;
    }
    
}
