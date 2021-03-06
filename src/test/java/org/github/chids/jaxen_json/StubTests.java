package org.github.chids.jaxen_json;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.github.chids.jaxen_json.JaxenJson;
import org.junit.Before;
import org.junit.Test;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;

public final class StubTests {

    @Test
    public void firstLevelPath() throws Exception {
        test("//name", this.nodes.get("person").get("name"));
    }

    @Test
    public void twoLevelPath() throws Exception {
        test("/person/name/first", new TextNode("mårten"));
    }

    @Test
    public void threeLevelPath() throws Exception {
        test("/person/name/last", new TextNode("gustafson"));
    }

    @Test
    public void array() throws Exception {
        final ArrayNode array = new ArrayNode(JsonNodeFactory.instance);
        array.add(new TextNode("whiskey"));
        array.add(new TextNode("beer"));
        array.add(new TextNode("water"));
        test("/drinks", array);
    }

    @Test
    public void attributeWildcardWithIndex() throws Exception {
        test("/drinks/@*[2]", new TextNode("beer"));
    }

    public void test(final String expression, final JsonNode... expected) throws Exception {
        final Iterator<?> actual = new JaxenJson(expression).selectNodes(this.nodes).iterator();
        for(final Object value : expected) {
            final Object next = actual.next();
            assertEquals("Class", value.getClass().getSimpleName(), next.getClass().getSimpleName());
            assertEquals(expression, value, next);
        }
    }

    @Before
    public void setUp() throws Exception {
        this.nodes = new ObjectMapper().readValue(json, JsonNode.class);
    }

    private JsonNode nodes;
    private static final String json = "{ \"person\": { \"name\": { \"first\": \"mårten\", \"last\": \"gustafson\" } }, \"drinks\": [ \"whiskey\", \"beer\", \"water\" ] }";
}