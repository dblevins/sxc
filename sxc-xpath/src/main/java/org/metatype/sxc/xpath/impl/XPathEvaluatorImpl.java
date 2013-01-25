package org.metatype.sxc.xpath.impl;

import org.metatype.sxc.Context;

import javax.xml.stream.XMLStreamReader;

public class XPathEvaluatorImpl extends AbstractXPathEvaluator {
    private final Context context;

    public XPathEvaluatorImpl(Context context) {
        this.context = context;
    }

    public void evaluate(XMLStreamReader xsr) throws Exception {
        context.createReader().read(xsr);
    }

}
