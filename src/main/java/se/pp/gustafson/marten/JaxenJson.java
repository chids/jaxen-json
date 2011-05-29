package se.pp.gustafson.marten;

import org.jaxen.BaseXPath;
import org.jaxen.JaxenException;

public final class JaxenJson extends BaseXPath
{
    private static final long serialVersionUID = -3836204286658052699L;

    public JaxenJson(final String expression) throws JaxenException
    {
        super(expression, new JsonNavigator());
    }
}