package se.pp.gustafson.marten;

import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ContainerNode;
import org.jaxen.FunctionCallException;
import org.jaxen.NamedAccessNavigator;
import org.jaxen.UnsupportedAxisException;
import org.jaxen.XPath;
import org.jaxen.saxpath.SAXPathException;

public final class JsonNavigator implements NamedAccessNavigator
{
    private static final long serialVersionUID = -6359270025930864975L;

    @Override
    public Iterator<?> getAttributeAxisIterator(final Object contextNode, final String localName, final String namespacePrefix, final String namespaceURI)
            throws UnsupportedAxisException
    {
        System.err.println("getAttributeAxisIterator<?> matching: " + ": " + localName + " on: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).findValues(localName).iterator() : null;
    }

    @Override
    public Iterator<?> getChildAxisIterator(final Object contextNode, final String localName, final String namespacePrefix, final String namespaceURI)
            throws UnsupportedAxisException
    {
        System.err.println("getChildAxisIterator<?> matching: " + ": " + localName + " on: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).findValues(localName).iterator() : null;
    }

    @Override
    public String getAttributeName(Object arg0)
    {
        System.err.println("getAttributeName");
        return null;
    }

    @Override
    public String getAttributeNamespaceUri(Object arg0)
    {
        System.err.println("getAttributeNamespaceUri");
        return null;
    }

    @Override
    public String getAttributeQName(Object arg0)
    {
        System.err.println("getAttributeQName");
        return null;
    }

    @Override
    public String getAttributeStringValue(Object arg0)
    {
        System.err.println("getAttributeStringValue");
        return null;
    }

    @Override
    public String getCommentStringValue(Object arg0)
    {
        System.err.println("getCommentStringValue");
        return null;
    }

    @Override
    public String getElementName(final Object contextNode)
    {
        System.err.println("getElementName: " + contextNode);
        return null;
    }

    @Override
    public String getElementNamespaceUri(final Object contextNode)
    {
        System.err.println("getElementNamespaceUri: " + contextNode);
        return null;
    }

    @Override
    public String getElementQName(Object arg0)
    {
        System.err.println("getElementQName");
        return null;
    }

    @Override
    public String getElementStringValue(Object arg0)
    {
        System.err.println("getElementStringValue");
        return null;
    }

    @Override
    public String getNamespacePrefix(Object arg0)
    {
        System.err.println("getNamespacePrefix");
        return null;
    }

    @Override
    public String getNamespaceStringValue(Object arg0)
    {
        System.err.println("getNamespaceStringValue");
        return null;
    }

    @Override
    public String getTextStringValue(Object arg0)
    {
        System.err.println("getTextStringValue");
        return null;
    }

    @Override
    public boolean isAttribute(final Object contextNode)
    {
        System.err.println("isAttribute: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).isValueNode() : false;
    }

    @Override
    public boolean isElement(final Object contextNode)
    {
        System.err.println("isElement: " + contextNode);
        //return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).isContainerNode() : false;
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).isValueNode() : false;
    }

    @Override
    public boolean isText(final Object contextNode)
    {
        System.err.println("isText: " + contextNode);
        return false;
    }

    @Override
    public XPath parseXPath(String arg0) throws SAXPathException
    {
        System.err.println("parseXPath");
        return null;
    }

    @Override
    public Iterator<?> getAncestorAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getAncestorAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getAncestorOrSelfAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getAncestorOrSelfAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getAttributeAxisIterator(final Object contextNode) throws UnsupportedAxisException
    {
        System.err.println("getAttributeAxisIterator: " + contextNode);
        if(contextNode instanceof JsonNode)
        {
            return ((JsonNode)contextNode).getElements();
        }
        return null;
    }

    @Override
    public Iterator<?> getChildAxisIterator(final Object contextNode) throws UnsupportedAxisException
    {
        System.err.println("getChildAxisIterator: " + contextNode);
        return (contextNode instanceof ArrayNode) ? ((ArrayNode)contextNode).iterator() : null;
    }

    @Override
    public Iterator<?> getDescendantAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getDescendantAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getDescendantOrSelfAxisIterator(final Object contextNode) throws UnsupportedAxisException
    {
        System.err.println("getDescendantOrSelfAxisIterator: " + contextNode.getClass().getSimpleName() + ": " + contextNode);
        return (contextNode instanceof ContainerNode) ? ((ContainerNode)contextNode).iterator() : null;
    }

    @Override
    public Object getDocument(String arg0) throws FunctionCallException
    {
        System.err.println("getDocument");
        return null;
    }

    @Override
    public Object getDocumentNode(final Object contextNode)
    {
        System.err.println("getDocumentNode: " + contextNode);
        return contextNode;
    }

    @Override
    public Object getElementById(Object arg0, String arg1)
    {
        System.err.println("getElementById");
        return null;
    }

    @Override
    public Iterator<?> getFollowingAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getFollowingAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getFollowingSiblingAxisIterator(final Object contextNode) throws UnsupportedAxisException
    {
        System.err.println("getFollowingSiblingAxisIterator");
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).getElements() : null;
    }

    @Override
    public Iterator<?> getNamespaceAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getNamespaceAxisIterator");
        return null;
    }

    @Override
    public short getNodeType(Object arg0)
    {
        System.err.println("getNodeType");
        return 0;
    }

    @Override
    public Iterator<?> getParentAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getParentAxisIterator");
        return null;
    }

    @Override
    public Object getParentNode(final Object contextNode) throws UnsupportedAxisException
    {
        System.err.println("getParentNode: " + contextNode);
        return null;
    }

    @Override
    public Iterator<?> getPrecedingAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getPrecedingAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getPrecedingSiblingAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getPrecedingSiblingAxisIterator");
        return null;
    }

    @Override
    public String getProcessingInstructionData(Object arg0)
    {
        System.err.println("getProcessingInstructionData");
        return null;
    }

    @Override
    public String getProcessingInstructionTarget(Object arg0)
    {
        System.err.println("getProcessingInstructionTarget");
        return null;
    }

    @Override
    public Iterator<?> getSelfAxisIterator(Object arg0) throws UnsupportedAxisException
    {
        System.err.println("getSelfAxisIterator");
        return null;
    }

    @Override
    public String translateNamespacePrefixToUri(String arg0, Object arg1)
    {
        System.err.println("translateNamespacePrefixToUri");
        return null;
    }

    @Override
    public boolean isComment(Object arg0)
    {
        System.err.println("isComment");
        return false;
    }

    @Override
    public boolean isNamespace(Object arg0)
    {
        System.err.println("isNamespace");
        return false;
    }

    @Override
    public boolean isProcessingInstruction(Object arg0)
    {
        System.err.println("isProcessingInstruction");
        return false;
    }

    @Override
    public boolean isDocument(Object arg0)
    {
        System.err.println("isDocument");
        return false;
    }
}