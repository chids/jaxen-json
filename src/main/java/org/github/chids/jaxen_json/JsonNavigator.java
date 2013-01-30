package org.github.chids.jaxen_json;

import java.util.Iterator;

import org.jaxen.FunctionCallException;
import org.jaxen.NamedAccessNavigator;
import org.jaxen.UnsupportedAxisException;
import org.jaxen.XPath;
import org.jaxen.saxpath.SAXPathException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;

public final class JsonNavigator implements NamedAccessNavigator {
    private static final Logger LOG = LoggerFactory.getLogger(JsonNavigator.class);
    private static final long serialVersionUID = -6359270025930864975L;

    @Override
    public Iterator<?> getAttributeAxisIterator(final Object contextNode,
                                                final String localName,
                                                final String namespacePrefix,
                                                final String namespaceURI) throws UnsupportedAxisException {
        trace("getAttributeAxisIterator<?> matching: " + ": " + localName + " on: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).findValues(localName).iterator() : null;
    }

    @Override
    public Iterator<?> getChildAxisIterator(final Object contextNode,
                                            final String localName,
                                            final String namespacePrefix,
                                            final String namespaceURI) throws UnsupportedAxisException {
        trace("getChildAxisIterator<?> matching: " + ": " + localName + " on: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).findValues(localName).iterator() : null;
    }

    @Override
    public String getAttributeName(final Object arg0) {
        trace("getAttributeName");
        return null;
    }

    @Override
    public String getAttributeNamespaceUri(final Object arg0) {
        trace("getAttributeNamespaceUri");
        return null;
    }

    @Override
    public String getAttributeQName(final Object arg0) {
        trace("getAttributeQName");
        return null;
    }

    @Override
    public String getAttributeStringValue(final Object arg0) {
        trace("getAttributeStringValue");
        return null;
    }

    @Override
    public String getCommentStringValue(final Object arg0) {
        trace("getCommentStringValue");
        return null;
    }

    @Override
    public String getElementName(final Object contextNode) {
        trace("getElementName: " + contextNode);
        return null;
    }

    @Override
    public String getElementNamespaceUri(final Object contextNode) {
        trace("getElementNamespaceUri: " + contextNode);
        return null;
    }

    @Override
    public String getElementQName(final Object arg0) {
        trace("getElementQName");
        return null;
    }

    @Override
    public String getElementStringValue(final Object arg0) {
        trace("getElementStringValue");
        return null;
    }

    @Override
    public String getNamespacePrefix(final Object arg0) {
        trace("getNamespacePrefix");
        return null;
    }

    @Override
    public String getNamespaceStringValue(final Object arg0) {
        trace("getNamespaceStringValue");
        return null;
    }

    @Override
    public String getTextStringValue(final Object arg0) {
        trace("getTextStringValue");
        return null;
    }

    @Override
    public boolean isAttribute(final Object contextNode) {
        trace("isAttribute: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).isValueNode() : false;
    }

    @Override
    public boolean isElement(final Object contextNode) {
        trace("isElement: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).isValueNode() : false;
    }

    @Override
    public boolean isText(final Object contextNode) {
        trace("isText: " + contextNode);
        return false;
    }

    @Override
    public XPath parseXPath(final String arg0) throws SAXPathException {
        trace("parseXPath");
        return null;
    }

    @Override
    public Iterator<?> getAncestorAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getAncestorAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getAncestorOrSelfAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getAncestorOrSelfAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getAttributeAxisIterator(final Object contextNode) throws UnsupportedAxisException {
        trace("getAttributeAxisIterator: " + contextNode);
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).elements() : null;
    }

    @Override
    public Iterator<?> getChildAxisIterator(final Object contextNode) throws UnsupportedAxisException {
        trace("getChildAxisIterator: " + contextNode);
        return (contextNode instanceof ArrayNode) ? ((ArrayNode)contextNode).iterator() : null;
    }

    @Override
    public Iterator<?> getDescendantAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getDescendantAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getDescendantOrSelfAxisIterator(final Object contextNode) throws UnsupportedAxisException {
        trace("getDescendantOrSelfAxisIterator: " + contextNode.getClass().getSimpleName() + ": " + contextNode);
        return (contextNode instanceof ContainerNode) ? ((ContainerNode<?>)contextNode).iterator() : null;
    }

    @Override
    public Object getDocument(final String arg0) throws FunctionCallException {
        trace("getDocument");
        return null;
    }

    @Override
    public Object getDocumentNode(final Object contextNode) {
        trace("getDocumentNode: " + contextNode);
        return contextNode;
    }

    @Override
    public Object getElementById(final Object arg0, final String arg1) {
        trace("getElementById");
        return null;
    }

    @Override
    public Iterator<?> getFollowingAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getFollowingAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getFollowingSiblingAxisIterator(final Object contextNode) throws UnsupportedAxisException {
        trace("getFollowingSiblingAxisIterator");
        return (contextNode instanceof JsonNode) ? ((JsonNode)contextNode).elements() : null;
    }

    @Override
    public Iterator<?> getNamespaceAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getNamespaceAxisIterator");
        return null;
    }

    @Override
    public short getNodeType(final Object arg0) {
        trace("getNodeType");
        return 0;
    }

    @Override
    public Iterator<?> getParentAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getParentAxisIterator");
        return null;
    }

    @Override
    public Object getParentNode(final Object contextNode) throws UnsupportedAxisException {
        trace("getParentNode: " + contextNode);
        return null;
    }

    @Override
    public Iterator<?> getPrecedingAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getPrecedingAxisIterator");
        return null;
    }

    @Override
    public Iterator<?> getPrecedingSiblingAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getPrecedingSiblingAxisIterator");
        return null;
    }

    @Override
    public String getProcessingInstructionData(final Object arg0) {
        trace("getProcessingInstructionData");
        return null;
    }

    @Override
    public String getProcessingInstructionTarget(final Object arg0) {
        trace("getProcessingInstructionTarget");
        return null;
    }

    @Override
    public Iterator<?> getSelfAxisIterator(final Object arg0) throws UnsupportedAxisException {
        trace("getSelfAxisIterator");
        return null;
    }

    @Override
    public String translateNamespacePrefixToUri(final String arg0, final Object arg1) {
        trace("translateNamespacePrefixToUri");
        return null;
    }

    @Override
    public boolean isComment(final Object arg0) {
        trace("isComment");
        return false;
    }

    @Override
    public boolean isNamespace(final Object arg0) {
        trace("isNamespace");
        return false;
    }

    @Override
    public boolean isProcessingInstruction(final Object arg0) {
        trace("isProcessingInstruction");
        return false;
    }

    @Override
    public boolean isDocument(final Object arg0) {
        trace("isDocument");
        return false;
    }

    private static void trace(final String message) {
        LOG.trace(message);
    }
}