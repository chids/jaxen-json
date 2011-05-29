package se.pp.gustafson.marten;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.Iterator;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Node;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.jaxen.JaxenException;
import org.jaxen.xom.XOMXPath;
import org.junit.Before;
import org.junit.Test;

/**
 * Do some basic tests against JSON and XML output from
 * <a href="https://github.com/Hitta/simplerialize">simplerialize</a>.
 */
public final class SimplerializeTest
{

    @Test
    public void pathToNamedKeyValue() throws Exception
    {
        test("/root/objects/@foo", "bar");
        test("/root/objects/@bar", "baz");
        test("/root/a/b/@name", "value");
    }

    @Test
    public void pathToEntryListWithIndex() throws Exception
    {
        test("/root/primitives/*[3]", "true");
    }

    public void test(final String expression, final String... expected) throws Exception
    {
        final Iterator<?> xml = xml(expression);
        final Iterator<?> json = json(expression);
        assertTrue("xml, no match: " + expression, xml.hasNext());
        assertTrue("json, no match: " + expression, json.hasNext());
        for(final Object value : expected)
        {
            assertEquals("xml", value, ((Node)xml.next()).getValue());
            assertEquals("json", value, ((JsonNode)json.next()).getValueAsText());
        }
    }

    private Iterator<?> json(final String expression) throws JaxenException
    {
        return new JaxenJson(expression).selectNodes(this.json).iterator();
    }

    private Iterator<?> xml(final String expression) throws JaxenException
    {
        return new XOMXPath(expression).selectNodes(this.xml).iterator();
    }

    @Before
    public void setUp() throws Exception
    {
        this.json = new ObjectMapper().readValue(load("simplerialize.json"), JsonNode.class);
        this.xml = new Builder().build(load("simplerialize.xml"));
    }

    public InputStream load(final String name)
    {
        return getClass().getClassLoader().getResourceAsStream(name);
    }

    private JsonNode json;
    private Document xml;

}