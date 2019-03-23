package jenkins.model;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import jenkins.model.IdStrategy.CaseSensitive;

public class TestQ4 {

	CaseSensitive cs = new CaseSensitive();
    
	
    @Test public void basicTest(){
    	assertEquals (cs.idFromFilename("file"), "file");
    }
    
    @Test public void ignoreSoloDollarSign(){
    	assertEquals (cs.idFromFilename("file$"), "file");
    }
    
    @Test public void properHex(){
    	assertEquals (cs.idFromFilename("file$0073"), "files");
    }

}
