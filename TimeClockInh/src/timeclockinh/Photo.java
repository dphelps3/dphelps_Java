
package timeclockinh;

public class Photo extends Sector {
    
    // override the following function
    @Override
	public String fireButton() {
            return "Photo";
        }
        
    @Override
        public String firePlacecode() {
            return "1";
        }
        
    @Override    
        public String fireFileAlias() {
            return "photo";
        }
    
}
