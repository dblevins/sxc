package org.metatype.sxc.xpath;

import javax.xml.stream.XMLStreamException;

import junit.framework.TestCase;
import org.metatype.sxc.xpath.XPathBuilder;
import org.metatype.sxc.xpath.XPathEvaluator;
import org.metatype.sxc.xpath.XPathEvent;
import org.metatype.sxc.xpath.XPathEventHandler;

public class StarTest extends TestCase {
    boolean match;
    
    public void testNonMatchedText() throws Exception {

        XPathEventHandler eventHandler = new XPathEventHandler() {

            public void onMatch(XPathEvent event) throws XMLStreamException {
                match = true;
            }
            
        };
        
        XPathBuilder builder = new XPathBuilder();
        builder.listen("/*/global", eventHandler);
        
        XPathEvaluator evaluator = builder.compile();
        evaluator.evaluate(getClass().getResourceAsStream("global.xml"));
        
        assertTrue(match);
    }
}
