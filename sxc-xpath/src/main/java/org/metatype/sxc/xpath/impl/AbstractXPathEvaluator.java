package org.metatype.sxc.xpath.impl;

import org.metatype.sxc.xpath.XPathEvaluator;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import java.io.InputStream;

public abstract class AbstractXPathEvaluator implements XPathEvaluator {

    protected final XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();

    public void evaluate(InputStream stream) throws Exception {
        if (stream == null) {
            throw new NullPointerException("InputStream cannot be null!");
        }
        final XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(stream);
        evaluate(reader);
        reader.close();
    }

    public void evaluate(Source resourceAsSource) throws Exception {
        if (resourceAsSource == null) {
            throw new NullPointerException("Source cannot be null!");
        }
        final XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(resourceAsSource);
        evaluate(reader);
        reader.close();
    }

}
