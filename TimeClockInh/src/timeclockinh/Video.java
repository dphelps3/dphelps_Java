
package timeclockinh;

public class Video extends Sector {
    
    // override the following function
    @Override
	public String fireButton() {
            return "Video";
        }
        
    @Override
        public String firePlacecode() {
            return "2";
        }
        
    @Override    
        public String fireFileAlias() {
            return "video";
        }
    
}
